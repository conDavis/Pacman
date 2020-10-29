import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import javalib.funworld.*;
import javalib.funworld.WorldScene;
import javalib.worldimages.CircleImage;
import javalib.worldimages.EmptyImage;
import javalib.worldimages.LineImage;
import javalib.worldimages.OutlineMode;
import javalib.worldimages.OverlayImage;
import javalib.worldimages.OverlayOffsetImage;
import javalib.worldimages.Posn;
import javalib.worldimages.RectangleImage;
import javalib.worldimages.TriangleImage;
import javalib.worldimages.VisiblePinholeImage;
import javalib.worldimages.*;
import tester.Tester;



// holds constants for game of pacman
interface IGameOfPacman {
  int TILE_SIZE = 30;
  int PAC_RADIUS = 11;
  int FLASH_RATE = 2;
  int ERROR_MARGIN = TILE_SIZE / 2;
  // points constants
  int DOT_REWARD = 10;
  int SUPER_REWARD = 50;
  int GHOST_REWARD = 200;
  // direction constants
  String LEFT = "left";
  String RIGHT = "right";
  String UP = "up";
  String DOWN = "down";
  // ghost starts index constants
  int BLINKY_INDEX = 0;
  int INKY_INDEX = 1;
  int PINKY_INDEX = 2;
  int CLYDE_INDEX = 3;
}

// a utility class for general methods
class Utils implements IGameOfPacman, IGhost {

  // would a pacman at the given position facing the given direction hit a wall in his direction? 
  boolean hitsWall(String dir, Posn pos) {
    if (dir.equals(LEFT)) {
      return (pos.x + (TILE_SIZE / 2)) % TILE_SIZE == 0;
    }
    else if(dir.equals(RIGHT)) {
      return (pos.x+ (TILE_SIZE / 2)) % TILE_SIZE == 0;
    }
    else if(dir.equals(UP)) {
      return (pos.y+ (TILE_SIZE / 2)) % TILE_SIZE == 0;
    }
    else {
      return (pos.y+ (TILE_SIZE / 2)) % TILE_SIZE == 0;
    }
  }

  // returns the tile posn that a pacman at the given posn's front or face is in.
  Posn facePosn(String dir, Posn pos) {
    if (dir.equals(LEFT)) {
      return new Posn((pos.x - PAC_RADIUS) / TILE_SIZE, pos.y / TILE_SIZE);
    }
    else if(dir.equals(RIGHT)) {
      return new Posn((pos.x + PAC_RADIUS) / TILE_SIZE, pos.y / TILE_SIZE);
    }
    else if(dir.equals(UP)) {
      return new Posn(pos.x / TILE_SIZE, (pos.y - PAC_RADIUS) / TILE_SIZE);
    }
    else {
      return new Posn(pos.x / TILE_SIZE, (pos.y + PAC_RADIUS) / TILE_SIZE);
    }
  }

  // returns the pixel posn of a pacman at the given posn's front or face.
  Posn facePixelPosn(String dir, Posn pos) {
    if (dir.equals(LEFT)) {
      return new Posn((pos.x - PAC_RADIUS), pos.y);
    }
    else if(dir.equals(RIGHT)) {
      return new Posn((pos.x + PAC_RADIUS), pos.y);
    }
    else if(dir.equals(UP)) {
      return new Posn(pos.x, (pos.y - PAC_RADIUS));
    }
    else {
      return new Posn(pos.x, (pos.y + PAC_RADIUS));

    }
  }

  // returns the pixel posn of a pacman at the given posn's side 1 
  //  - side one in left and right direction is the top side
  //  - side one in the up and down direction is the left side
  Posn side1PixelPosn(String dir, Posn pos) {
    if (dir.equals(LEFT)) {
      return new Posn(pos.x , (pos.y - PAC_RADIUS) );
    }
    else if(dir.equals(RIGHT)) {
      return new Posn(pos.x , (pos.y - PAC_RADIUS) );
    }
    else if(dir.equals(UP)) {
      return new Posn((pos.x - PAC_RADIUS) , pos.y );
    }
    else {
      return new Posn((pos.x - PAC_RADIUS) , pos.y );
    }
  }

  // returns the pixel posn of a pacman at the given posn's side 2
  //  - in the left and right direction side 2 is the bottom side
  //  - in the up and down direction side 2 is the right side
  Posn side2PixelPosn(String dir, Posn pos) {
    if (dir.equals(LEFT)) {
      return new Posn(pos.x , (pos.y + PAC_RADIUS) );
    }
    else if(dir.equals(RIGHT)) {
      return new Posn(pos.x , (pos.y + PAC_RADIUS) );
    }
    else if(dir.equals(UP)) {
      return new Posn((pos.x + PAC_RADIUS), pos.y );
    }
    else {
      return new Posn((pos.x + PAC_RADIUS) , pos.y );
    }
  }


  // returns the pixel posn of the rear of a pacman at the given posn
  // - rear side is always the side opposite the mouth
  Posn rearPixelPosn(String dir, Posn pos) {
    if (dir.equals(LEFT)) {
      return new Posn((pos.x + PAC_RADIUS) , pos.y );
    }
    else if(dir.equals(RIGHT)) {
      return new Posn((pos.x - PAC_RADIUS) , pos.y );
    }
    else if(dir.equals(UP)) {
      return new Posn(pos.x, (pos.y + PAC_RADIUS) );
    }
    else {
      return new Posn(pos.x , (pos.y - PAC_RADIUS) );
    }
  }


  // returns a list of tile posns representing points the front side of a pacman at the given posn
  ArrayList<Posn> edgePosns(String dir, Posn pos) {
    ArrayList<Posn> result = new ArrayList<Posn>();
    if (dir.equals(LEFT)) {
      result.add( new Posn((pos.x - PAC_RADIUS) / TILE_SIZE, pos.y / TILE_SIZE));
      result.add(new Posn((pos.x - PAC_RADIUS) / TILE_SIZE, (pos.y - PAC_RADIUS)/ TILE_SIZE));
      result.add(new Posn((pos.x - PAC_RADIUS) / TILE_SIZE, (pos.y + PAC_RADIUS)/ TILE_SIZE));
    }
    else if(dir.equals(RIGHT)) {
      result.add(new Posn((pos.x + PAC_RADIUS) / TILE_SIZE, pos.y / TILE_SIZE));
      result.add(new Posn((pos.x + PAC_RADIUS) / TILE_SIZE, (pos.y - PAC_RADIUS)/ TILE_SIZE));
      result.add(new Posn((pos.x + PAC_RADIUS) / TILE_SIZE, (pos.y + PAC_RADIUS)/ TILE_SIZE));
    }
    else if(dir.equals(UP)) {
      result.add(new Posn(pos.x / TILE_SIZE, (pos.y - PAC_RADIUS) / TILE_SIZE));
      result.add(new Posn((pos.x - PAC_RADIUS) / TILE_SIZE, (pos.y - PAC_RADIUS) / TILE_SIZE));
      result.add(new Posn((pos.x + PAC_RADIUS) / TILE_SIZE, (pos.y - PAC_RADIUS) / TILE_SIZE));
    }
    else {
      result.add(new Posn(pos.x / TILE_SIZE, (pos.y + PAC_RADIUS) / TILE_SIZE));
      result.add(new Posn((pos.x - PAC_RADIUS)/ TILE_SIZE, (pos.y + PAC_RADIUS) / TILE_SIZE));
      result.add(new Posn((pos.x + PAC_RADIUS)/ TILE_SIZE, (pos.y + PAC_RADIUS) / TILE_SIZE));

    }
    return result;
  }

  //returns the correct image for ghost eyes given the direction
  OverlayOffsetImage getEyes(String dir) {
    if (dir.equals(LEFT)) {
      return leftEyes;
    }
    else if(dir.equals(RIGHT)) {
      return rightEyes;
    }
    else if(dir.equals(UP)) {
      return upEyes;
    }
    else {
      return downEyes;
    }
  }

  //returns the opposite direction to the given direction 
  String oppositeDir(String dir) {
    if (dir.equals(LEFT)) {
      return RIGHT;
    }
    else if(dir.equals(RIGHT)) {
      return LEFT;
    }
    else if(dir.equals(UP)) {
      return DOWN;
    }
    else {
      return UP;
    }
  }

  //returns all the possible directions in an arraylist
  // - up, down, left, right
  ArrayList<String> allPossibleDirs() {
    ArrayList<String> result = new ArrayList<String>();
    result.add(LEFT);
    result.add(RIGHT);
    result.add(UP);
    result.add(DOWN);

    return result;
  }

  //calculates the distance between the two given tile posns on the cartesian plane
  double distanceBetween(Posn pos1, Posn pos2) {
    return Math.sqrt( Math.pow((pos1.x - pos2.x), 2)  +  Math.pow((pos1.y - pos2.y), 2));
  }

  //returns the position next to the given position in the given direction
  Posn nextPosn (Posn pos, String dir) {
    if (dir.equals(LEFT)) {
      return new Posn(pos.x - 1, pos.y);
    }
    else if(dir.equals(RIGHT)) {
      return new Posn(pos.x + 1, pos.y);
    }
    else if(dir.equals(UP)) {
      return new Posn(pos.x, pos.y - 1);
    }
    else {
      return new Posn(pos.x, pos.y + 1);
    }
  }

  //is the given tile posn is on screen with a screen of size ncol by nrow?
  boolean onScreen(Posn pos, int ncol, int nrow) {
    return pos.x >= 0 && pos.y >= 0 && pos.x <ncol && pos.y < nrow;
  }

  //returns a new score based on the currentScore and the supers and dots consumed
  int calcScore(Pacman pacman, Supers supers, ArrayList<Posn> dots, int currScore) {
    int result = currScore ;
    if (pacman.eatsDot(dots)) {
      result = result + DOT_REWARD;
    }
    if (pacman.eatsSuper(supers)) {
      result = result + SUPER_REWARD;
    }

    return result;
  }

  //returns the number of pixels off this posn is from being centered in a tile for the x axis
  int calcXOffset(Posn pos) {
    int halfPoint = (pos.x / TILE_SIZE) * TILE_SIZE + (TILE_SIZE / 2);
    if (pos.x < halfPoint) {
      return halfPoint - pos.x;
    } else if (pos.x > halfPoint) {
      return pos.x - halfPoint;
    } else {
      return 0;
    }
  }

  //returns the number of pixels off the given posn is from being centered in a tile for the y axis
  int calcYOffset(Posn pos) {
    int halfPoint = (pos.y / TILE_SIZE) * TILE_SIZE + (TILE_SIZE / 2);
    if (pos.y < halfPoint) {
      return halfPoint - pos.y;
    } else if (pos.y > halfPoint) {
      return pos.y - halfPoint;
    } else {
      return 0;
    }
  }

  // is this posn's offset from center in the x axis within the error margin?
  boolean xOffsetInMargin(Posn pos) {
    return this.calcXOffset(pos) < ERROR_MARGIN;
  }

  // is this posn's offset from center in the y axis within the error margin?
  boolean yOffsetInMargin(Posn pos) {
    return this.calcYOffset(pos) < ERROR_MARGIN;
  }

  //creates the final scene for a game of pacman, that includes final score and whether or not the user won
  WorldScene finalScene(int score, int ncol, int nrow, WorldScene bg, boolean lost) {
    RectangleImage base = new RectangleImage((ncol - 1) * TILE_SIZE, TILE_SIZE * 4 + 10, OutlineMode.SOLID, Color.black);
    TextImage finalScoreLost = new TextImage("YOU DIED. FINALSCORE : " + score, 49, FontStyle.BOLD_ITALIC,
        Color.RED);
    TextImage finalScoreWon = new TextImage("YOU WON! FINALSCORE : " + score, 49, FontStyle.BOLD_ITALIC,
        Color.RED);
    TextImage pacUP = new TextImage("PAC IT UP.", 49, FontStyle.BOLD_ITALIC,
        Color.RED);
    TextImage pacMan = new TextImage("YOU'RE THE (PAC)MAN!.", 49, FontStyle.BOLD_ITALIC,
        Color.RED);
    if (lost) {
      OverlayOffsetImage result = new OverlayOffsetImage(pacUP, 0, -TILE_SIZE,
          new OverlayOffsetImage(finalScoreLost, 0, TILE_SIZE , base));
      return bg.placeImageXY(result, TILE_SIZE * (ncol / 2), TILE_SIZE * (nrow / 2));
    } else {
      OverlayOffsetImage result = new OverlayOffsetImage(pacMan, 0, -TILE_SIZE,
          new OverlayOffsetImage(finalScoreWon, 0, TILE_SIZE , base));
      return bg.placeImageXY(result, TILE_SIZE * (ncol / 2), TILE_SIZE * (nrow / 2));
    }
    
  }
  
  // outputs a random direction out of up, down, left, and right
  String randomDir(String dir) {
    ArrayList<String> possibleDirs = this.allPossibleDirs();
    int index = new Random().nextInt(possibleDirs.size());
    String randDir = possibleDirs.get(index);
    if (!randDir.equals(this.oppositeDir(dir))) {
      return randDir;
    } else {
      return this.randomDir(dir);
    }
  }

}

// represents the superfood pellets that pacman eats
class Supers implements IGameOfPacman {
  boolean visible;
  ArrayList<Posn> posns;
  int count;

  // the constructor
  Supers(boolean visible, ArrayList<Posn> posns, int count) {
    this.visible = visible;
    this.posns = posns;
    this.count = count;
  }

  //convenience constructor with default true visibility
  Supers(ArrayList<Posn> posns) {
    this.visible = true;
    this.posns = posns;
    this.count = 5;
  }

  //changes the visibility of this supers based on the count 
  Supers flash() {
    if (count == 0) {
      return new Supers(!this.visible, this.posns, FLASH_RATE);
    } else {
      return new Supers(this.visible, this.posns, count-1);
    }
  }

  //renders this supers on the given Worldscene
  WorldScene drawSupers(WorldScene img) {
    return new ArrayListUtils().drawSupers(this.visible, this.posns, img);
  }

  //removes the posns of supers which have been eaten from this super's posns
  Supers removeEaten(Pacman pacman) {
    return new Supers(this.visible, new ArrayListUtils().removeEaten(pacman, this.posns), this.count);
  }

  // does this supers have a posn at the given pos?
  boolean hasSuperAt(Posn pos) {
    for (Posn posn : this.posns) {
      if (posn.x == pos.x && posn.y == pos.y) {
        return true;
      }
    }

    return false;
  }
  
  // are there no posns left in this supers' posn list
  boolean noneLeft() {
    return this.posns.size() == 0;
  }
}


//represents a tile on the board in the game of pac-man
class Tile implements IGameOfPacman{
  Posn position;
  ArrayList<String> walls;

  // the constructor 
  Tile(Posn position, ArrayList<String> walls) {
    this.position = position;
    this.walls = walls;
  }


  //renders this tile on the given WorldScene
  WorldScene drawTile(WorldScene bg) {
    WorldImage base = 
        new OverlayImage(new RectangleImage(TILE_SIZE, TILE_SIZE, OutlineMode.SOLID, Color.black), new EmptyImage());
    LineImage leftRightWall = new LineImage(new Posn(0, TILE_SIZE), Color.blue);
    leftRightWall.movePinhole(0, TILE_SIZE/2);
    LineImage upDownWall = new LineImage(new Posn(TILE_SIZE, 0), Color.blue);
    upDownWall.movePinhole(TILE_SIZE/2, 0);
    // better way to do this ? 
    OverlayOffsetImage tile = new OverlayOffsetImage(base, 0 , 0, base);

    // iterates through all the walls that this cell has
    for (String wall : this.walls) {
      // if wall is an up wall
      if (wall.equals(UP)) {
        tile = 
            new OverlayOffsetImage(
                upDownWall,
                0,
                TILE_SIZE/2,
                tile);
      }
      // if wall is a down wall
      if (wall.equals(DOWN)) {
        tile = 
            new OverlayOffsetImage(
                upDownWall,
                0,
                -(TILE_SIZE/2-1),
                tile);
      }
      // if wall is a left wall
      else if (wall.equals(LEFT)) {
        tile = 
            new OverlayOffsetImage(
                leftRightWall,
                TILE_SIZE/2,
                0,
                tile);
      }
      // if wall is a right wall
      else if (wall.equals(RIGHT)) {
        tile = 
            new OverlayOffsetImage(
                leftRightWall,
                -(TILE_SIZE/2-1),
                0,
                tile);
      }

    }
    return bg.placeImageXY(tile, TILE_SIZE * this.position.x + TILE_SIZE/2, TILE_SIZE * this.position.y+TILE_SIZE/2);


  }
}




// represents the pacman
class Pacman implements IGameOfPacman{
  Posn pos;
  boolean mouthOpen;
  String dir;
  int lives;



  // the constructor
  Pacman(Posn pos, boolean mouthOpen, String dir, int lives) {
    this.pos = pos; // true position in pixels of the center of pac-man
    this.mouthOpen = mouthOpen;
    this.dir = dir;
    this.lives = lives;
  }

  // convenience constructor giving this pacman three lives
  Pacman(Posn pos, boolean mouthOpen, String dir) {
    this.pos = pos; // true position in pixels of the center of pac-man
    this.mouthOpen = mouthOpen;
    this.dir = dir;
    this.lives = 3;
  }

  // renders this pacman on the given worldscene
  WorldScene drawPacman(WorldScene img) {
    CircleImage body = new CircleImage(PAC_RADIUS, OutlineMode.SOLID, Color.yellow);
    TriangleImage leftMouth = new TriangleImage(
        new Posn(0, 5), new Posn(15, 15), new Posn(0, 25), OutlineMode.SOLID, Color.black);
    TriangleImage rightMouth = new TriangleImage(
        new Posn(30, 5), new Posn(15, 15), new Posn(30, 25), OutlineMode.SOLID, Color.black);
    TriangleImage upMouth = new TriangleImage(
        new Posn(5, 0), new Posn(15, 15), new Posn(25, 0), OutlineMode.SOLID, Color.black);
    TriangleImage downMouth = new TriangleImage(
        new Posn(5, 30), new Posn(15, 15), new Posn(25, 30), OutlineMode.SOLID, Color.black);

    OverlayOffsetImage result;

    // if this pacman's mouth is open
    if (this.mouthOpen) {
      //if this pacman's direction is left
      if (this.dir.equals(LEFT)) {
        result = new OverlayOffsetImage(
            leftMouth, 
            9, 
            0, 
            body);
      } 
      //if this pacman's direction is right
      else if (this.dir.equals(RIGHT)) {
        result = new OverlayOffsetImage(
            rightMouth, 
            -9, 
            0, 
            body);
      }
      //if this pacman's direction is up
      else if (this.dir.equals(UP)) {
        result = new OverlayOffsetImage(
            upMouth, 
            0, 
            7, 
            body);
      }
      //if this pacman's direction is down
      else {
        result = new OverlayOffsetImage(
            downMouth, 
            0, 
            -9, 
            body);
      }
      return img.placeImageXY(result, this.pos.x, this.pos.y);
    } 
    else {
      return img.placeImageXY(body, this.pos.x, this.pos.y);
    }



  }

  //returns a new pacman like this pacman but with a position moved in the direction of this pacman
  // separate into smaller methods!!!!!!!!!!!!!!!!!!!!!
  Pacman movePacman(ArrayList<Tile> board, int ncol, int nrow) {
    int xOffset = new Utils().calcXOffset(this.pos);
    int yOffset = new Utils().calcYOffset(this.pos);
    boolean canMove = new ArrayListUtils().canMove(this.pos, this.dir, board);
    Pacman stillPacman = new Pacman(this.pos, true, this.dir, this.lives);

    // if pacman cannot move at his current location with his current dir
    if(!canMove) {
      boolean canMoveWithPosXOffset = new ArrayListUtils().canMove(new Posn(this.pos.x + xOffset, this.pos.y),
          this.dir, board);
      boolean canMoveWithNegXOffset = new ArrayListUtils().canMove(new Posn(this.pos.x - xOffset, this.pos.y),
          this.dir, board);
      boolean canMoveWithPosYOffset = new ArrayListUtils().canMove(new Posn(this.pos.x, this.pos.y + yOffset),
          this.dir, board);
      boolean canMoveWithNegYOffset = new ArrayListUtils().canMove(new Posn(this.pos.x, this.pos.y - yOffset),
          this.dir, board);
      // if he can move with a slightly altered x pos
      if (new Utils().xOffsetInMargin(this.pos) && 
          (canMoveWithPosXOffset || canMoveWithNegXOffset)) {
        // if he can move with a positive x offset
        if (canMoveWithPosXOffset) {
          return this.moveWithXOffset(xOffset);
        }
        // if he can move with a negative x offset
        else if (canMoveWithNegXOffset){
          return this.moveWithXOffset(-xOffset);
        } else {
          return stillPacman;
        }
      }
      // if he can move with a slightly altered y pos
      else if (new Utils().yOffsetInMargin(this.pos) && 
          (canMoveWithPosYOffset || canMoveWithNegYOffset)) {
        // if he can move with a positive y offset
        if (canMoveWithPosYOffset) {
          return this.moveWithYOffset(yOffset);
        }
        // if he can move with a negative y offset
        else if (canMoveWithNegYOffset){
          return this.moveWithYOffset(-yOffset);
        }
        else {
          return stillPacman;
        }
      } else {
        return stillPacman;
      }
    }
    // if pacman is on the board and can move in his dir
    else if (new ArrayListUtils().hasTileAt(new Utils().facePosn(this.dir, this.pos), board) && canMove) {
      if (this.dir.equals(LEFT)) {
        return new Pacman(new Posn(this.pos.x - TILE_SIZE/5, this.pos.y), !this.mouthOpen, this.dir, this.lives);
      }
      else if (this.dir.equals(RIGHT)) {
        return new Pacman(new Posn(this.pos.x + TILE_SIZE/5, this.pos.y), !this.mouthOpen, this.dir, this.lives);
      }
      else if (this.dir.equals(UP)) {
        return new Pacman(new Posn(this.pos.x, this.pos.y - TILE_SIZE/5), !this.mouthOpen, this.dir, this.lives);
      }
      else {
        return new Pacman(new Posn(this.pos.x, this.pos.y + TILE_SIZE/5), !this.mouthOpen, this.dir, this.lives);
      }
    }
    // if pacman is in a tunnel
    else {
        return this.tunnelMovement(ncol, nrow);
    }


  }
  
  // moves this pacman in his direction, but with the given adjustment to the y coordinate
  Pacman moveWithYOffset(int yOffset) {
    if (this.dir.equals(LEFT)) {
      return new Pacman(new Posn(this.pos.x - TILE_SIZE/5, this.pos.y + yOffset), !this.mouthOpen, this.dir, this.lives);
    }
    else if (this.dir.equals(RIGHT)) {
      return new Pacman(new Posn(this.pos.x + TILE_SIZE/5, this.pos.y + yOffset), !this.mouthOpen, this.dir, this.lives);
    }
    else if (this.dir.equals(UP)) {
      return new Pacman(new Posn(this.pos.x , this.pos.y + yOffset - TILE_SIZE/5), !this.mouthOpen, this.dir, this.lives);
    }
    else {
      return new Pacman(new Posn(this.pos.x , this.pos.y + yOffset + TILE_SIZE/5), !this.mouthOpen, this.dir, this.lives);
    }
  }
  
  // moves this pacman in his direction, but with the given adjustment to the y coordinate
  Pacman moveWithXOffset(int xOffset) {
    if (this.dir.equals(LEFT)) {
      return new Pacman(new Posn(this.pos.x + xOffset - TILE_SIZE/5, this.pos.y), !this.mouthOpen, this.dir, this.lives);
    }
    else if (this.dir.equals(RIGHT)) {
      return new Pacman(new Posn(this.pos.x + xOffset + TILE_SIZE/5, this.pos.y), !this.mouthOpen, this.dir, this.lives);
    }
    else if (this.dir.equals(UP)) {
      return new Pacman(new Posn(this.pos.x + xOffset, this.pos.y - TILE_SIZE/5), !this.mouthOpen, this.dir, this.lives);
    }
    else {
      return new Pacman(new Posn(this.pos.x + xOffset, this.pos.y + TILE_SIZE/5), !this.mouthOpen, this.dir, this.lives);
    }
  }
  
  // moves this pacman that is inside a tunnel to the opposite end of the tunnel
  Pacman tunnelMovement(int ncol, int nrow) {
    if (this.dir.equals(LEFT)) {
      return new Pacman(new Posn(ncol * TILE_SIZE - TILE_SIZE/2,  this.pos.y), !this.mouthOpen, this.dir, this.lives);
    }
    else if (this.dir.equals(RIGHT)) {
      return new Pacman(new Posn( TILE_SIZE/2, this.pos.y), !this.mouthOpen, this.dir, this.lives);
    }
    else if (this.dir.equals(UP)) {
      return new Pacman(new Posn(this.pos.x, nrow * TILE_SIZE + TILE_SIZE/2), !this.mouthOpen, this.dir, this.lives);
    }
    else {
      return new Pacman(new Posn(this.pos.x, 0 - TILE_SIZE/2), !this.mouthOpen, this.dir, this.lives);
    
  }
  }
  

  // returns a new pacman like this pacman but with the given direction
  Pacman setDir(String dir) {
    return new Pacman(this.pos, this.mouthOpen, dir, this.lives);
  }

  //is this pacman in the given tile position ?
  // needs work .... 
  // should maybe be if the front half or center of pacman is in the tile?
  boolean samePosn(Posn pos) {
    return this.pos.x / TILE_SIZE == pos.x &&  this.pos.y / TILE_SIZE == pos.y;    
  }

  //is this pacman on screen?
  // cut down -- is every line here necessary? 
  boolean onScreen(ArrayList<Tile> board) {
    Posn facePosn = new Utils().facePosn(this.dir, this.pos);
    Posn facePixelPosn = new Utils().facePixelPosn(this.dir, this.pos);
    Posn side1PixelPosn = new Utils().side1PixelPosn(this.dir, this.pos);
    Posn side2PixelPosn = new Utils().side2PixelPosn(this.dir, this.pos);
    Posn rearPixelPosn = new Utils().rearPixelPosn(this.dir, this.pos);
    return
        this.pos.x > -1 && this.pos.y > -1 &&
        facePixelPosn.x > -1 &&
        side1PixelPosn.x > -1 && side2PixelPosn.x > -1 &&
        rearPixelPosn.x > -1 &&
        new ArrayListUtils().hasTileAt(facePosn, board) &&
        new ArrayListUtils().hasTileAt(new Posn(side1PixelPosn.x / TILE_SIZE, side1PixelPosn.y / TILE_SIZE), board) && 
        new ArrayListUtils().hasTileAt(new Posn(side2PixelPosn.x / TILE_SIZE, side2PixelPosn.y / TILE_SIZE), board) && 
        new ArrayListUtils().hasTileAt(new Posn(rearPixelPosn.x / TILE_SIZE, rearPixelPosn.y / TILE_SIZE), board);
  }

  // is this pacman in any of the given tile positions?
  boolean eatsDot(ArrayList<Posn> dots) {
    for (Posn pos : dots) {
      if (this.samePosn(pos)) {
        return true;
      }
    }
    return false;
  }

  // does this pacman share a tile position with any of the posns of the given supers
  boolean eatsSuper(Supers supers) {
    return supers.hasSuperAt(new Posn(this.pos.x / TILE_SIZE, this.pos.y / TILE_SIZE));
  }

  
  // renders the number of lives that this pacman has on the given worldscene
  WorldScene drawLives(int ncol, int nrow, WorldScene img) {
    TextImage score = new TextImage("LIVES : " + this.lives, 20, FontStyle.BOLD, Color.RED);
    return img.placeImageXY(score, ncol / 2 * TILE_SIZE, (nrow - 2) / 2 * TILE_SIZE + TILE_SIZE / 2);
  }

  // is the given ghost in the same tile as this pacman?
  boolean collides(AGhost ghost) {
    Posn tilePosn = new Posn(this.pos.x / TILE_SIZE, this.pos.y / TILE_SIZE);
    return ghost.sameTile(tilePosn);
  }

  // places this pacman at its default position that is given and subtracts a life as this pacman has died
  Pacman resetPacman(Posn pacStart) {
    return new Pacman(new Posn(pacStart.x * TILE_SIZE + TILE_SIZE / 2, pacStart.y * TILE_SIZE + TILE_SIZE / 2),
        this.mouthOpen,
        this.dir, this.lives - 1);
  }

  // is this pacman dead? -- does he have zero lives ? 
  boolean dead() {
    return this.lives == 0;
  }
  
  // returns the tile position of the center of this pacman
  Posn tilePosn() {
    return new Posn(this.pos.x / TILE_SIZE, this.pos.y / TILE_SIZE);
  }


}

// holds constants for the AGHOST class
interface IGhost {

  // blinky images
  RectangleImage blinkyBase = new RectangleImage(26, 12, OutlineMode.SOLID, Color.red);
  CircleImage blinkyHead = new CircleImage(13, OutlineMode.SOLID, Color.red);
  CircleImage blinkyFoot = new CircleImage(4, OutlineMode.SOLID, Color.red);

  OverlayOffsetImage blinky = new OverlayOffsetImage(
      new OverlayOffsetImage(
          new OverlayOffsetImage(
              new OverlayOffsetImage(
                  blinkyHead, 0, 11, blinkyBase), 0, 15, blinkyFoot), 8, 13, blinkyFoot), -9, 13, blinkyFoot);

  // inky images
  RectangleImage inkyBase = new RectangleImage(26, 12, OutlineMode.SOLID, Color.cyan);
  CircleImage inkyHead = new CircleImage(13, OutlineMode.SOLID, Color.cyan);
  CircleImage inkyFoot = new CircleImage(4, OutlineMode.SOLID, Color.cyan);


  OverlayOffsetImage inky = new OverlayOffsetImage(
      new OverlayOffsetImage(
          new OverlayOffsetImage(
              new OverlayOffsetImage(
                  inkyHead, 0, 11, inkyBase), 0, 15, inkyFoot), 8, 13, inkyFoot), -9, 13, inkyFoot);

  // pinky images
  RectangleImage pinkyBase = new RectangleImage(26, 12, OutlineMode.SOLID, Color.pink);
  CircleImage pinkyHead = new CircleImage(13, OutlineMode.SOLID, Color.pink);
  CircleImage pinkyFoot = new CircleImage(4, OutlineMode.SOLID, Color.pink);


  OverlayOffsetImage pinky = new OverlayOffsetImage(
      new OverlayOffsetImage(
          new OverlayOffsetImage(
              new OverlayOffsetImage(
                  pinkyHead, 0, 11, pinkyBase), 0, 15, pinkyFoot), 8, 13, pinkyFoot), -9, 13, pinkyFoot);

  // clyde images
  RectangleImage clydeBase = new RectangleImage(26, 12, OutlineMode.SOLID, Color.orange);
  CircleImage clydeHead = new CircleImage(13, OutlineMode.SOLID, Color.orange);
  CircleImage clydeFoot = new CircleImage(4, OutlineMode.SOLID, Color.orange);

  OverlayOffsetImage clyde = new OverlayOffsetImage(
      new OverlayOffsetImage(
          new OverlayOffsetImage(
              new OverlayOffsetImage(
                  clydeHead, 0, 11, clydeBase), 0, 15, clydeFoot), 8, 13, clydeFoot), -9, 13, clydeFoot);
  
  
  // frightened images
  RectangleImage frightBase = new RectangleImage(26, 12, OutlineMode.SOLID, Color.blue);
  CircleImage frightHead = new CircleImage(13, OutlineMode.SOLID, Color.blue);
  CircleImage frightFoot = new CircleImage(4, OutlineMode.SOLID, Color.blue);

  OverlayOffsetImage frightened = new OverlayOffsetImage(
      new OverlayOffsetImage(
          new OverlayOffsetImage(
              new OverlayOffsetImage(
                  frightHead, 0, 11, frightBase), 0, 15, frightFoot), 8, 13, frightFoot), -9, 13, frightFoot);

  // eyeball images
  CircleImage eyeWhite = new CircleImage(6, OutlineMode.SOLID, Color.white);
  CircleImage pupil = new CircleImage(3, OutlineMode.SOLID, Color.black);
  OverlayOffsetImage eyeWhites = new OverlayOffsetImage(eyeWhite, 10, 0, eyeWhite);
  OverlayOffsetImage pupils = new OverlayOffsetImage(pupil, 10, 0, pupil);
  OverlayOffsetImage upEyes = new OverlayOffsetImage(pupils, 0, 3, eyeWhites);
  OverlayOffsetImage downEyes = new OverlayOffsetImage(pupils, 0, -3, eyeWhites);
  OverlayOffsetImage leftEyes = new OverlayOffsetImage(pupils, 3, 0, eyeWhites);
  OverlayOffsetImage rightEyes = new OverlayOffsetImage(pupils, -3, 0, eyeWhites);
  
  //movement mode constants
  String SCATTER = "scatter";
  String CHASE = "chase";
  String FRIGHT = "frightened";
  
  // duration constants
  int SCATTER_DUR = 140;  // 7 seconds 
  int CHASE_DUR = 400;    // 20 seconds
  int FRIGHT_DUR = 200;   // 10 seconds 
 


}

// abstract class to represent common features/functions of ghosts : blinky, pinky, inky, and clyde
abstract class AGhost implements IGameOfPacman, IGhost {
  Posn pos; 
  String dir;
  String movement;
  int duration;

  // constructor
  AGhost(Posn pos, String dir, String movement, int duration) {
    this.pos = pos;
    this.dir = dir;
    this.movement = movement;
    this.duration = duration;
  }
  
  // convenience constructor that sets the duration to the default : 20
  AGhost(Posn pos, String dir, String movement) {
    this(pos, dir, movement, SCATTER_DUR);
  }
  
  //convenience constructor that sets the movement to the default : "scatter"
  AGhost(Posn pos, String dir) {
    this(pos, dir, SCATTER);
  }

  //renders this ghost on the given worldscene
  WorldScene drawGhost(WorldScene img) {
    if(this.movement.equals(FRIGHT)) {
      OverlayOffsetImage result = new OverlayOffsetImage(new Utils().getEyes(this.dir), 0 , 5, frightened);
      return img.placeImageXY(result, this.pos.x, this.pos.y);
    } else {
      OverlayOffsetImage result = new OverlayOffsetImage(new Utils().getEyes(this.dir), 0 , 5, this.getBody());
      return img.placeImageXY(result, this.pos.x, this.pos.y);
    }


  }

  // returns the base image for this ghost
  abstract OverlayOffsetImage getBody();

  // for the move function we will use the model from the AWeapon class
  AGhost moveGhost(ArrayList<Tile> board, int ncol, int nrow, Posn pacPosn, boolean superEaten) {
    return this.copyGhost().moveBy(board, ncol, nrow, TILE_SIZE / 5, pacPosn, superEaten);
  }

  //returns an exact copy of this ghost
  abstract AGhost copyGhost();

  // returns a new ghost like this ghost but moved by the given offset and with the direction
  // that suits this ghosts goal
  // cut down?
  AGhost moveBy(ArrayList<Tile> board, int ncol, int nrow, int offset, Posn pacPosn, boolean superEaten) {
    if (superEaten) {
      this.movement = FRIGHT;
      this.duration = FRIGHT_DUR;
      return this;
    } else if (this.movement.equals("scatter") || this.movement.equals(CHASE)) {
      return this.moveToGoal(board, ncol, nrow, offset, pacPosn);
    } else if (this.movement.equals(FRIGHT)) {
     return this.moveRandomly(board, ncol, nrow, offset);
    }  else {
      return this;
    }

  }
  // moves this ghost in scatter mode
  AGhost moveToGoal(ArrayList<Tile> board, int ncol, int nrow, int offset, Posn pacPosn) {
    if (this.duration == 0 && this.movement.equals("scatter")) {
      this.movement = CHASE;
      this.duration = CHASE_DUR;
      return this;
    } else if (this.duration == 0 && this.movement.equals(CHASE)) {
      this.movement = SCATTER;
      this.duration = SCATTER_DUR;
      return this;
    }
    else 
    {
    if (new ArrayListUtils().allOnScreen(new Utils().edgePosns(this.dir, this.pos), ncol, nrow)) {
      if (new ArrayListUtils().hasTileAt(new Posn(this.pos.x / TILE_SIZE, this.pos.y / TILE_SIZE), board)
          && this.pos.x < (ncol * TILE_SIZE + offset)) {

        if (new ArrayListUtils().canMove(this.pos, this.dir, board)) {
          if (this.dir.equals(LEFT)) {
            this.pos = new Posn(this.pos.x - offset, this.pos.y);
          } else if (this.dir.equals(RIGHT)) {
            this.pos = new Posn(this.pos.x + offset, this.pos.y);
          } else if (this.dir.equals(UP)) {
            this.pos = new Posn(this.pos.x, this.pos.y - offset);
          } else {
            this.pos = new Posn(this.pos.x, this.pos.y + offset);
          }
          this.dir = this.findBestDir(board, ncol, nrow, pacPosn);

          this.duration = this.duration - 1;
          return this;
        } else {
          this.dir = this.findBestDir(board, ncol, nrow, pacPosn);
          this.duration = this.duration - 1;
          return this;

        }
      } else {
        return this;
      }
    }else {
      if (this.dir.equals(LEFT)) {
        // could be improved?
        this.pos = new Posn(ncol * TILE_SIZE - TILE_SIZE/2,  this.pos.y);
        this.duration = this.duration - 1;

        return this;
      }
      else if (this.dir.equals(RIGHT)) {
        this.pos = new Posn(TILE_SIZE / 2, this.pos.y);
        this.duration = this.duration - 1;

        return this;
      }
      else if (this.dir.equals(UP)) {
        this.pos = new Posn(this.pos.x, nrow * TILE_SIZE + TILE_SIZE/2);
        this.duration = this.duration - 1;

        return this;
      }
      else {
        this.pos = new Posn(this.pos.x, 0 - TILE_SIZE/2);
        this.duration = this.duration - 1;

        return this;
      }
    }
    }
  }
  
  // moves this ghost in scatter mode
    AGhost moveRandomly(ArrayList<Tile> board, int ncol, int nrow, int offset) {
    if (this.duration == 0) {
      this.movement = SCATTER;
      this.duration = SCATTER_DUR;
      return this;
    } else 
    {
    if (new ArrayListUtils().allOnScreen(new Utils().edgePosns(this.dir, this.pos), ncol, nrow)) {
      if (new ArrayListUtils().hasTileAt(new Posn(this.pos.x / TILE_SIZE, this.pos.y / TILE_SIZE), board)
          && this.pos.x < (ncol * TILE_SIZE + offset)) {

        if (new ArrayListUtils().canMove(this.pos, this.dir, board)) {
          if (this.dir.equals(LEFT)) {
            this.pos = new Posn(this.pos.x - offset, this.pos.y);
          } else if (this.dir.equals(RIGHT)) {
            this.pos = new Posn(this.pos.x + offset, this.pos.y);
          } else if (this.dir.equals(UP)) {
            this.pos = new Posn(this.pos.x, this.pos.y - offset);
          } else {
            this.pos = new Posn(this.pos.x, this.pos.y + offset);
          }
          this.duration = this.duration - 1;
          if (this.duration % 25 == 0) {
            this.dir = new Utils().randomDir(this.dir);
          }
          return this;
        } else {
          this.dir = new Utils().randomDir(this.dir);
          this.duration = this.duration - 1;
          return this;

        }
      } else {
        return this;
      }
    }else {
      if (this.dir.equals(LEFT)) {
        // could be improved?
        this.pos = new Posn(ncol * TILE_SIZE - TILE_SIZE/2,  this.pos.y);
        this.duration = this.duration - 1;

        return this;
      }
      else if (this.dir.equals(RIGHT)) {
        this.pos = new Posn(TILE_SIZE / 2, this.pos.y);
        this.duration = this.duration - 1;

        return this;
      }
      else if (this.dir.equals(UP)) {
        this.pos = new Posn(this.pos.x, nrow * TILE_SIZE + TILE_SIZE/2);
        this.duration = this.duration - 1;

        return this;
      }
      else {
        this.pos = new Posn(this.pos.x, 0 - TILE_SIZE/2);
        this.duration = this.duration - 1;

        return this;
      }
    }
    }
  }
  



  // returns the goal posn of this ghost in scatter mode
  abstract Posn getGoalPosn(int ncol, int nrow, Posn pacPosn);

  // returns the best direction for this ghost to travel in based on its goal posn
  String findBestDir(ArrayList<Tile> board, int ncol, int nrow, Posn pacPosn) {
    ArrayList<String> allPossibleDirs = new Utils().allPossibleDirs();
    String oppositeDir = new Utils().oppositeDir(this.dir);
    ArrayList<String> possibleDirs = new ArrayList<String>();
    for (String dir : allPossibleDirs) {
      if (!dir.equals(oppositeDir) && new ArrayListUtils().canMove(this.pos, dir, board)) {
        possibleDirs.add(dir);
      }
    }

    return new ArrayListUtils().shortestPathDir(board, this.pos, this.getGoalPosn(ncol, nrow, pacPosn), possibleDirs);
  }

  // is this ghost in the given tile position ?
  boolean sameTile(Posn posn) {
    return this.pos.x / TILE_SIZE == posn.x && this.pos.y / TILE_SIZE == posn.y;
  }

  //resets this ghost to its starting position which is given
  AGhost resetGhost(Posn posn) {
    this.dir = UP;
    this.pos = new Posn(posn.x * TILE_SIZE + TILE_SIZE/2, posn.y * TILE_SIZE + TILE_SIZE/2);
    this.movement = SCATTER;
    this.duration = SCATTER_DUR;
    return this;
  }
  
  // is this ghost in frightened movement mode
  boolean frightened() {
    return this.movement.equals(FRIGHT);
  }
}

//represents Inky the ghost
class Inky extends AGhost implements IGhost {

  // the constructor
  Inky(Posn pos, String dir, String movement, int duration) { 
    super(pos, dir, movement, duration);
  }
  
  //convenience constructor that sets the duration to the deafult : 20
  Inky(Posn pos, String dir, String movement) { 
    super(pos, dir, movement);
  }
  
  // convenienve constructor with default scatter movement
  Inky(Posn pos, String dir) { 
    super(pos, dir);
  }

  // convenienve constructor with default direction
  Inky(Posn pos) { 
    super(pos, UP);
  }

  //renders the body (without eyes) of this inky
  OverlayOffsetImage getBody() {
    return inky;
  }

  // returns a copy of this inky
  Inky copyGhost() {
    return new Inky(this.pos, this.dir, this.movement, this.duration); 
  }

  // returns this inky's goal in scatter mode 
  Posn getGoalPosn(int ncol, int nrow, Posn pacPosn) {
    if (this.movement.equals(SCATTER)) {
      return new Posn(ncol - 1, nrow - 1);
    } else {
      return new Posn(pacPosn.x - 4, pacPosn.y);
    }
  }
}

//represents Blinky the ghost
class Blinky extends AGhost implements IGhost, IGameOfPacman {


  // the constructor
  Blinky(Posn pos, String dir, String movement, int duration) { 
    super(pos, dir, movement, duration);
  }
  
  // convenience constructor that sets the duration to the default : 20
  Blinky(Posn pos, String dir, String movement) { 
    super(pos, dir, movement);
  }
  
  // convenience constructor with the default movement of scatter
  Blinky(Posn pos, String dir) { 
    super(pos, dir);
  }

  // convenienve constructor with default direction
  Blinky(Posn pos) { 
    super(pos, UP);
  }

  //renders the body (without eyes) of this blinky
  OverlayOffsetImage getBody() {
    return blinky;
  }

  //returns a copy of this blinky
  AGhost copyGhost() {
    return new Blinky(this.pos, this.dir, this.movement, this.duration); 
  }

  // returns this blinky's goal in scatter mode
  Posn getGoalPosn(int ncol, int nrow, Posn pacPosn) {
    if (this.movement.equals(SCATTER)) {
      return new Posn(ncol - 1, 0);
    } else {
      return pacPosn;
    }
  }
}

//represents Pinky the ghost
class Pinky extends AGhost implements IGhost {


  // the constructor
  Pinky(Posn pos, String dir, String movement, int duration) { 
    super(pos, dir, movement, duration);
  }

  
  // convenience constructor that sets the duration to the default : 20
  Pinky(Posn pos, String dir, String movement) { 
    super(pos, dir, movement);
  }

  // convenience constructor with the default movement of scatter
  Pinky(Posn pos, String dir) { 
    super(pos, dir);
  }

  // convenienve constructor with default direction
  Pinky(Posn pos) { 
    super(pos, UP);
  }


  //renders the body (without eyes) of this pinky
  OverlayOffsetImage getBody() {
    return pinky;
  }

  //returns a copy of this pinky
  AGhost copyGhost() {
    return new Pinky(this.pos, this.dir, this.movement, this.duration); 
  }

  // returns this pinky's goal in scatter mode
  Posn getGoalPosn(int ncol, int nrow, Posn pacPosn) {
    if (this.movement.equals(SCATTER)) {
      return new Posn(0, 0);
    } else {
      return new Posn(pacPosn.x + 4, pacPosn.y);
    }
  }
}


//represents Clyde the ghost
class Clyde extends AGhost implements IGhost {

  // the constructor
  Clyde(Posn pos, String dir, String movement, int duration) { 
    super(pos, dir, movement, duration);
  } 
  
  //convenience constructor that sets the duration to the default : 20
  Clyde(Posn pos, String dir, String movement) { 
    super(pos, dir, movement);
  } 
  
  // convenience constructor with the default movement of scatter
  Clyde(Posn pos, String dir) { 
    super(pos, dir);
  }

  // convenienve constructor with default direction
  Clyde(Posn pos) { 
    super(pos, UP);
  }


  //renders the body (without eyes) of this clyde
  OverlayOffsetImage getBody() {
    return clyde;
  }

  //returns an exact copy of this clyde
  AGhost copyGhost() {
    return new Clyde(this.pos, this.dir, this.movement, this.duration); 
  }

  // returns this clyde's goal posn in scatter mode
  Posn getGoalPosn(int ncol, int nrow, Posn pacPosn) {
    if (this.movement.equals(SCATTER)) {
      return new Posn(0, nrow - 1);
    } else {
      if (new Utils().distanceBetween(new Posn(this.pos.x / TILE_SIZE, this.pos.y / TILE_SIZE), pacPosn) < 8) {
        return pacPosn;
      } else {
        return new Posn(0, nrow - 1);
      }
    }
  }
}



// represents a game of pacman
class GameOfPacman extends World implements IGameOfPacman {
  ArrayList<Tile> board;
  ArrayList<Posn> dots;
  Supers supers;
  int ncol;
  int nrow;
  Pacman pacman;
  AGhost blinky;
  AGhost inky;
  AGhost pinky; 
  AGhost clyde;
  int score;
  Posn pacStart;
  ArrayList<Posn> ghostStarts;
  boolean worldOver;


  // the constructor
  GameOfPacman(ArrayList<Tile> board, ArrayList<Posn> dots, Supers supers, int ncol, int nrow, Pacman pacman,
      AGhost blinky, AGhost inky, AGhost pinky, AGhost clyde, int score, Posn pacStart,
      ArrayList<Posn> ghostStarts, boolean worldOver) {
    this.board = board;
    this.dots = dots;
    this.supers = supers;
    this.ncol = ncol;
    this.nrow = nrow;
    this.pacman = pacman;
    this.blinky = blinky;
    this.inky = inky;
    this.pinky = pinky;
    this.clyde = clyde;
    this.score = score;
    this.pacStart = pacStart;
    this.ghostStarts = ghostStarts;
    this.worldOver = worldOver;
  }


  GameOfPacman(ArrayList<Tile> board, ArrayList<Posn> dots, Supers supers, int ncol, int nrow, int score, Posn pacStart, ArrayList<Posn> ghostStarts) {
    this(board, dots, supers, ncol, nrow,
        new Pacman(new Posn(pacStart.x * TILE_SIZE + TILE_SIZE/2, pacStart.y * TILE_SIZE  + TILE_SIZE/2), true, RIGHT),
        new Blinky(new Posn(ghostStarts.get(BLINKY_INDEX).x * TILE_SIZE + TILE_SIZE / 2, ghostStarts.get(BLINKY_INDEX).y * TILE_SIZE + TILE_SIZE / 2)),
        new Inky(new Posn(ghostStarts.get(INKY_INDEX).x * TILE_SIZE + TILE_SIZE / 2, ghostStarts.get(INKY_INDEX).y * TILE_SIZE + TILE_SIZE / 2)),
        new Pinky(new Posn(ghostStarts.get(PINKY_INDEX).x * TILE_SIZE + TILE_SIZE / 2, ghostStarts.get(PINKY_INDEX).y * TILE_SIZE + TILE_SIZE / 2)),
        new Clyde(new Posn(ghostStarts.get(CLYDE_INDEX).x * TILE_SIZE + TILE_SIZE / 2, ghostStarts.get(CLYDE_INDEX).y * TILE_SIZE + TILE_SIZE / 2)), score,
        pacStart, ghostStarts, false);
  }



  // renders a game of pacman
  public WorldScene makeScene() {
    WorldScene bg = new WorldScene(this.nrow  + 1* TILE_SIZE, this.ncol * TILE_SIZE);
    RectangleImage blackbg = new RectangleImage(this.ncol * TILE_SIZE, (this.nrow  + 1)* TILE_SIZE, OutlineMode.SOLID, Color.black);
    return 
        this.pacman.drawLives(ncol, nrow,
            this.drawScore(
                this.clyde.drawGhost(
                    this.pinky.drawGhost(
                        this.inky.drawGhost(
                            this.blinky.drawGhost(
                                this.pacman.drawPacman(
                                    this.supers.drawSupers(new ArrayListUtils().drawDots(
                                        this.dots, new ArrayListUtils().drawBoard(
                                            this.board, bg.placeImageXY(blackbg, (TILE_SIZE * (ncol )) / 2, (TILE_SIZE * (nrow + 1)) / 2)))))))))));
  }

  //updates this game of pacman every tic
  public GameOfPacman onTick() {
    // if pacman has no lives left
    if (pacman.dead() || (this.dots.size() == 0 && this.supers.noneLeft())) {
      return new GameOfPacman(this.board, this.dots, this.supers,
          this.ncol, this.nrow, this.pacman, this.blinky,
          this.inky, this.pinky, this.clyde,
          new Utils().calcScore(this.pacman, this.supers, this.dots, this.score), this.pacStart, this.ghostStarts, true);
    } else {
      if (// if pacman collides with an unfrightened ghost
          pacman.collides(this.blinky) && !blinky.frightened() || 
          pacman.collides(this.inky) && !inky.frightened() ||
          pacman.collides(this.pinky) && !pinky.frightened() ||
          pacman.collides(this.clyde) && !clyde.frightened()) {
        return new GameOfPacman(this.board, new ArrayListUtils().removeEaten(this.pacman, this.dots), this.supers.removeEaten(this.pacman).flash(),
            this.ncol, this.nrow, this.pacman.resetPacman(pacStart), this.blinky.resetGhost(this.ghostStarts.get(BLINKY_INDEX)),
            this.inky.resetGhost(this.ghostStarts.get(INKY_INDEX)), this.pinky.resetGhost(this.ghostStarts.get(PINKY_INDEX)), this.clyde.resetGhost(this.ghostStarts.get(CLYDE_INDEX)),
            new Utils().calcScore(this.pacman, this.supers, this.dots, this.score), this.pacStart, this.ghostStarts, this.worldOver);
      } // if pacman collides with frightened blinky
      else if (pacman.collides(this.blinky) && blinky.frightened()) {
        return new GameOfPacman(this.board, new ArrayListUtils().removeEaten(this.pacman, this.dots), this.supers.removeEaten(this.pacman).flash(),
            this.ncol, this.nrow, this.pacman, this.blinky.resetGhost(this.ghostStarts.get(BLINKY_INDEX)),
            this.inky, this.pinky, this.clyde,
            new Utils().calcScore(this.pacman, this.supers, this.dots, this.score) + GHOST_REWARD, this.pacStart, this.ghostStarts, this.worldOver);
      } // if pacman collides with frightened inky 
      else if (pacman.collides(this.inky) && inky.frightened()) {
        return new GameOfPacman(this.board, new ArrayListUtils().removeEaten(this.pacman, this.dots), this.supers.removeEaten(this.pacman).flash(),
            this.ncol, this.nrow, this.pacman, this.blinky,
            this.inky.resetGhost(this.ghostStarts.get(INKY_INDEX)), this.pinky, this.clyde,
            new Utils().calcScore(this.pacman, this.supers, this.dots, this.score) + GHOST_REWARD, this.pacStart, this.ghostStarts, this.worldOver);
      } // if pacman collides with frightened pinky
      else if (pacman.collides(this.pinky) && pinky.frightened()) {
        return new GameOfPacman(this.board, new ArrayListUtils().removeEaten(this.pacman, this.dots), this.supers.removeEaten(this.pacman).flash(),
            this.ncol, this.nrow, this.pacman, this.blinky,
            this.inky, this.pinky.resetGhost(this.ghostStarts.get(PINKY_INDEX)), this.clyde,
            new Utils().calcScore(this.pacman, this.supers, this.dots, this.score) + GHOST_REWARD, this.pacStart, this.ghostStarts, this.worldOver);
      } // if pacman collides with frightened clyde
      else if (pacman.collides(this.clyde) && clyde.frightened()) {
        return new GameOfPacman(this.board, new ArrayListUtils().removeEaten(this.pacman, this.dots), this.supers.removeEaten(this.pacman).flash(),
            this.ncol, this.nrow, this.pacman, this.blinky,
            this.inky, this.pinky, this.clyde.resetGhost(this.ghostStarts.get(CLYDE_INDEX)),
            new Utils().calcScore(this.pacman, this.supers, this.dots, this.score) + GHOST_REWARD, this.pacStart, this.ghostStarts, this.worldOver);
      } // if none of the above happens
      else {
        return new GameOfPacman(this.board, new ArrayListUtils().removeEaten(this.pacman, this.dots), this.supers.removeEaten(this.pacman).flash(),
            this.ncol, this.nrow, this.pacman.movePacman(this.board, this.ncol, this.nrow), this.blinky.moveGhost(this.board, ncol, nrow, this.pacman.tilePosn(), this.pacman.eatsSuper(this.supers)),
            this.inky.moveGhost(this.board, ncol, nrow, this.pacman.tilePosn(), this.pacman.eatsSuper(this.supers)), this.pinky.moveGhost(this.board, ncol, nrow, this.pacman.tilePosn(), this.pacman.eatsSuper(this.supers)), 
            this.clyde.moveGhost(this.board, ncol, nrow, this.pacman.tilePosn(), this.pacman.eatsSuper(this.supers)),
            new Utils().calcScore(this.pacman, this.supers, this.dots, this.score), this.pacStart, this.ghostStarts, this.worldOver);
      }
    }


  }

  //updates this game of pacman based on given keyEvent
  public GameOfPacman onKeyEvent(String key) {
    if (this.pacman.onScreen(this.board)) {
      if (key.equals(UP)) {
        return new GameOfPacman(this.board, this.dots, this.supers, this.ncol, 
            this.nrow, this.pacman.setDir(UP), this.blinky, this.inky, this.pinky, this.clyde, this.score, this.pacStart, this.ghostStarts, this.worldOver);
      }
      else if (key.equals(DOWN)) {
        return new GameOfPacman(this.board, this.dots, this.supers, this.ncol,
            this.nrow, this.pacman.setDir(DOWN), this.blinky, this.inky, this.pinky, this.clyde, this.score, this.pacStart, this.ghostStarts, this.worldOver);
      }
      else if (key.equals(LEFT)) {
        return new GameOfPacman(this.board, this.dots, this.supers, this.ncol,
            this.nrow, this.pacman.setDir(LEFT), this.blinky, this.inky, this.pinky, this.clyde, this.score, this.pacStart, this.ghostStarts, this.worldOver);
      }
      else if (key.equals(RIGHT)) {
        return new GameOfPacman(this.board, this.dots, this.supers, this.ncol,
            this.nrow, this.pacman.setDir(RIGHT), this.blinky, this.inky, this.pinky, this.clyde, this.score, this.pacStart, this.ghostStarts, this.worldOver);
      } else {
        return this;
      }
    }
    else {
      return this;
    }
  }

  // renders the score of this game on the given worldscene
  WorldScene drawScore(WorldScene img) {
    TextImage score = new TextImage("SCORE : " + this.score, 20, FontStyle.BOLD, Color.RED);
    return img.placeImageXY(score, TILE_SIZE * 3, this.nrow * TILE_SIZE + TILE_SIZE / 2);
  }


  // returns a worldend based on whether or not this game of pacman is over
  public WorldEnd worldEnds() {
    if (this.worldOver) {
      return new WorldEnd(true, this.makeFinalScene());
    } else {
      return new WorldEnd(false, this.makeFinalScene());
    }
  }

  // renders the end screen of this game of pacman
  WorldScene makeFinalScene() {
    return new Utils().finalScene(this.score, this.ncol, this.nrow, this.makeScene(), this.pacman.dead());
  }







}

// a utility class for methods on arraylists
class ArrayListUtils implements IGameOfPacman{

  // draws each tile on the given list of tiles on the given image
  WorldScene drawBoard(ArrayList<Tile> src, WorldScene img) {
    WorldScene result = img;
    // draws each cell in the given source list of cells onto the given image
    for (Tile tile : src) {
      result = tile.drawTile(result);
    }
    return result;
  }

  // draws a dot on the tiles that correspond to the given list of posns on the given img
  WorldScene drawDots(ArrayList<Posn> src, WorldScene img) {
    WorldScene result = img;
    CircleImage dot = new CircleImage(5, OutlineMode.SOLID, new Color(217, 209, 93));
    // draws a dot at each posn in the given source list of cells onto the given image
    for (Posn pos : src) {
      result = result.placeImageXY(dot, pos.x * TILE_SIZE + TILE_SIZE/2, pos.y * TILE_SIZE  + TILE_SIZE/2);
    }
    return result;
  }

  // draws a super on the tiles that correspond to the given list of posns on the given img
  WorldScene drawSupers(boolean visible, ArrayList<Posn> src, WorldScene img) {
    WorldScene result = img;
    if (visible) {
      CircleImage dot = new CircleImage(10, OutlineMode.SOLID, new Color(217, 209, 93));
      // draws a dot at each posn in the given source list of cells onto the given image
      for (Posn pos : src) {
        result = result.placeImageXY(dot, pos.x * TILE_SIZE + TILE_SIZE/2, pos.y * TILE_SIZE  + TILE_SIZE/2);
      }
    } 
    return result;
  }

  // can the a pacman at the given posn move forward in the given direction on the given board
  boolean canMove(Posn pos, String dir, ArrayList<Tile> src) {
    ArrayList<Posn> edgePosns = new Utils().edgePosns(dir, pos);
    for (Tile tile : src) {
      if (edgePosns.contains(tile.position) &&
          tile.walls.contains(dir) && 
          new Utils().hitsWall(dir, pos)) {
        return false;
      }
    }
    return true;
  }

  // is there a tile with the given posn in the given arraylist of tile
  boolean hasTileAt(Posn pos, ArrayList<Tile> src) {
    for (Tile tile : src) {
      if (tile.position.x == pos.x && tile.position.y == pos.y) {
        return true;
      }
    }
    return false;
  }

  // returns a new arraylist like the given arraylist but with eaten posns removed?
  ArrayList<Posn> removeEaten(Pacman pacman, ArrayList<Posn> src) {
    ArrayList<Posn> result = new ArrayList<Posn>();
    for (Posn pos : src) {
      if (pacman.samePosn(pos)) {
        // do nothing
      } else {
        result.add(pos);
      }
    }
    return result;
  }

  // returns the dir that will result in being closest to the given goal posn
  String shortestPathDir(ArrayList<Tile> board, Posn pos, Posn goal, ArrayList<String> src) {
    Posn currTilePosn = new Posn(pos.x / TILE_SIZE, pos.y / TILE_SIZE);
    if (src.size() > 1) {
      Double minPath = new Utils().distanceBetween(goal, new Utils().nextPosn(
          currTilePosn, src.get(0)));
      String minPathDir = src.get(0);
      for (String dir : src) {
        Double dirPath = new Utils().distanceBetween(goal, new Utils().nextPosn(
            currTilePosn, dir));
        if (dirPath < minPath) {
          minPath = dirPath;
          minPathDir = dir;
        }

      }

      return minPathDir;
    }
    return src.get(0);

  }

  // are all the posns in the given list on a screen of size ncol by nrow?
  boolean allOnScreen(ArrayList<Posn> src, int ncol, int nrow) {
    for (Posn pos : src) {
      if (new Utils().onScreen(pos, ncol, nrow) == false) {
        return false;
      }
    }

    return true;
  }

}



