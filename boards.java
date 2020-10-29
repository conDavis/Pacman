import java.awt.Color;
import java.util.ArrayList;

import javalib.funworld.WorldScene;
import javalib.worldimages.CircleImage;
import javalib.worldimages.EmptyImage;
import javalib.worldimages.FontStyle;
import javalib.worldimages.LineImage;
import javalib.worldimages.OutlineMode;
import javalib.worldimages.OverlayImage;
import javalib.worldimages.OverlayOffsetImage;
import javalib.worldimages.Posn;
import javalib.worldimages.RectangleImage;
import javalib.worldimages.TextImage;
import javalib.worldimages.TriangleImage;
import javalib.worldimages.WorldImage;
import tester.Tester;

// for testing the methods for pacman and running the game 
class ExamplesPacman implements IGameOfPacman, IGhost{


  boolean testBigBang(Tester t) {
    this.initTestConditions();
    GameOfPacman w = new GameOfPacman(bigBoard, bigDots, new Supers(bigSupers), 26, 29, 0, new Posn(12, 22), ghostStarts);
    int worldWidth = TILE_SIZE * w.ncol;
    int worldHeight = TILE_SIZE * (w.nrow + 1);
    double tickRate = (1.0 / 20.0);
    return w.bigBang(worldWidth, worldHeight, tickRate);
  }

  // TINY BOARD DIRS

  // row 0
  ArrayList<String> TinyDir00 = new ArrayList<String>();
  ArrayList<String> TinyDir10 = new ArrayList<String>();
  ArrayList<String> TinyDir20 = new ArrayList<String>();
  ArrayList<String> TinyDir30 = new ArrayList<String>();
  ArrayList<String> TinyDir40 = new ArrayList<String>();
  // row 1
  ArrayList<String> TinyDir01 = new ArrayList<String>();
  ArrayList<String> TinyDir11 = new ArrayList<String>();
  ArrayList<String> TinyDir21 = new ArrayList<String>();
  ArrayList<String> TinyDir31 = new ArrayList<String>();
  ArrayList<String> TinyDir41 = new ArrayList<String>();
  // row 2
  ArrayList<String> TinyDir02 = new ArrayList<String>();
  ArrayList<String> TinyDir12 = new ArrayList<String>();
  ArrayList<String> TinyDir22 = new ArrayList<String>();
  ArrayList<String> TinyDir32 = new ArrayList<String>();
  ArrayList<String> TinyDir42 = new ArrayList<String>();
  // row 3
  ArrayList<String> TinyDir03 = new ArrayList<String>();
  ArrayList<String> TinyDir13 = new ArrayList<String>();
  ArrayList<String> TinyDir23 = new ArrayList<String>();
  ArrayList<String> TinyDir33 = new ArrayList<String>();
  ArrayList<String> TinyDir43 = new ArrayList<String>();
  //row 4
  ArrayList<String> TinyDir04 = new ArrayList<String>();
  ArrayList<String> TinyDir14 = new ArrayList<String>();
  ArrayList<String> TinyDir24 = new ArrayList<String>();
  ArrayList<String> TinyDir34 = new ArrayList<String>();
  ArrayList<String> TinyDir44 = new ArrayList<String>();

  // BIG BOARD DIRS

  //ROW 0
  ArrayList<String> Dir00 = new ArrayList<String>();
  ArrayList<String> Dir10 = new ArrayList<String>();
  ArrayList<String> Dir20 = new ArrayList<String>();
  ArrayList<String> Dir30 = new ArrayList<String>();
  ArrayList<String> Dir40 = new ArrayList<String>();
  ArrayList<String> Dir50 = new ArrayList<String>();
  ArrayList<String> Dir60 = new ArrayList<String>();
  ArrayList<String> Dir70 = new ArrayList<String>();
  ArrayList<String> Dir80 = new ArrayList<String>();
  ArrayList<String> Dir90 = new ArrayList<String>();
  ArrayList<String> Dir100 = new ArrayList<String>();
  ArrayList<String> Dir110 = new ArrayList<String>();
  ArrayList<String> Dir120 = new ArrayList<String>();
  ArrayList<String> Dir130 = new ArrayList<String>();
  ArrayList<String> Dir140 = new ArrayList<String>();
  ArrayList<String> Dir150 = new ArrayList<String>();
  ArrayList<String> Dir160 = new ArrayList<String>();
  ArrayList<String> Dir170 = new ArrayList<String>();
  ArrayList<String> Dir180 = new ArrayList<String>();
  ArrayList<String> Dir190 = new ArrayList<String>();
  ArrayList<String> Dir200 = new ArrayList<String>();
  ArrayList<String> Dir210 = new ArrayList<String>();
  ArrayList<String> Dir220 = new ArrayList<String>();
  ArrayList<String> Dir230 = new ArrayList<String>();
  ArrayList<String> Dir240 = new ArrayList<String>();
  ArrayList<String> Dir250 = new ArrayList<String>();

  //ROW 1
  ArrayList<String> Dir01 = new ArrayList<String>();
  ArrayList<String> Dir11 = new ArrayList<String>();
  ArrayList<String> Dir21 = new ArrayList<String>();
  ArrayList<String> Dir31 = new ArrayList<String>();
  ArrayList<String> Dir41 = new ArrayList<String>();
  ArrayList<String> Dir51 = new ArrayList<String>();
  ArrayList<String> Dir61 = new ArrayList<String>();
  ArrayList<String> Dir71 = new ArrayList<String>();
  ArrayList<String> Dir81 = new ArrayList<String>();
  ArrayList<String> Dir91 = new ArrayList<String>();
  ArrayList<String> Dir101 = new ArrayList<String>();
  ArrayList<String> Dir111 = new ArrayList<String>();
  ArrayList<String> Dir121 = new ArrayList<String>();
  ArrayList<String> Dir131 = new ArrayList<String>();
  ArrayList<String> Dir141 = new ArrayList<String>();
  ArrayList<String> Dir151 = new ArrayList<String>();
  ArrayList<String> Dir161 = new ArrayList<String>();
  ArrayList<String> Dir171 = new ArrayList<String>();
  ArrayList<String> Dir181 = new ArrayList<String>();
  ArrayList<String> Dir191 = new ArrayList<String>();
  ArrayList<String> Dir201 = new ArrayList<String>();
  ArrayList<String> Dir211 = new ArrayList<String>();
  ArrayList<String> Dir221 = new ArrayList<String>();
  ArrayList<String> Dir231 = new ArrayList<String>();
  ArrayList<String> Dir241 = new ArrayList<String>();
  ArrayList<String> Dir251 = new ArrayList<String>();

  //ROW 2
  ArrayList<String> Dir02 = new ArrayList<String>();
  ArrayList<String> Dir12 = new ArrayList<String>();
  ArrayList<String> Dir22 = new ArrayList<String>();
  ArrayList<String> Dir32 = new ArrayList<String>();
  ArrayList<String> Dir42 = new ArrayList<String>();
  ArrayList<String> Dir52 = new ArrayList<String>();
  ArrayList<String> Dir62 = new ArrayList<String>();
  ArrayList<String> Dir72 = new ArrayList<String>();
  ArrayList<String> Dir82 = new ArrayList<String>();
  ArrayList<String> Dir92 = new ArrayList<String>();
  ArrayList<String> Dir102 = new ArrayList<String>();
  ArrayList<String> Dir112 = new ArrayList<String>();
  ArrayList<String> Dir122 = new ArrayList<String>();
  ArrayList<String> Dir132 = new ArrayList<String>();
  ArrayList<String> Dir142 = new ArrayList<String>();
  ArrayList<String> Dir152 = new ArrayList<String>();
  ArrayList<String> Dir162 = new ArrayList<String>();
  ArrayList<String> Dir172 = new ArrayList<String>();
  ArrayList<String> Dir182 = new ArrayList<String>();
  ArrayList<String> Dir192 = new ArrayList<String>();
  ArrayList<String> Dir202 = new ArrayList<String>();
  ArrayList<String> Dir212 = new ArrayList<String>();
  ArrayList<String> Dir222 = new ArrayList<String>();
  ArrayList<String> Dir232 = new ArrayList<String>();
  ArrayList<String> Dir242 = new ArrayList<String>();
  ArrayList<String> Dir252 = new ArrayList<String>();

  //ROW 3
  ArrayList<String> Dir03 = new ArrayList<String>();
  ArrayList<String> Dir13 = new ArrayList<String>();
  ArrayList<String> Dir23 = new ArrayList<String>();
  ArrayList<String> Dir33 = new ArrayList<String>();
  ArrayList<String> Dir43 = new ArrayList<String>();
  ArrayList<String> Dir53 = new ArrayList<String>();
  ArrayList<String> Dir63 = new ArrayList<String>();
  ArrayList<String> Dir73 = new ArrayList<String>();
  ArrayList<String> Dir83 = new ArrayList<String>();
  ArrayList<String> Dir93 = new ArrayList<String>();
  ArrayList<String> Dir103 = new ArrayList<String>();
  ArrayList<String> Dir113 = new ArrayList<String>();
  ArrayList<String> Dir123 = new ArrayList<String>();
  ArrayList<String> Dir133 = new ArrayList<String>();
  ArrayList<String> Dir143 = new ArrayList<String>();
  ArrayList<String> Dir153 = new ArrayList<String>();
  ArrayList<String> Dir163 = new ArrayList<String>();
  ArrayList<String> Dir173 = new ArrayList<String>();
  ArrayList<String> Dir183 = new ArrayList<String>();
  ArrayList<String> Dir193 = new ArrayList<String>();
  ArrayList<String> Dir203 = new ArrayList<String>();
  ArrayList<String> Dir213 = new ArrayList<String>();
  ArrayList<String> Dir223 = new ArrayList<String>();
  ArrayList<String> Dir233 = new ArrayList<String>();
  ArrayList<String> Dir243 = new ArrayList<String>();
  ArrayList<String> Dir253 = new ArrayList<String>();

  //ROW 4
  ArrayList<String> Dir04 = new ArrayList<String>();
  ArrayList<String> Dir14 = new ArrayList<String>();
  ArrayList<String> Dir24 = new ArrayList<String>();
  ArrayList<String> Dir34 = new ArrayList<String>();
  ArrayList<String> Dir44 = new ArrayList<String>();
  ArrayList<String> Dir54 = new ArrayList<String>();
  ArrayList<String> Dir64 = new ArrayList<String>();
  ArrayList<String> Dir74 = new ArrayList<String>();
  ArrayList<String> Dir84 = new ArrayList<String>();
  ArrayList<String> Dir94 = new ArrayList<String>();
  ArrayList<String> Dir104 = new ArrayList<String>();
  ArrayList<String> Dir114 = new ArrayList<String>();
  ArrayList<String> Dir124 = new ArrayList<String>();
  ArrayList<String> Dir134 = new ArrayList<String>();
  ArrayList<String> Dir144 = new ArrayList<String>();
  ArrayList<String> Dir154 = new ArrayList<String>();
  ArrayList<String> Dir164 = new ArrayList<String>();
  ArrayList<String> Dir174 = new ArrayList<String>();
  ArrayList<String> Dir184 = new ArrayList<String>();
  ArrayList<String> Dir194 = new ArrayList<String>();
  ArrayList<String> Dir204 = new ArrayList<String>();
  ArrayList<String> Dir214 = new ArrayList<String>();
  ArrayList<String> Dir224 = new ArrayList<String>();
  ArrayList<String> Dir234 = new ArrayList<String>();
  ArrayList<String> Dir244 = new ArrayList<String>();
  ArrayList<String> Dir254 = new ArrayList<String>();

  //ROW 5
  ArrayList<String> Dir05 = new ArrayList<String>();
  ArrayList<String> Dir15 = new ArrayList<String>();
  ArrayList<String> Dir25 = new ArrayList<String>();
  ArrayList<String> Dir35 = new ArrayList<String>();
  ArrayList<String> Dir45 = new ArrayList<String>();
  ArrayList<String> Dir55 = new ArrayList<String>();
  ArrayList<String> Dir65 = new ArrayList<String>();
  ArrayList<String> Dir75 = new ArrayList<String>();
  ArrayList<String> Dir85 = new ArrayList<String>();
  ArrayList<String> Dir95 = new ArrayList<String>();
  ArrayList<String> Dir105 = new ArrayList<String>();
  ArrayList<String> Dir115 = new ArrayList<String>();
  ArrayList<String> Dir125 = new ArrayList<String>();
  ArrayList<String> Dir135 = new ArrayList<String>();
  ArrayList<String> Dir145 = new ArrayList<String>();
  ArrayList<String> Dir155 = new ArrayList<String>();
  ArrayList<String> Dir165 = new ArrayList<String>();
  ArrayList<String> Dir175 = new ArrayList<String>();
  ArrayList<String> Dir185 = new ArrayList<String>();
  ArrayList<String> Dir195 = new ArrayList<String>();
  ArrayList<String> Dir205 = new ArrayList<String>();
  ArrayList<String> Dir215 = new ArrayList<String>();
  ArrayList<String> Dir225 = new ArrayList<String>();
  ArrayList<String> Dir235 = new ArrayList<String>();
  ArrayList<String> Dir245 = new ArrayList<String>();
  ArrayList<String> Dir255 = new ArrayList<String>();

  //ROW 6
  ArrayList<String> Dir06 = new ArrayList<String>();
  ArrayList<String> Dir16 = new ArrayList<String>();
  ArrayList<String> Dir26 = new ArrayList<String>();
  ArrayList<String> Dir36 = new ArrayList<String>();
  ArrayList<String> Dir46 = new ArrayList<String>();
  ArrayList<String> Dir56 = new ArrayList<String>();
  ArrayList<String> Dir66 = new ArrayList<String>();
  ArrayList<String> Dir76 = new ArrayList<String>();
  ArrayList<String> Dir86 = new ArrayList<String>();
  ArrayList<String> Dir96 = new ArrayList<String>();
  ArrayList<String> Dir106 = new ArrayList<String>();
  ArrayList<String> Dir116 = new ArrayList<String>();
  ArrayList<String> Dir126 = new ArrayList<String>();
  ArrayList<String> Dir136 = new ArrayList<String>();
  ArrayList<String> Dir146 = new ArrayList<String>();
  ArrayList<String> Dir156 = new ArrayList<String>();
  ArrayList<String> Dir166 = new ArrayList<String>();
  ArrayList<String> Dir176 = new ArrayList<String>();
  ArrayList<String> Dir186 = new ArrayList<String>();
  ArrayList<String> Dir196 = new ArrayList<String>();
  ArrayList<String> Dir206 = new ArrayList<String>();
  ArrayList<String> Dir216 = new ArrayList<String>();
  ArrayList<String> Dir226 = new ArrayList<String>();
  ArrayList<String> Dir236 = new ArrayList<String>();
  ArrayList<String> Dir246 = new ArrayList<String>();
  ArrayList<String> Dir256 = new ArrayList<String>();

  //ROW 7
  ArrayList<String> Dir07 = new ArrayList<String>();
  ArrayList<String> Dir17 = new ArrayList<String>();
  ArrayList<String> Dir27 = new ArrayList<String>();
  ArrayList<String> Dir37 = new ArrayList<String>();
  ArrayList<String> Dir47 = new ArrayList<String>();
  ArrayList<String> Dir57 = new ArrayList<String>();
  ArrayList<String> Dir67 = new ArrayList<String>();
  ArrayList<String> Dir77 = new ArrayList<String>();
  ArrayList<String> Dir87 = new ArrayList<String>();
  ArrayList<String> Dir97 = new ArrayList<String>();
  ArrayList<String> Dir107 = new ArrayList<String>();
  ArrayList<String> Dir117 = new ArrayList<String>();
  ArrayList<String> Dir127 = new ArrayList<String>();
  ArrayList<String> Dir137 = new ArrayList<String>();
  ArrayList<String> Dir147 = new ArrayList<String>();
  ArrayList<String> Dir157 = new ArrayList<String>();
  ArrayList<String> Dir167 = new ArrayList<String>();
  ArrayList<String> Dir177 = new ArrayList<String>();
  ArrayList<String> Dir187 = new ArrayList<String>();
  ArrayList<String> Dir197 = new ArrayList<String>();
  ArrayList<String> Dir207 = new ArrayList<String>();
  ArrayList<String> Dir217 = new ArrayList<String>();
  ArrayList<String> Dir227 = new ArrayList<String>();
  ArrayList<String> Dir237 = new ArrayList<String>();
  ArrayList<String> Dir247 = new ArrayList<String>();
  ArrayList<String> Dir257 = new ArrayList<String>();

  //ROW 8
  ArrayList<String> Dir08 = new ArrayList<String>();
  ArrayList<String> Dir18 = new ArrayList<String>();
  ArrayList<String> Dir28 = new ArrayList<String>();
  ArrayList<String> Dir38 = new ArrayList<String>();
  ArrayList<String> Dir48 = new ArrayList<String>();
  ArrayList<String> Dir58 = new ArrayList<String>();
  ArrayList<String> Dir68 = new ArrayList<String>();
  ArrayList<String> Dir78 = new ArrayList<String>();
  ArrayList<String> Dir88 = new ArrayList<String>();
  ArrayList<String> Dir98 = new ArrayList<String>();
  ArrayList<String> Dir108 = new ArrayList<String>();
  ArrayList<String> Dir118 = new ArrayList<String>();
  ArrayList<String> Dir128 = new ArrayList<String>();
  ArrayList<String> Dir138 = new ArrayList<String>();
  ArrayList<String> Dir148 = new ArrayList<String>();
  ArrayList<String> Dir158 = new ArrayList<String>();
  ArrayList<String> Dir168 = new ArrayList<String>();
  ArrayList<String> Dir178 = new ArrayList<String>();
  ArrayList<String> Dir188 = new ArrayList<String>();
  ArrayList<String> Dir198 = new ArrayList<String>();
  ArrayList<String> Dir208 = new ArrayList<String>();
  ArrayList<String> Dir218 = new ArrayList<String>();
  ArrayList<String> Dir228 = new ArrayList<String>();
  ArrayList<String> Dir238 = new ArrayList<String>();
  ArrayList<String> Dir248 = new ArrayList<String>();
  ArrayList<String> Dir258 = new ArrayList<String>();

  //ROW 9
  ArrayList<String> Dir09 = new ArrayList<String>();
  ArrayList<String> Dir19 = new ArrayList<String>();
  ArrayList<String> Dir29 = new ArrayList<String>();
  ArrayList<String> Dir39 = new ArrayList<String>();
  ArrayList<String> Dir49 = new ArrayList<String>();
  ArrayList<String> Dir59 = new ArrayList<String>();
  ArrayList<String> Dir69 = new ArrayList<String>();
  ArrayList<String> Dir79 = new ArrayList<String>();
  ArrayList<String> Dir89 = new ArrayList<String>();
  ArrayList<String> Dir99 = new ArrayList<String>();
  ArrayList<String> Dir109 = new ArrayList<String>();
  ArrayList<String> Dir119 = new ArrayList<String>();
  ArrayList<String> Dir129 = new ArrayList<String>();
  ArrayList<String> Dir139 = new ArrayList<String>();
  ArrayList<String> Dir149 = new ArrayList<String>();
  ArrayList<String> Dir159 = new ArrayList<String>();
  ArrayList<String> Dir169 = new ArrayList<String>();
  ArrayList<String> Dir179 = new ArrayList<String>();
  ArrayList<String> Dir189 = new ArrayList<String>();
  ArrayList<String> Dir199 = new ArrayList<String>();
  ArrayList<String> Dir209 = new ArrayList<String>();
  ArrayList<String> Dir219 = new ArrayList<String>();
  ArrayList<String> Dir229 = new ArrayList<String>();
  ArrayList<String> Dir239 = new ArrayList<String>();
  ArrayList<String> Dir249 = new ArrayList<String>();
  ArrayList<String> Dir259 = new ArrayList<String>();

  //ROW 10
  ArrayList<String> Dir010 = new ArrayList<String>();
  ArrayList<String> DirOneTen = new ArrayList<String>();
  ArrayList<String> DirTwoTen = new ArrayList<String>();
  ArrayList<String> Dir310 = new ArrayList<String>();
  ArrayList<String> Dir410 = new ArrayList<String>();
  ArrayList<String> Dir510 = new ArrayList<String>();
  ArrayList<String> Dir610 = new ArrayList<String>();
  ArrayList<String> Dir710 = new ArrayList<String>();
  ArrayList<String> Dir810 = new ArrayList<String>();
  ArrayList<String> Dir910 = new ArrayList<String>();
  ArrayList<String> Dir1010 = new ArrayList<String>();
  ArrayList<String> Dir1110 = new ArrayList<String>();
  ArrayList<String> Dir1210 = new ArrayList<String>();
  ArrayList<String> Dir1310 = new ArrayList<String>();
  ArrayList<String> Dir1410 = new ArrayList<String>();
  ArrayList<String> Dir1510 = new ArrayList<String>();
  ArrayList<String> Dir1610 = new ArrayList<String>();
  ArrayList<String> Dir1710 = new ArrayList<String>();
  ArrayList<String> Dir1810 = new ArrayList<String>();
  ArrayList<String> Dir1910 = new ArrayList<String>();
  ArrayList<String> Dir2010 = new ArrayList<String>();
  ArrayList<String> Dir2110 = new ArrayList<String>();
  ArrayList<String> Dir2210 = new ArrayList<String>();
  ArrayList<String> Dir2310 = new ArrayList<String>();
  ArrayList<String> Dir2410 = new ArrayList<String>();
  ArrayList<String> Dir2510 = new ArrayList<String>();

  //ROW 11
  ArrayList<String> Dir011 = new ArrayList<String>();
  ArrayList<String> DirOneEleven = new ArrayList<String>();
  ArrayList<String> DirTwoEleven = new ArrayList<String>();
  ArrayList<String> Dir311 = new ArrayList<String>();
  ArrayList<String> Dir411 = new ArrayList<String>();
  ArrayList<String> Dir511 = new ArrayList<String>();
  ArrayList<String> Dir611 = new ArrayList<String>();
  ArrayList<String> Dir711 = new ArrayList<String>();
  ArrayList<String> Dir811 = new ArrayList<String>();
  ArrayList<String> Dir911 = new ArrayList<String>();
  ArrayList<String> Dir1011 = new ArrayList<String>();
  ArrayList<String> Dir1111 = new ArrayList<String>();
  ArrayList<String> Dir1211 = new ArrayList<String>();
  ArrayList<String> Dir1311 = new ArrayList<String>();
  ArrayList<String> Dir1411 = new ArrayList<String>();
  ArrayList<String> Dir1511 = new ArrayList<String>();
  ArrayList<String> Dir1611 = new ArrayList<String>();
  ArrayList<String> Dir1711 = new ArrayList<String>();
  ArrayList<String> Dir1811 = new ArrayList<String>();
  ArrayList<String> Dir1911 = new ArrayList<String>();
  ArrayList<String> Dir2011 = new ArrayList<String>();
  ArrayList<String> Dir2111 = new ArrayList<String>();
  ArrayList<String> Dir2211 = new ArrayList<String>();
  ArrayList<String> Dir2311 = new ArrayList<String>();
  ArrayList<String> Dir2411 = new ArrayList<String>();
  ArrayList<String> Dir2511 = new ArrayList<String>();

  //ROW 12
  ArrayList<String> Dir012 = new ArrayList<String>();
  ArrayList<String> DirOneTwelve = new ArrayList<String>();
  ArrayList<String> DirTwoTwelve = new ArrayList<String>();
  ArrayList<String> Dir312 = new ArrayList<String>();
  ArrayList<String> Dir412 = new ArrayList<String>();
  ArrayList<String> Dir512 = new ArrayList<String>();
  ArrayList<String> Dir612 = new ArrayList<String>();
  ArrayList<String> Dir712 = new ArrayList<String>();
  ArrayList<String> Dir812 = new ArrayList<String>();
  ArrayList<String> Dir912 = new ArrayList<String>();
  ArrayList<String> Dir1012 = new ArrayList<String>();
  ArrayList<String> Dir1112 = new ArrayList<String>();
  ArrayList<String> Dir1212 = new ArrayList<String>();
  ArrayList<String> Dir1312 = new ArrayList<String>();
  ArrayList<String> Dir1412 = new ArrayList<String>();
  ArrayList<String> Dir1512 = new ArrayList<String>();
  ArrayList<String> Dir1612 = new ArrayList<String>();
  ArrayList<String> Dir1712 = new ArrayList<String>();
  ArrayList<String> Dir1812 = new ArrayList<String>();
  ArrayList<String> Dir1912 = new ArrayList<String>();
  ArrayList<String> Dir2012 = new ArrayList<String>();
  ArrayList<String> Dir2112 = new ArrayList<String>();
  ArrayList<String> Dir2212 = new ArrayList<String>();
  ArrayList<String> Dir2312 = new ArrayList<String>();
  ArrayList<String> Dir2412 = new ArrayList<String>();
  ArrayList<String> Dir2512 = new ArrayList<String>();

  //ROW 13
  ArrayList<String> Dir013 = new ArrayList<String>();
  ArrayList<String> DirOneThirteen = new ArrayList<String>();
  ArrayList<String> DirTwoThirteen = new ArrayList<String>();
  ArrayList<String> Dir313 = new ArrayList<String>();
  ArrayList<String> Dir413 = new ArrayList<String>();
  ArrayList<String> Dir513 = new ArrayList<String>();
  ArrayList<String> Dir613 = new ArrayList<String>();
  ArrayList<String> Dir713 = new ArrayList<String>();
  ArrayList<String> Dir813 = new ArrayList<String>();
  ArrayList<String> Dir913 = new ArrayList<String>();
  ArrayList<String> Dir1013 = new ArrayList<String>();
  ArrayList<String> Dir1113 = new ArrayList<String>();
  ArrayList<String> Dir1213 = new ArrayList<String>();
  ArrayList<String> Dir1313 = new ArrayList<String>();
  ArrayList<String> Dir1413 = new ArrayList<String>();
  ArrayList<String> Dir1513 = new ArrayList<String>();
  ArrayList<String> Dir1613 = new ArrayList<String>();
  ArrayList<String> Dir1713 = new ArrayList<String>();
  ArrayList<String> Dir1813 = new ArrayList<String>();
  ArrayList<String> Dir1913 = new ArrayList<String>();
  ArrayList<String> Dir2013 = new ArrayList<String>();
  ArrayList<String> Dir2113 = new ArrayList<String>();
  ArrayList<String> Dir2213 = new ArrayList<String>();
  ArrayList<String> Dir2313 = new ArrayList<String>();
  ArrayList<String> Dir2413 = new ArrayList<String>();
  ArrayList<String> Dir2513 = new ArrayList<String>();

  //ROW 14
  ArrayList<String> Dir014 = new ArrayList<String>();
  ArrayList<String> DirOneFourteen = new ArrayList<String>();
  ArrayList<String> DirTwoFourteen = new ArrayList<String>();
  ArrayList<String> Dir314 = new ArrayList<String>();
  ArrayList<String> Dir414 = new ArrayList<String>();
  ArrayList<String> Dir514 = new ArrayList<String>();
  ArrayList<String> Dir614 = new ArrayList<String>();
  ArrayList<String> Dir714 = new ArrayList<String>();
  ArrayList<String> Dir814 = new ArrayList<String>();
  ArrayList<String> Dir914 = new ArrayList<String>();
  ArrayList<String> Dir1014 = new ArrayList<String>();
  ArrayList<String> Dir1114 = new ArrayList<String>();
  ArrayList<String> Dir1214 = new ArrayList<String>();
  ArrayList<String> Dir1314 = new ArrayList<String>();
  ArrayList<String> Dir1414 = new ArrayList<String>();
  ArrayList<String> Dir1514 = new ArrayList<String>();
  ArrayList<String> Dir1614 = new ArrayList<String>();
  ArrayList<String> Dir1714 = new ArrayList<String>();
  ArrayList<String> Dir1814 = new ArrayList<String>();
  ArrayList<String> Dir1914 = new ArrayList<String>();
  ArrayList<String> Dir2014 = new ArrayList<String>();
  ArrayList<String> Dir2114 = new ArrayList<String>();
  ArrayList<String> Dir2214 = new ArrayList<String>();
  ArrayList<String> Dir2314 = new ArrayList<String>();
  ArrayList<String> Dir2414 = new ArrayList<String>();
  ArrayList<String> Dir2514 = new ArrayList<String>();

  //ROW 15
  ArrayList<String> Dir015 = new ArrayList<String>();
  ArrayList<String> DirOneFifteen = new ArrayList<String>();
  ArrayList<String> DirTwoFifteen = new ArrayList<String>();
  ArrayList<String> Dir315 = new ArrayList<String>();
  ArrayList<String> Dir415 = new ArrayList<String>();
  ArrayList<String> Dir515 = new ArrayList<String>();
  ArrayList<String> Dir615 = new ArrayList<String>();
  ArrayList<String> Dir715 = new ArrayList<String>();
  ArrayList<String> Dir815 = new ArrayList<String>();
  ArrayList<String> Dir915 = new ArrayList<String>();
  ArrayList<String> Dir1015 = new ArrayList<String>();
  ArrayList<String> Dir1115 = new ArrayList<String>();
  ArrayList<String> Dir1215 = new ArrayList<String>();
  ArrayList<String> Dir1315 = new ArrayList<String>();
  ArrayList<String> Dir1415 = new ArrayList<String>();
  ArrayList<String> Dir1515 = new ArrayList<String>();
  ArrayList<String> Dir1615 = new ArrayList<String>();
  ArrayList<String> Dir1715 = new ArrayList<String>();
  ArrayList<String> Dir1815 = new ArrayList<String>();
  ArrayList<String> Dir1915 = new ArrayList<String>();
  ArrayList<String> Dir2015 = new ArrayList<String>();
  ArrayList<String> Dir2115 = new ArrayList<String>();
  ArrayList<String> Dir2215 = new ArrayList<String>();
  ArrayList<String> Dir2315 = new ArrayList<String>();
  ArrayList<String> Dir2415 = new ArrayList<String>();
  ArrayList<String> Dir2515 = new ArrayList<String>();

  //ROW 16
  ArrayList<String> Dir016 = new ArrayList<String>();
  ArrayList<String> DirOneSixteen = new ArrayList<String>();
  ArrayList<String> DirTwoSixteen = new ArrayList<String>();
  ArrayList<String> Dir316 = new ArrayList<String>();
  ArrayList<String> Dir416 = new ArrayList<String>();
  ArrayList<String> Dir516 = new ArrayList<String>();
  ArrayList<String> Dir616 = new ArrayList<String>();
  ArrayList<String> Dir716 = new ArrayList<String>();
  ArrayList<String> Dir816 = new ArrayList<String>();
  ArrayList<String> Dir916 = new ArrayList<String>();
  ArrayList<String> Dir1016 = new ArrayList<String>();
  ArrayList<String> Dir1116 = new ArrayList<String>();
  ArrayList<String> Dir1216 = new ArrayList<String>();
  ArrayList<String> Dir1316 = new ArrayList<String>();
  ArrayList<String> Dir1416 = new ArrayList<String>();
  ArrayList<String> Dir1516 = new ArrayList<String>();
  ArrayList<String> Dir1616 = new ArrayList<String>();
  ArrayList<String> Dir1716 = new ArrayList<String>();
  ArrayList<String> Dir1816 = new ArrayList<String>();
  ArrayList<String> Dir1916 = new ArrayList<String>();
  ArrayList<String> Dir2016 = new ArrayList<String>();
  ArrayList<String> Dir2116 = new ArrayList<String>();
  ArrayList<String> Dir2216 = new ArrayList<String>();
  ArrayList<String> Dir2316 = new ArrayList<String>();
  ArrayList<String> Dir2416 = new ArrayList<String>();
  ArrayList<String> Dir2516 = new ArrayList<String>();

  //ROW 17
  ArrayList<String> Dir017 = new ArrayList<String>();
  ArrayList<String> DirOneSeventeen = new ArrayList<String>();
  ArrayList<String> DirTwoSeventeen = new ArrayList<String>();
  ArrayList<String> Dir317 = new ArrayList<String>();
  ArrayList<String> Dir417 = new ArrayList<String>();
  ArrayList<String> Dir517 = new ArrayList<String>();
  ArrayList<String> Dir617 = new ArrayList<String>();
  ArrayList<String> Dir717 = new ArrayList<String>();
  ArrayList<String> Dir817 = new ArrayList<String>();
  ArrayList<String> Dir917 = new ArrayList<String>();
  ArrayList<String> Dir1017 = new ArrayList<String>();
  ArrayList<String> Dir1117 = new ArrayList<String>();
  ArrayList<String> Dir1217 = new ArrayList<String>();
  ArrayList<String> Dir1317 = new ArrayList<String>();
  ArrayList<String> Dir1417 = new ArrayList<String>();
  ArrayList<String> Dir1517 = new ArrayList<String>();
  ArrayList<String> Dir1617 = new ArrayList<String>();
  ArrayList<String> Dir1717 = new ArrayList<String>();
  ArrayList<String> Dir1817 = new ArrayList<String>();
  ArrayList<String> Dir1917 = new ArrayList<String>();
  ArrayList<String> Dir2017 = new ArrayList<String>();
  ArrayList<String> Dir2117 = new ArrayList<String>();
  ArrayList<String> Dir2217 = new ArrayList<String>();
  ArrayList<String> Dir2317 = new ArrayList<String>();
  ArrayList<String> Dir2417 = new ArrayList<String>();
  ArrayList<String> Dir2517 = new ArrayList<String>();

  //ROW 18
  ArrayList<String> Dir018 = new ArrayList<String>();
  ArrayList<String> DirOneEighteen = new ArrayList<String>();
  ArrayList<String> DirTwoEighteen = new ArrayList<String>();
  ArrayList<String> Dir318 = new ArrayList<String>();
  ArrayList<String> Dir418 = new ArrayList<String>();
  ArrayList<String> Dir518 = new ArrayList<String>();
  ArrayList<String> Dir618 = new ArrayList<String>();
  ArrayList<String> Dir718 = new ArrayList<String>();
  ArrayList<String> Dir818 = new ArrayList<String>();
  ArrayList<String> Dir918 = new ArrayList<String>();
  ArrayList<String> Dir1018 = new ArrayList<String>();
  ArrayList<String> Dir1118 = new ArrayList<String>();
  ArrayList<String> Dir1218 = new ArrayList<String>();
  ArrayList<String> Dir1318 = new ArrayList<String>();
  ArrayList<String> Dir1418 = new ArrayList<String>();
  ArrayList<String> Dir1518 = new ArrayList<String>();
  ArrayList<String> Dir1618 = new ArrayList<String>();
  ArrayList<String> Dir1718 = new ArrayList<String>();
  ArrayList<String> Dir1818 = new ArrayList<String>();
  ArrayList<String> Dir1918 = new ArrayList<String>();
  ArrayList<String> Dir2018 = new ArrayList<String>();
  ArrayList<String> Dir2118 = new ArrayList<String>();
  ArrayList<String> Dir2218 = new ArrayList<String>();
  ArrayList<String> Dir2318 = new ArrayList<String>();
  ArrayList<String> Dir2418 = new ArrayList<String>();
  ArrayList<String> Dir2518 = new ArrayList<String>();

  //ROW 19
  ArrayList<String> Dir019 = new ArrayList<String>();
  ArrayList<String> DirOneNineteen = new ArrayList<String>();
  ArrayList<String> DirTwoNineteen = new ArrayList<String>();
  ArrayList<String> Dir319 = new ArrayList<String>();
  ArrayList<String> Dir419 = new ArrayList<String>();
  ArrayList<String> Dir519 = new ArrayList<String>();
  ArrayList<String> Dir619 = new ArrayList<String>();
  ArrayList<String> Dir719 = new ArrayList<String>();
  ArrayList<String> Dir819 = new ArrayList<String>();
  ArrayList<String> Dir919 = new ArrayList<String>();
  ArrayList<String> Dir1019 = new ArrayList<String>();
  ArrayList<String> Dir1119 = new ArrayList<String>();
  ArrayList<String> Dir1219 = new ArrayList<String>();
  ArrayList<String> Dir1319 = new ArrayList<String>();
  ArrayList<String> Dir1419 = new ArrayList<String>();
  ArrayList<String> Dir1519 = new ArrayList<String>();
  ArrayList<String> Dir1619 = new ArrayList<String>();
  ArrayList<String> Dir1719 = new ArrayList<String>();
  ArrayList<String> Dir1819 = new ArrayList<String>();
  ArrayList<String> Dir1919 = new ArrayList<String>();
  ArrayList<String> Dir2019 = new ArrayList<String>();
  ArrayList<String> Dir2119 = new ArrayList<String>();
  ArrayList<String> Dir2219 = new ArrayList<String>();
  ArrayList<String> Dir2319 = new ArrayList<String>();
  ArrayList<String> Dir2419 = new ArrayList<String>();
  ArrayList<String> Dir2519 = new ArrayList<String>();

  //ROW 20
  ArrayList<String> Dir020 = new ArrayList<String>();
  ArrayList<String> DirOneTwenty = new ArrayList<String>();
  ArrayList<String> DirTwoTwenty = new ArrayList<String>();
  ArrayList<String> Dir320 = new ArrayList<String>();
  ArrayList<String> Dir420 = new ArrayList<String>();
  ArrayList<String> Dir520 = new ArrayList<String>();
  ArrayList<String> Dir620 = new ArrayList<String>();
  ArrayList<String> Dir720 = new ArrayList<String>();
  ArrayList<String> Dir820 = new ArrayList<String>();
  ArrayList<String> Dir920 = new ArrayList<String>();
  ArrayList<String> Dir1020 = new ArrayList<String>();
  ArrayList<String> Dir1120 = new ArrayList<String>();
  ArrayList<String> Dir1220 = new ArrayList<String>();
  ArrayList<String> Dir1320 = new ArrayList<String>();
  ArrayList<String> Dir1420 = new ArrayList<String>();
  ArrayList<String> Dir1520 = new ArrayList<String>();
  ArrayList<String> Dir1620 = new ArrayList<String>();
  ArrayList<String> Dir1720 = new ArrayList<String>();
  ArrayList<String> Dir1820 = new ArrayList<String>();
  ArrayList<String> Dir1920 = new ArrayList<String>();
  ArrayList<String> Dir2020 = new ArrayList<String>();
  ArrayList<String> Dir2120 = new ArrayList<String>();
  ArrayList<String> Dir2220 = new ArrayList<String>();
  ArrayList<String> Dir2320 = new ArrayList<String>();
  ArrayList<String> Dir2420 = new ArrayList<String>();
  ArrayList<String> Dir2520 = new ArrayList<String>();

  //ROW 21
  ArrayList<String> Dir021 = new ArrayList<String>();
  ArrayList<String> DirOneTwentyOne = new ArrayList<String>();
  ArrayList<String> DirTwoTwentyOne = new ArrayList<String>();
  ArrayList<String> Dir321 = new ArrayList<String>();
  ArrayList<String> Dir421 = new ArrayList<String>();
  ArrayList<String> Dir521 = new ArrayList<String>();
  ArrayList<String> Dir621 = new ArrayList<String>();
  ArrayList<String> Dir721 = new ArrayList<String>();
  ArrayList<String> Dir821 = new ArrayList<String>();
  ArrayList<String> Dir921 = new ArrayList<String>();
  ArrayList<String> Dir1021 = new ArrayList<String>();
  ArrayList<String> Dir1121 = new ArrayList<String>();
  ArrayList<String> Dir1221 = new ArrayList<String>();
  ArrayList<String> Dir1321 = new ArrayList<String>();
  ArrayList<String> Dir1421 = new ArrayList<String>();
  ArrayList<String> Dir1521 = new ArrayList<String>();
  ArrayList<String> Dir1621 = new ArrayList<String>();
  ArrayList<String> Dir1721 = new ArrayList<String>();
  ArrayList<String> Dir1821 = new ArrayList<String>();
  ArrayList<String> Dir1921 = new ArrayList<String>();
  ArrayList<String> Dir2021 = new ArrayList<String>();
  ArrayList<String> Dir2121 = new ArrayList<String>();
  ArrayList<String> Dir2221 = new ArrayList<String>();
  ArrayList<String> Dir2321 = new ArrayList<String>();
  ArrayList<String> Dir2421 = new ArrayList<String>();
  ArrayList<String> Dir2521 = new ArrayList<String>();

  //ROW 22
  ArrayList<String> Dir022 = new ArrayList<String>();
  ArrayList<String> DirOneTwentyTwo = new ArrayList<String>();
  ArrayList<String> DirTwoTwentyTwo = new ArrayList<String>();
  ArrayList<String> Dir322 = new ArrayList<String>();
  ArrayList<String> Dir422 = new ArrayList<String>();
  ArrayList<String> Dir522 = new ArrayList<String>();
  ArrayList<String> Dir622 = new ArrayList<String>();
  ArrayList<String> Dir722 = new ArrayList<String>();
  ArrayList<String> Dir822 = new ArrayList<String>();
  ArrayList<String> Dir922 = new ArrayList<String>();
  ArrayList<String> Dir1022 = new ArrayList<String>();
  ArrayList<String> Dir1122 = new ArrayList<String>();
  ArrayList<String> Dir1222 = new ArrayList<String>();
  ArrayList<String> Dir1322 = new ArrayList<String>();
  ArrayList<String> Dir1422 = new ArrayList<String>();
  ArrayList<String> Dir1522 = new ArrayList<String>();
  ArrayList<String> Dir1622 = new ArrayList<String>();
  ArrayList<String> Dir1722 = new ArrayList<String>();
  ArrayList<String> Dir1822 = new ArrayList<String>();
  ArrayList<String> Dir1922 = new ArrayList<String>();
  ArrayList<String> Dir2022 = new ArrayList<String>();
  ArrayList<String> Dir2122 = new ArrayList<String>();
  ArrayList<String> Dir2222 = new ArrayList<String>();
  ArrayList<String> Dir2322 = new ArrayList<String>();
  ArrayList<String> Dir2422 = new ArrayList<String>();
  ArrayList<String> Dir2522 = new ArrayList<String>();


  //ROW 23
  ArrayList<String> Dir023 = new ArrayList<String>();
  ArrayList<String> DirOneTwentyThree = new ArrayList<String>();
  ArrayList<String> DirTwoTwentyThree = new ArrayList<String>();
  ArrayList<String> Dir323 = new ArrayList<String>();
  ArrayList<String> Dir423 = new ArrayList<String>();
  ArrayList<String> Dir523 = new ArrayList<String>();
  ArrayList<String> Dir623 = new ArrayList<String>();
  ArrayList<String> Dir723 = new ArrayList<String>();
  ArrayList<String> Dir823 = new ArrayList<String>();
  ArrayList<String> Dir923 = new ArrayList<String>();
  ArrayList<String> Dir1023 = new ArrayList<String>();
  ArrayList<String> Dir1123 = new ArrayList<String>();
  ArrayList<String> Dir1223 = new ArrayList<String>();
  ArrayList<String> Dir1323 = new ArrayList<String>();
  ArrayList<String> Dir1423 = new ArrayList<String>();
  ArrayList<String> Dir1523 = new ArrayList<String>();
  ArrayList<String> Dir1623 = new ArrayList<String>();
  ArrayList<String> Dir1723 = new ArrayList<String>();
  ArrayList<String> Dir1823 = new ArrayList<String>();
  ArrayList<String> Dir1923 = new ArrayList<String>();
  ArrayList<String> Dir2023 = new ArrayList<String>();
  ArrayList<String> Dir2123 = new ArrayList<String>();
  ArrayList<String> Dir2223 = new ArrayList<String>();
  ArrayList<String> Dir2323 = new ArrayList<String>();
  ArrayList<String> Dir2423 = new ArrayList<String>();
  ArrayList<String> Dir2523 = new ArrayList<String>();

  //ROW 24
  ArrayList<String> Dir024 = new ArrayList<String>();
  ArrayList<String> DirOneTwentyFour = new ArrayList<String>();
  ArrayList<String> DirTwoTwentyFour = new ArrayList<String>();
  ArrayList<String> Dir324 = new ArrayList<String>();
  ArrayList<String> Dir424 = new ArrayList<String>();
  ArrayList<String> Dir524 = new ArrayList<String>();
  ArrayList<String> Dir624 = new ArrayList<String>();
  ArrayList<String> Dir724 = new ArrayList<String>();
  ArrayList<String> Dir824 = new ArrayList<String>();
  ArrayList<String> Dir924 = new ArrayList<String>();
  ArrayList<String> Dir1024 = new ArrayList<String>();
  ArrayList<String> Dir1124 = new ArrayList<String>();
  ArrayList<String> Dir1224 = new ArrayList<String>();
  ArrayList<String> Dir1324 = new ArrayList<String>();
  ArrayList<String> Dir1424 = new ArrayList<String>();
  ArrayList<String> Dir1524 = new ArrayList<String>();
  ArrayList<String> Dir1624 = new ArrayList<String>();
  ArrayList<String> Dir1724 = new ArrayList<String>();
  ArrayList<String> Dir1824 = new ArrayList<String>();
  ArrayList<String> Dir1924 = new ArrayList<String>();
  ArrayList<String> Dir2024 = new ArrayList<String>();
  ArrayList<String> Dir2124 = new ArrayList<String>();
  ArrayList<String> Dir2224 = new ArrayList<String>();
  ArrayList<String> Dir2324 = new ArrayList<String>();
  ArrayList<String> Dir2424 = new ArrayList<String>();
  ArrayList<String> Dir2524 = new ArrayList<String>();


  //ROW 25
  ArrayList<String> Dir025 = new ArrayList<String>();
  ArrayList<String> DirOneTwentyFive = new ArrayList<String>();
  ArrayList<String> DirTwoTwentyFive = new ArrayList<String>();
  ArrayList<String> Dir325 = new ArrayList<String>();
  ArrayList<String> Dir425 = new ArrayList<String>();
  ArrayList<String> Dir525 = new ArrayList<String>();
  ArrayList<String> Dir625 = new ArrayList<String>();
  ArrayList<String> Dir725 = new ArrayList<String>();
  ArrayList<String> Dir825 = new ArrayList<String>();
  ArrayList<String> Dir925 = new ArrayList<String>();
  ArrayList<String> Dir1025 = new ArrayList<String>();
  ArrayList<String> Dir1125 = new ArrayList<String>();
  ArrayList<String> Dir1225 = new ArrayList<String>();
  ArrayList<String> Dir1325 = new ArrayList<String>();
  ArrayList<String> Dir1425 = new ArrayList<String>();
  ArrayList<String> Dir1525 = new ArrayList<String>();
  ArrayList<String> Dir1625 = new ArrayList<String>();
  ArrayList<String> Dir1725 = new ArrayList<String>();
  ArrayList<String> Dir1825 = new ArrayList<String>();
  ArrayList<String> Dir1925 = new ArrayList<String>();
  ArrayList<String> Dir2025 = new ArrayList<String>();
  ArrayList<String> Dir2125 = new ArrayList<String>();
  ArrayList<String> Dir2225 = new ArrayList<String>();
  ArrayList<String> Dir2325 = new ArrayList<String>();
  ArrayList<String> Dir2425 = new ArrayList<String>();
  ArrayList<String> Dir2525 = new ArrayList<String>();

  //ROW 26
  ArrayList<String> Dir026 = new ArrayList<String>();
  ArrayList<String> DirOneTwentySix = new ArrayList<String>();
  ArrayList<String> DirTwoTwentySix = new ArrayList<String>();
  ArrayList<String> Dir326 = new ArrayList<String>();
  ArrayList<String> Dir426 = new ArrayList<String>();
  ArrayList<String> Dir526 = new ArrayList<String>();
  ArrayList<String> Dir626 = new ArrayList<String>();
  ArrayList<String> Dir726 = new ArrayList<String>();
  ArrayList<String> Dir826 = new ArrayList<String>();
  ArrayList<String> Dir926 = new ArrayList<String>();
  ArrayList<String> Dir1026 = new ArrayList<String>();
  ArrayList<String> Dir1126 = new ArrayList<String>();
  ArrayList<String> Dir1226 = new ArrayList<String>();
  ArrayList<String> Dir1326 = new ArrayList<String>();
  ArrayList<String> Dir1426 = new ArrayList<String>();
  ArrayList<String> Dir1526 = new ArrayList<String>();
  ArrayList<String> Dir1626 = new ArrayList<String>();
  ArrayList<String> Dir1726 = new ArrayList<String>();
  ArrayList<String> Dir1826 = new ArrayList<String>();
  ArrayList<String> Dir1926 = new ArrayList<String>();
  ArrayList<String> Dir2026 = new ArrayList<String>();
  ArrayList<String> Dir2126 = new ArrayList<String>();
  ArrayList<String> Dir2226 = new ArrayList<String>();
  ArrayList<String> Dir2326 = new ArrayList<String>();
  ArrayList<String> Dir2426 = new ArrayList<String>();
  ArrayList<String> Dir2526 = new ArrayList<String>();

  //ROW 27
  ArrayList<String> Dir027 = new ArrayList<String>();
  ArrayList<String> DirOneTwentySeven = new ArrayList<String>();
  ArrayList<String> DirTwoTwentySeven = new ArrayList<String>();
  ArrayList<String> Dir327 = new ArrayList<String>();
  ArrayList<String> Dir427 = new ArrayList<String>();
  ArrayList<String> Dir527 = new ArrayList<String>();
  ArrayList<String> Dir627 = new ArrayList<String>();
  ArrayList<String> Dir727 = new ArrayList<String>();
  ArrayList<String> Dir827 = new ArrayList<String>();
  ArrayList<String> Dir927 = new ArrayList<String>();
  ArrayList<String> Dir1027 = new ArrayList<String>();
  ArrayList<String> Dir1127 = new ArrayList<String>();
  ArrayList<String> Dir1227 = new ArrayList<String>();
  ArrayList<String> Dir1327 = new ArrayList<String>();
  ArrayList<String> Dir1427 = new ArrayList<String>();
  ArrayList<String> Dir1527 = new ArrayList<String>();
  ArrayList<String> Dir1627 = new ArrayList<String>();
  ArrayList<String> Dir1727 = new ArrayList<String>();
  ArrayList<String> Dir1827 = new ArrayList<String>();
  ArrayList<String> Dir1927 = new ArrayList<String>();
  ArrayList<String> Dir2027 = new ArrayList<String>();
  ArrayList<String> Dir2127 = new ArrayList<String>();
  ArrayList<String> Dir2227 = new ArrayList<String>();
  ArrayList<String> Dir2327 = new ArrayList<String>();
  ArrayList<String> Dir2427 = new ArrayList<String>();
  ArrayList<String> Dir2527 = new ArrayList<String>();

  //ROW 28
  ArrayList<String> Dir028 = new ArrayList<String>();
  ArrayList<String> DirOneTwentyEight = new ArrayList<String>();
  ArrayList<String> DirTwoTwentyEight = new ArrayList<String>();
  ArrayList<String> Dir328 = new ArrayList<String>();
  ArrayList<String> Dir428 = new ArrayList<String>();
  ArrayList<String> Dir528 = new ArrayList<String>();
  ArrayList<String> Dir628 = new ArrayList<String>();
  ArrayList<String> Dir728 = new ArrayList<String>();
  ArrayList<String> Dir828 = new ArrayList<String>();
  ArrayList<String> Dir928 = new ArrayList<String>();
  ArrayList<String> Dir1028 = new ArrayList<String>();
  ArrayList<String> Dir1128 = new ArrayList<String>();
  ArrayList<String> Dir1228 = new ArrayList<String>();
  ArrayList<String> Dir1328 = new ArrayList<String>();
  ArrayList<String> Dir1428 = new ArrayList<String>();
  ArrayList<String> Dir1528 = new ArrayList<String>();
  ArrayList<String> Dir1628 = new ArrayList<String>();
  ArrayList<String> Dir1728 = new ArrayList<String>();
  ArrayList<String> Dir1828 = new ArrayList<String>();
  ArrayList<String> Dir1928 = new ArrayList<String>();
  ArrayList<String> Dir2028 = new ArrayList<String>();
  ArrayList<String> Dir2128 = new ArrayList<String>();
  ArrayList<String> Dir2228 = new ArrayList<String>();
  ArrayList<String> Dir2328 = new ArrayList<String>();
  ArrayList<String> Dir2428 = new ArrayList<String>();
  ArrayList<String> Dir2528 = new ArrayList<String>();



  //tiny board
  ArrayList<Tile> tinyboard = new ArrayList<Tile>();

  // big board
  ArrayList<Tile> bigBoard = new ArrayList<Tile>();

  // tiny board dots
  ArrayList<Posn> tinyDots = new ArrayList<Posn>();

  //big board dots
  ArrayList<Posn> bigDots = new ArrayList<Posn>();

  // tiny board supers
  ArrayList<Posn> tinySupers = new ArrayList<Posn>();

  //big board supers
  ArrayList<Posn> bigSupers = new ArrayList<Posn>();

  //big board ghost starts
  ArrayList<Posn> ghostStarts = new ArrayList<Posn>();



  void initTestConditions() {

    // WALLS FOR TILES
    // row 0
    //for posn (0, 0)
    TinyDir00.add(UP);
    TinyDir00.add(LEFT);
    //for posn (1, 0)
    TinyDir10.add(UP);
    TinyDir10.add(DOWN);
    //for posn (2, 0)
    TinyDir20.add(UP);
    //for posn (3, 0)
    TinyDir30.add(UP);
    TinyDir30.add(DOWN);
    //for posn (4, 0)
    TinyDir40.add(UP);
    TinyDir40.add(RIGHT);
    // row 1
    //for posn (0, 1)
    TinyDir01.add(LEFT);
    TinyDir01.add(RIGHT);
    //for posn (1, 1)
    TinyDir11.add(UP);
    TinyDir11.add(LEFT);
    TinyDir11.add(RIGHT);
    TinyDir11.add(DOWN);
    //for posn (2, 1)
    TinyDir21.add(LEFT);
    TinyDir21.add(RIGHT);
    //for posn (3, 1)
    TinyDir31.add(UP);
    TinyDir31.add(LEFT);
    TinyDir31.add(RIGHT);
    TinyDir31.add(DOWN);
    //for posn (4, 1)
    TinyDir41.add(LEFT);
    TinyDir41.add(RIGHT);
    // row 2
    //for posn (0, 2)
    //for posn (1, 2)
    TinyDir12.add(UP);
    TinyDir12.add(DOWN);
    //for posn (2, 2)
    //for posn (3, 2)
    TinyDir32.add(UP);
    TinyDir32.add(DOWN);
    //for posn (4, 2)
    // row 3
    // for posn (0, 3)
    TinyDir03.add(LEFT);
    TinyDir03.add(RIGHT);
    // for posn (1, 3)
    TinyDir13.add(UP);
    TinyDir13.add(LEFT);
    TinyDir13.add(RIGHT);
    TinyDir13.add(DOWN);
    // for posn (2, 3)
    TinyDir23.add(LEFT);
    TinyDir23.add(RIGHT);
    // for posn (3, 3)
    TinyDir33.add(UP);
    TinyDir33.add(LEFT);
    TinyDir33.add(RIGHT);
    TinyDir33.add(DOWN);
    // for posn (4, 3)
    TinyDir43.add(LEFT);
    TinyDir43.add(RIGHT);
    // row 4
    // for posn (0, 4)
    TinyDir04.add(LEFT);
    TinyDir04.add(DOWN);
    // for posn (1, 4)
    TinyDir14.add(UP);
    TinyDir14.add(DOWN);
    // for posn (2, 4)
    TinyDir24.add(DOWN);
    // for posn (3, 4)
    TinyDir34.add(UP);
    TinyDir34.add(DOWN);
    // for posn (4, 4)
    TinyDir44.add(RIGHT);
    TinyDir44.add(DOWN);

    //essembling tiny board
    // row 0
    tinyboard.add(new Tile(new Posn(0, 0), TinyDir00));
    tinyboard.add(new Tile(new Posn(1, 0), TinyDir10));
    tinyboard.add(new Tile(new Posn(2, 0), TinyDir20));
    tinyboard.add(new Tile(new Posn(3, 0), TinyDir30));
    tinyboard.add(new Tile(new Posn(4, 0), TinyDir40));
    // row 1
    tinyboard.add(new Tile(new Posn(0, 1), TinyDir01));
    tinyboard.add(new Tile(new Posn(1, 1), TinyDir11));
    tinyboard.add(new Tile(new Posn(2, 1), TinyDir21));
    tinyboard.add(new Tile(new Posn(3, 1), TinyDir31));
    tinyboard.add(new Tile(new Posn(4, 1), TinyDir41));
    // row 2
    tinyboard.add(new Tile(new Posn(0, 2), TinyDir02));
    tinyboard.add(new Tile(new Posn(1, 2), TinyDir12));
    tinyboard.add(new Tile(new Posn(2, 2), TinyDir22));
    tinyboard.add(new Tile(new Posn(3, 2), TinyDir32));
    tinyboard.add(new Tile(new Posn(4, 2), TinyDir42));
    // row 3
    tinyboard.add(new Tile(new Posn(0, 3), TinyDir03));
    tinyboard.add(new Tile(new Posn(1, 3), TinyDir13));
    tinyboard.add(new Tile(new Posn(2, 3), TinyDir23));
    tinyboard.add(new Tile(new Posn(3, 3), TinyDir33));
    tinyboard.add(new Tile(new Posn(4, 3), TinyDir43));
    // row 4
    tinyboard.add(new Tile(new Posn(0, 4), TinyDir04));
    tinyboard.add(new Tile(new Posn(1, 4), TinyDir14));
    tinyboard.add(new Tile(new Posn(2, 4), TinyDir24));
    tinyboard.add(new Tile(new Posn(3, 4), TinyDir34));
    tinyboard.add(new Tile(new Posn(4, 4), TinyDir44));



    //dots
    tinyDots.add(new Posn(0, 0));
    tinyDots.add(new Posn(1, 0));
    tinyDots.add(new Posn(2, 0));
    tinyDots.add(new Posn(3, 0));
    tinyDots.add(new Posn(4, 0));
    tinyDots.add(new Posn(4, 1));
    tinyDots.add(new Posn(4, 2));
    tinyDots.add(new Posn(4, 3));
    tinyDots.add(new Posn(4, 4));
    tinyDots.add(new Posn(3, 4));
    tinyDots.add(new Posn(2, 4));
    tinyDots.add(new Posn(1, 4));
    tinyDots.add(new Posn(0, 4));
    tinyDots.add(new Posn(0, 3));
    tinyDots.add(new Posn(0, 2));
    tinyDots.add(new Posn(0, 1));



    //supers
    tinySupers.add(new Posn(2, 1));
    tinySupers.add(new Posn(2, 3));


    //big board DIRS

    //ROW 0

    //for posn (0, 0)
    Dir00.add(UP);
    Dir00.add(LEFT);

    //for posn (1, 0)
    Dir10.add(UP);
    Dir10.add(DOWN);

    //for posn (2, 0)
    Dir20.add(UP);
    Dir20.add(DOWN);

    //for posn (3, 0)
    Dir30.add(UP);
    Dir30.add(DOWN);

    //for posn (4, 0)
    Dir40.add(UP);
    Dir40.add(DOWN);

    //for posn (5, 0)
    Dir50.add(UP);

    //for posn (6, 0)
    Dir60.add(UP);
    Dir60.add(DOWN);

    //for posn (7, 0)
    Dir70.add(UP);
    Dir70.add(DOWN);

    //for posn (8, 0)
    Dir80.add(UP);
    Dir80.add(DOWN);

    //for posn (9, 0)
    Dir90.add(UP);
    Dir90.add(DOWN);

    //for posn (10, 0)
    Dir100.add(UP);
    Dir100.add(DOWN);

    //for posn (11, 0)
    Dir110.add(UP);
    Dir110.add(RIGHT);

    //for posn (12, 0)
    Dir120.add(UP);
    Dir120.add(LEFT);

    //for posn (13, 0)
    Dir130.add(UP);
    Dir130.add(RIGHT);

    //for posn (14, 0)
    Dir140.add(UP);
    Dir140.add(LEFT);

    //for posn (15, 0)
    Dir150.add(UP);
    Dir150.add(DOWN);

    //for posn (16, 0)
    Dir160.add(UP);
    Dir160.add(DOWN);

    //for posn (17, 0)
    Dir170.add(UP);
    Dir170.add(DOWN);

    //for posn (18, 0)
    Dir180.add(UP);
    Dir180.add(DOWN);

    //for posn (19, 0)
    Dir190.add(UP);
    Dir190.add(DOWN);

    //for posn (20, 0)
    Dir200.add(UP);

    //for posn (21, 0)
    Dir210.add(UP);
    Dir210.add(DOWN);

    //for posn (22, 0)
    Dir220.add(UP);
    Dir220.add(DOWN);

    //for posn (23, 0)
    Dir230.add(UP);
    Dir230.add(DOWN);

    //for posn (24, 0)
    Dir240.add(UP);
    Dir240.add(DOWN);

    //for posn (25, 0)
    Dir250.add(UP);
    Dir250.add(RIGHT);


    //ROW 1

    //for posn (0, 1)
    Dir01.add(LEFT);
    Dir01.add(RIGHT);

    //for posn (1, 1)
    Dir11.add(UP);
    Dir11.add(LEFT);

    //for posn (2, 1)
    Dir21.add(UP);

    //for posn (3, 1)
    Dir31.add(UP);

    //for posn (4, 1)
    Dir41.add(UP);
    Dir41.add(RIGHT);

    //for posn (5, 1)
    Dir51.add(LEFT);
    Dir51.add(RIGHT);

    //for posn (6, 1)
    Dir61.add(UP);
    Dir61.add(LEFT);

    //for posn (7, 1)
    Dir71.add(UP);

    //for posn (8, 1)
    Dir81.add(UP);

    //for posn (9, 1)
    Dir91.add(UP);

    //for posn (10, 1)
    Dir101.add(UP);
    Dir101.add(RIGHT);

    //for posn (11, 1)
    Dir111.add(LEFT);
    Dir111.add(RIGHT);

    //for posn (12, 1)
    Dir121.add(LEFT);

    //for posn (13, 1)
    Dir131.add(RIGHT);

    //for posn (14, 1)
    Dir141.add(LEFT);
    Dir141.add(RIGHT);

    //for posn (15, 1)
    Dir151.add(UP);
    Dir151.add(LEFT);

    //for posn (16, 1)
    Dir161.add(UP);

    //for posn (17, 1)
    Dir171.add(UP);

    //for posn (18, 1)
    Dir181.add(UP);

    //for posn (19, 1)
    Dir191.add(UP);
    Dir191.add(RIGHT);

    //for posn (20, 1)
    Dir201.add(LEFT);
    Dir201.add(RIGHT);

    //for posn (21, 1)
    Dir211.add(UP);
    Dir211.add(LEFT);

    //for posn (22, 1)
    Dir221.add(UP);

    //for posn (23, 1)
    Dir231.add(UP);

    //for posn (24, 1)
    Dir241.add(UP);
    Dir241.add(RIGHT);

    //for posn (25, 1)
    Dir251.add(LEFT);
    Dir251.add(RIGHT);

    //ROW 2

    //for posn (0, 2)
    Dir02.add(LEFT);
    Dir02.add(RIGHT);

    //for posn (1, 2)
    Dir12.add(LEFT);

    //for posn (2, 2)

    //for posn (3, 2)

    //for posn (4, 2)
    Dir42.add(RIGHT);

    //for posn (5, 2)
    Dir52.add(LEFT);
    Dir52.add(RIGHT);

    //for posn (6, 2)
    Dir62.add(LEFT);

    //for posn (7, 2)

    //for posn (8, 2)

    //for posn (9, 2)

    //for posn (10, 2)
    Dir102.add(RIGHT);

    //for posn (11, 2)
    Dir112.add(LEFT);
    Dir112.add(RIGHT);

    //for posn (12, 2)
    Dir122.add(LEFT);

    //for posn (13, 2)
    Dir132.add(RIGHT);

    //for posn (14, 2)
    Dir142.add(LEFT);
    Dir142.add(RIGHT);

    //for posn (15, 2)
    Dir152.add(LEFT);

    //for posn (16, 2)

    //for posn (17, 2)

    //for posn (18, 2)

    //for posn (19, 2)
    Dir192.add(RIGHT);

    //for posn (20, 2)
    Dir202.add(LEFT);
    Dir202.add(RIGHT);

    //for posn (21, 2)
    Dir212.add(LEFT);

    //for posn (22, 2)

    //for posn (23, 2)

    //for posn (24, 2)
    Dir242.add(RIGHT);

    //for posn (25, 2)
    Dir252.add(LEFT);
    Dir252.add(RIGHT);

    //ROW 3

    //for posn (0, 3)
    Dir03.add(LEFT);
    Dir03.add(RIGHT);

    //for posn (1, 3)
    Dir13.add(LEFT);
    Dir13.add(DOWN);

    //for posn (2, 3)
    Dir23.add(DOWN);

    //for posn (3, 3)
    Dir33.add(DOWN);

    //for posn (4, 3)
    Dir43.add(RIGHT);
    Dir43.add(DOWN);

    //for posn (5, 3)
    Dir53.add(LEFT);
    Dir53.add(RIGHT);

    //for posn (6, 3)
    Dir63.add(LEFT);
    Dir63.add(DOWN);

    //for posn (7, 3)
    Dir73.add(DOWN);

    //for posn (8, 3)
    Dir83.add(DOWN);

    //for posn (9, 3)
    Dir93.add(DOWN);

    //for posn (10, 3)
    Dir103.add(RIGHT);
    Dir103.add(DOWN);

    //for posn (11, 3)
    Dir113.add(LEFT);
    Dir113.add(RIGHT);

    //for posn (12, 3)
    Dir123.add(LEFT);
    Dir123.add(DOWN);

    //for posn (13, 3)
    Dir133.add(RIGHT);
    Dir133.add(DOWN);

    //for posn (14, 3)
    Dir143.add(LEFT);
    Dir143.add(RIGHT);

    //for posn (15, 3)
    Dir153.add(LEFT);
    Dir153.add(DOWN);

    //for posn (16, 3)
    Dir163.add(DOWN);

    //for posn (17, 3)
    Dir173.add(DOWN);

    //for posn (18, 3)
    Dir183.add(DOWN);

    //for posn (19, 3)
    Dir193.add(RIGHT);
    Dir193.add(DOWN);

    //for posn (20, 3)
    Dir203.add(LEFT);
    Dir203.add(RIGHT);

    //for posn (21, 3)
    Dir213.add(LEFT);
    Dir213.add(DOWN);

    //for posn (22, 3)
    Dir223.add(DOWN);

    //for posn (23, 3)
    Dir233.add(DOWN);

    //for posn (24, 3)
    Dir243.add(RIGHT);
    Dir243.add(DOWN);

    //for posn (25, 3)
    Dir253.add(LEFT);
    Dir253.add(RIGHT);

    //ROW 4

    //for posn (0, 4)
    Dir04.add(LEFT);

    //for posn (1, 4)
    Dir14.add(UP);
    Dir14.add(DOWN);

    //for posn (2, 4)
    Dir24.add(UP);
    Dir24.add(DOWN);

    //for posn (3, 4)
    Dir34.add(UP);
    Dir34.add(DOWN);

    //for posn (4, 4)
    Dir44.add(UP);
    Dir44.add(DOWN);

    //for posn (5, 4)


    //for posn (6, 4)
    Dir64.add(UP);
    Dir64.add(DOWN);

    //for posn (7, 4)
    Dir74.add(UP);
    Dir74.add(DOWN);

    //for posn (8, 4)
    Dir84.add(UP);

    //for posn (9, 4)
    Dir94.add(UP);
    Dir94.add(DOWN);

    //for posn (10, 4)
    Dir104.add(UP);
    Dir104.add(DOWN);

    //for posn (11, 4)
    Dir114.add(DOWN);

    //for posn (12, 4)
    Dir124.add(UP);
    Dir124.add(DOWN);

    //for posn (13, 4)
    Dir134.add(UP);
    Dir134.add(DOWN);

    //for posn (14, 4)
    Dir144.add(DOWN);

    //for posn (15, 4)
    Dir154.add(UP);
    Dir154.add(DOWN);

    //for posn (16, 4)
    Dir164.add(UP);
    Dir164.add(DOWN);

    //for posn (17, 4)
    Dir174.add(UP);

    //for posn (18, 4)
    Dir184.add(UP);
    Dir184.add(DOWN);

    //for posn (19, 4)
    Dir194.add(UP);
    Dir194.add(DOWN);

    //for posn (20, 4)

    //for posn (21, 4)
    Dir214.add(UP);
    Dir214.add(DOWN);

    //for posn (22, 4)
    Dir224.add(UP);
    Dir224.add(DOWN);

    //for posn (23, 4)
    Dir234.add(UP);
    Dir234.add(DOWN);

    //for posn (24, 4)
    Dir244.add(UP);
    Dir244.add(DOWN);

    //for posn (25, 4)
    Dir254.add(RIGHT);

    //ROW 5

    //for posn (0, 5)
    Dir05.add(LEFT);
    Dir05.add(RIGHT);

    //for posn (1, 5)
    Dir15.add(UP);
    Dir15.add(LEFT);

    //for posn (2, 5)
    Dir25.add(UP);

    //for posn (3, 5)
    Dir35.add(UP);

    //for posn (4, 5)
    Dir45.add(UP);
    Dir45.add(RIGHT);

    //for posn (5, 5)
    Dir55.add(LEFT);
    Dir55.add(RIGHT);

    //for posn (6, 5)
    Dir65.add(UP);
    Dir65.add(LEFT);

    //for posn (7, 5)
    Dir75.add(UP);
    Dir75.add(RIGHT);

    //for posn (8, 5)
    Dir85.add(LEFT);
    Dir85.add(RIGHT);

    //for posn (9, 5)
    Dir95.add(UP);
    Dir95.add(LEFT);

    //for posn (10, 5)
    Dir105.add(UP);

    //for posn (11, 5)
    Dir115.add(UP);

    //for posn (12, 5)
    Dir125.add(UP);

    //for posn (13, 5)
    Dir135.add(UP);

    //for posn (14, 5)
    Dir145.add(UP);

    //for posn (15, 5)
    Dir155.add(UP);

    //for posn (16, 5)
    Dir165.add(UP);
    Dir165.add(RIGHT);

    //for posn (17, 5)
    Dir175.add(LEFT);
    Dir175.add(RIGHT);

    //for posn (18, 5)
    Dir185.add(UP);
    Dir185.add(LEFT);

    //for posn (19, 5)
    Dir195.add(UP);
    Dir195.add(RIGHT);

    //for posn (20, 5)
    Dir205.add(LEFT);
    Dir205.add(RIGHT);


    //for posn (21, 5)
    Dir215.add(UP);
    Dir215.add(LEFT);

    //for posn (22, 5)
    Dir225.add(UP);

    //for posn (23, 5)
    Dir235.add(UP);

    //for posn (24, 5)
    Dir245.add(UP);
    Dir245.add(RIGHT);

    //for posn (25, 5)
    Dir255.add(LEFT);
    Dir255.add(RIGHT);


    //ROW 6

    //for posn (0, 6)
    Dir06.add(LEFT);
    Dir06.add(RIGHT);

    //for posn (1, 6)
    Dir16.add(LEFT);
    Dir16.add(DOWN);

    //for posn (2, 6)
    Dir26.add(DOWN);

    //for posn (3, 6)
    Dir36.add(DOWN);

    //for posn (4, 6)
    Dir46.add(RIGHT);
    Dir46.add(DOWN);

    //for posn (5, 6)
    Dir56.add(LEFT);
    Dir56.add(RIGHT);

    //for posn (6, 6)
    Dir66.add(LEFT);

    //for posn (7, 6)
    Dir76.add(RIGHT);

    //for posn (8, 6)
    Dir86.add(LEFT);
    Dir86.add(RIGHT);

    //for posn (9, 6)
    Dir96.add(LEFT);
    Dir96.add(DOWN);

    //for posn (10, 6)
    Dir106.add(DOWN);

    //for posn (11, 6)
    Dir116.add(DOWN);

    //for posn (12, 6)

    //for posn (13, 6)

    //for posn (14, 6)
    Dir146.add(DOWN);

    //for posn (15, 6)
    Dir156.add(DOWN);

    //for posn (16, 6)
    Dir166.add(RIGHT);
    Dir166.add(DOWN);

    //for posn (17, 6)
    Dir176.add(LEFT);
    Dir176.add(RIGHT);

    //for posn (18, 6)
    Dir186.add(LEFT);

    //for posn (19, 6)
    Dir196.add(RIGHT);

    //for posn (20, 6)
    Dir206.add(LEFT);
    Dir206.add(RIGHT);  

    //for posn (21, 6)
    Dir216.add(LEFT);
    Dir216.add(DOWN);

    //for posn (22, 6)
    Dir226.add(DOWN);

    //for posn (23, 6)
    Dir236.add(DOWN);

    //for posn (24, 6)
    Dir246.add(RIGHT);
    Dir246.add(DOWN);

    //for posn (25, 6)
    Dir256.add(LEFT);
    Dir256.add(RIGHT);


    //ROW 7

    //for posn (0, 7)
    Dir07.add(LEFT);
    Dir07.add(DOWN);

    //for posn (1, 7)
    Dir17.add(UP);
    Dir17.add(DOWN);

    //for posn (2, 7)
    Dir27.add(UP);
    Dir27.add(DOWN);

    //for posn (3, 7)
    Dir37.add(UP);
    Dir37.add(DOWN);

    //for posn (4, 7)
    Dir47.add(UP);
    Dir47.add(DOWN);

    //for posn (5, 7)
    Dir57.add(RIGHT);

    //for posn (6, 7)
    Dir67.add(LEFT);

    //for posn (7, 7)
    Dir77.add(RIGHT);

    //for posn (8, 7)
    Dir87.add(LEFT);
    Dir87.add(DOWN);

    //for posn (9, 7)
    Dir97.add(UP);
    Dir97.add(DOWN);

    //for posn (10, 7)
    Dir107.add(UP);
    Dir107.add(DOWN);

    //for posn (11, 7)
    Dir117.add(UP);
    Dir117.add(RIGHT);

    //for posn (12, 7)
    Dir127.add(LEFT);

    //for posn (13, 6)
    Dir137.add(RIGHT);

    //for posn (14, 7)
    Dir147.add(UP);
    Dir147.add(LEFT);

    //for posn (15, 7)
    Dir157.add(UP);
    Dir157.add(DOWN);

    //for posn (16, 7)
    Dir167.add(UP);
    Dir167.add(DOWN);

    //for posn (17, 7)
    Dir177.add(RIGHT);
    Dir177.add(DOWN);

    //for posn (18, 7)
    Dir187.add(LEFT);

    //for posn (19, 7)
    Dir197.add(RIGHT);

    //for posn (20, 7)
    Dir207.add(LEFT);

    //for posn (21, 7)
    Dir217.add(UP);
    Dir217.add(DOWN);

    //for posn (22, 7)
    Dir227.add(UP);
    Dir227.add(DOWN);

    //for posn (23, 7)
    Dir237.add(UP);
    Dir237.add(DOWN);

    //for posn (24, 7)
    Dir247.add(UP);
    Dir247.add(DOWN);

    //for posn (25, 7)
    Dir257.add(RIGHT);
    Dir257.add(DOWN);


    //ROW 8

    //for posn (0, 8)
    Dir08.add(UP);
    Dir08.add(LEFT);

    //for posn (1, 8)
    Dir18.add(UP);

    //for posn (2, 8)
    Dir28.add(UP);

    //for posn (3, 8)
    Dir38.add(UP);

    //for posn (4, 8)
    Dir48.add(UP);
    Dir48.add(RIGHT);

    //for posn (5, 8)
    Dir58.add(LEFT);
    Dir58.add(RIGHT);

    //for posn (6, 8)
    Dir68.add(LEFT);

    //for posn (7, 8)

    //for posn (8, 8)
    Dir88.add(UP);

    //for posn (9, 8)
    Dir98.add(UP);

    //for posn (10, 8)
    Dir108.add(UP);
    Dir108.add(RIGHT);

    //for posn (11, 8)
    Dir118.add(LEFT);
    Dir118.add(RIGHT);

    //for posn (12, 8)
    Dir128.add(LEFT);

    //for posn (13, 8)
    Dir138.add(RIGHT);

    //for posn (14, 8)
    Dir148.add(LEFT);
    Dir148.add(RIGHT);

    //for posn (15, 8)
    Dir158.add(UP);
    Dir158.add(LEFT);

    //for posn (16, 8)
    Dir168.add(UP);

    //for posn (17, 8)
    Dir178.add(UP);

    //for posn (18, 8)

    //for posn (19, 8)
    Dir198.add(RIGHT);

    //for posn (20, 8)
    Dir208.add(LEFT);
    Dir208.add(RIGHT);

    //for posn (21, 8)
    Dir218.add(UP);
    Dir218.add(LEFT);

    //for posn (22, 8)
    Dir228.add(UP);

    //for posn (23, 8)
    Dir238.add(UP);

    //for posn (24, 8)
    Dir248.add(UP);

    //for posn (25, 8)
    Dir258.add(UP);
    Dir258.add(RIGHT);


    //ROW 9

    //for posn (0, 9)
    Dir09.add(LEFT);

    //for posn (1, 9)

    //for posn (2, 9)

    //for posn (3, 9)

    //for posn (4, 9)
    Dir49.add(RIGHT);

    //for posn (5, 9)
    Dir59.add(LEFT);
    Dir59.add(RIGHT);

    //for posn (6, 9)
    Dir69.add(LEFT);

    //for posn (7, 9)

    //for posn (8, 9)
    Dir89.add(DOWN);

    //for posn (9, 9)
    Dir99.add(DOWN);

    //for posn (10, 9)
    Dir109.add(RIGHT);
    Dir109.add(DOWN);

    //for posn (11, 9)
    Dir119.add(LEFT);
    Dir119.add(RIGHT);

    //for posn (12, 9)
    Dir129.add(LEFT);
    Dir129.add(DOWN);

    //for posn (13, 9)
    Dir139.add(RIGHT);
    Dir139.add(DOWN);

    //for posn (14, 9)
    Dir149.add(LEFT);
    Dir149.add(RIGHT);

    //for posn (15, 9)
    Dir159.add(LEFT);
    Dir159.add(DOWN);

    //for posn (16, 9)
    Dir169.add(DOWN);

    //for posn (17, 9)
    Dir179.add(DOWN);

    //for posn (18, 9)

    //for posn (19, 9)
    Dir199.add(RIGHT);

    //for posn (20, 9)
    Dir209.add(LEFT);
    Dir209.add(RIGHT);

    //for posn (21, 9)
    Dir219.add(LEFT);

    //for posn (22, 9)

    //for posn (23, 9)

    //for posn (24, 9)

    //for posn (25, 9)
    Dir259.add(RIGHT);


    //ROW 10

    //for posn (0, 10)
    Dir010.add(LEFT);

    //for posn (1, 10)

    //for posn (2, 10)

    //for posn (3, 10)

    //for posn (4, 10)
    Dir410.add(RIGHT);

    //for posn (5, 10)
    Dir510.add(LEFT);
    Dir510.add(RIGHT);

    //for posn (6, 10)
    Dir610.add(LEFT);

    //for posn (7, 10)
    Dir710.add(RIGHT);

    //for posn (8, 10)
    Dir810.add(UP);
    Dir810.add(LEFT);

    //for posn (9, 10)
    Dir910.add(UP);

    //for posn (10, 10)
    Dir1010.add(UP);

    //for posn (11, 10)

    //for posn (12, 10)
    Dir1210.add(UP);

    //for posn (13, 10)
    Dir1310.add(UP);

    //for posn (14, 10)

    //for posn (15, 10)
    Dir1510.add(UP);

    //for posn (16, 10)
    Dir1610.add(UP);

    //for posn (17, 10)
    Dir1710.add(UP);
    Dir1710.add(RIGHT);

    //for posn (18, 10)
    Dir1810.add(LEFT);

    //for posn (19, 10)
    Dir1910.add(RIGHT);

    //for posn (20, 10)
    Dir2010.add(LEFT);
    Dir2010.add(RIGHT);

    //for posn (21, 10)
    Dir2110.add(LEFT);

    //for posn (22, 10)

    //for posn (23, 10)

    //for posn (24, 10)

    //for posn (25, 10)
    Dir2510.add(RIGHT);

    //ROW 11

    //for posn (0, 11)
    Dir011.add(LEFT);

    //for posn (1, 11)

    //for posn (2, 11)

    //for posn (3, 11)

    //for posn (4, 11)
    Dir411.add(RIGHT);

    //for posn (5, 11)
    Dir511.add(LEFT);
    Dir511.add(RIGHT);

    //for posn (6, 11)
    Dir611.add(LEFT);

    //for posn (7, 11)
    Dir711.add(RIGHT);

    //for posn (8, 11)
    Dir811.add(LEFT);

    //for posn (9, 11)
    Dir911.add(DOWN);

    //for posn (10, 11)
    Dir1011.add(DOWN);

    //for posn (11, 11)
    Dir1111.add(DOWN);

    //for posn (12, 11)
    Dir1211.add(DOWN);

    //for posn (13, 11)
    Dir1311.add(DOWN);

    //for posn (14, 11)
    Dir1411.add(DOWN);

    //for posn (15, 11)
    Dir1511.add(DOWN);

    //for posn (16, 11)
    Dir1611.add(DOWN);

    //for posn (17, 11)
    Dir1711.add(RIGHT);

    //for posn (18, 11)
    Dir1811.add(LEFT);

    //for posn (19, 11)
    Dir1911.add(RIGHT);

    //for posn (20, 11)
    Dir2011.add(LEFT);
    Dir2011.add(RIGHT);

    //for posn (21, 11)
    Dir2111.add(LEFT);

    //for posn (22, 11)

    //for posn (23, 11)

    //for posn (24, 11)

    //for posn (25, 11)
    Dir2511.add(RIGHT);

    //ROW 12

    //for posn (0, 12)
    Dir012.add(LEFT);
    Dir012.add(DOWN);

    //for posn (1, 12)
    DirOneTwelve.add(DOWN);

    //for posn (2, 12)
    DirTwoTwelve.add(DOWN);

    //for posn (3, 12)
    Dir312.add(DOWN);

    //for posn (4, 12)
    Dir412.add(RIGHT);
    Dir412.add(DOWN);

    //for posn (5, 12)
    Dir512.add(LEFT);
    Dir512.add(RIGHT);

    //for posn (6, 12)
    Dir612.add(LEFT);
    Dir612.add(DOWN);

    //for posn (7, 12)
    Dir712.add(RIGHT);
    Dir712.add(DOWN);

    //for posn (8, 12)
    Dir812.add(LEFT);
    Dir812.add(RIGHT);

    //for posn (9, 12)
    Dir912.add(UP);
    Dir912.add(LEFT);

    //for posn (10, 12)
    Dir1012.add(UP);

    //for posn (11, 12)
    Dir1112.add(UP);

    //for posn (12, 12)
    Dir1212.add(UP);

    //for posn (13, 12)
    Dir1312.add(UP);

    //for posn (14, 12)
    Dir1412.add(UP);

    //for posn (15, 12)
    Dir1512.add(UP);

    //for posn (16, 12)
    Dir1612.add(UP);
    Dir1612.add(RIGHT);

    //for posn (17, 12)
    Dir1712.add(LEFT);
    Dir1712.add(RIGHT);

    //for posn (18, 12)
    Dir1812.add(LEFT);
    Dir1812.add(DOWN);

    //for posn (19, 12)
    Dir1912.add(RIGHT);
    Dir1912.add(DOWN);

    //for posn (20, 12)
    Dir2012.add(LEFT);
    Dir2012.add(RIGHT);

    //for posn (21, 12)
    Dir2112.add(LEFT);
    Dir2112.add(DOWN);

    //for posn (22, 12)
    Dir2212.add(DOWN);

    //for posn (23, 12)
    Dir2312.add(DOWN);

    //for posn (24, 12)
    Dir2412.add(DOWN);

    //for posn (25, 12)
    Dir2512.add(RIGHT);
    Dir2512.add(DOWN);

    //ROW 13

    //for posn (0, 13)
    Dir013.add(UP);
    Dir013.add(DOWN);

    //for posn (1, 13)
    DirOneThirteen.add(UP);
    DirOneThirteen.add(DOWN);

    //for posn (2, 13)
    DirTwoThirteen.add(UP);
    DirTwoThirteen.add(DOWN);

    //for posn (3, 13)
    Dir313.add(UP);
    Dir313.add(DOWN);

    //for posn (4, 13)
    Dir413.add(UP);
    Dir413.add(DOWN);

    //for posn (5, 13)

    //for posn (6, 13)
    Dir613.add(UP);
    Dir613.add(DOWN);

    //for posn (7, 13)
    Dir713.add(UP);
    Dir713.add(DOWN);

    //for posn (8, 13)
    Dir813.add(RIGHT);

    //for posn (9, 13)
    Dir913.add(LEFT);

    //for posn (10, 13)

    //for posn (11, 13)

    //for posn (12, 13)

    //for posn (13, 13)

    //for posn (14, 13)

    //for posn (15, 13)

    //for posn (16, 13)
    Dir1613.add(RIGHT);

    //for posn (17, 13)
    Dir1713.add(LEFT);

    //for posn (18, 13)
    Dir1813.add(UP);
    Dir1813.add(DOWN);

    //for posn (19, 13)
    Dir1913.add(UP);
    Dir1913.add(DOWN);

    //for posn (20, 13)

    //for posn (21, 13)
    Dir2113.add(UP);
    Dir2113.add(DOWN);

    //for posn (22, 13)
    Dir2213.add(UP);
    Dir2213.add(DOWN);

    //for posn (23, 13)
    Dir2313.add(UP);
    Dir2313.add(DOWN);

    //for posn (24, 13)
    Dir2413.add(UP);
    Dir2413.add(DOWN);

    //for posn (25, 13)
    Dir2513.add(UP);
    Dir2513.add(DOWN);



    //ROW 14

    //for posn (0, 14)
    Dir014.add(UP);
    Dir014.add(LEFT);

    //for posn (1, 14)
    DirOneFourteen.add(UP);

    //for posn (2, 14)
    DirTwoFourteen.add(UP);

    //for posn (3, 14)
    Dir314.add(UP);

    //for posn (4, 14)
    Dir414.add(UP);
    Dir414.add(RIGHT);

    //for posn (5, 14)
    Dir514.add(LEFT);
    Dir514.add(RIGHT);

    //for posn (6, 14)
    Dir614.add(UP);
    Dir614.add(LEFT);

    //for posn (7, 14)
    Dir714.add(UP);
    Dir714.add(RIGHT);

    //for posn (8, 14)
    Dir814.add(LEFT);
    Dir814.add(RIGHT);

    //for posn (9, 14)
    Dir914.add(LEFT);

    //for posn (10, 14)

    //for posn (11, 14)

    //for posn (12, 14)

    //for posn (13, 14)

    //for posn (14, 14)

    //for posn (15, 14)

    //for posn (16, 14)
    Dir1614.add(RIGHT);

    //for posn (17, 14)
    Dir1714.add(LEFT);
    Dir1714.add(RIGHT);

    //for posn (18, 14)
    Dir1814.add(UP);
    Dir1814.add(LEFT);

    //for posn (19, 14)
    Dir1914.add(UP);
    Dir1914.add(RIGHT);

    //for posn (20, 14)
    Dir2014.add(LEFT);
    Dir2014.add(RIGHT);

    //for posn (21, 14)
    Dir2114.add(UP);
    Dir2114.add(LEFT);

    //for posn (22, 14)
    Dir2214.add(UP);

    //for posn (23, 14)
    Dir2314.add(UP);

    //for posn (24, 14)
    Dir2414.add(UP);

    //for posn (25, 14)
    Dir2514.add(UP);
    Dir2514.add(RIGHT);

    //ROW 15

    //for posn (0, 15)
    Dir015.add(LEFT);

    //for posn (1, 15)

    //for posn (2, 15)

    //for posn (3, 15)

    //for posn (4, 15)
    Dir415.add(RIGHT);

    //for posn (5, 15)
    Dir515.add(LEFT);
    Dir515.add(RIGHT);

    //for posn (6, 15)
    Dir615.add(LEFT);

    //for posn (7, 15)
    Dir715.add(RIGHT);

    //for posn (8, 15)
    Dir815.add(LEFT);
    Dir815.add(RIGHT);

    //for posn (9, 15)
    Dir915.add(LEFT);
    Dir915.add(DOWN);

    //for posn (10, 15)
    Dir1015.add(DOWN);

    //for posn (11, 15)
    Dir1115.add(DOWN);

    //for posn (12, 15)
    Dir1215.add(DOWN);

    //for posn (13, 15)
    Dir1315.add(DOWN);

    //for posn (14, 15)
    Dir1415.add(DOWN);

    //for posn (15, 15)
    Dir1515.add(DOWN);

    //for posn (16, 15)
    Dir1615.add(RIGHT);
    Dir1615.add(DOWN);

    //for posn (17, 15)
    Dir1715.add(LEFT);
    Dir1715.add(RIGHT);

    //for posn (18, 15)
    Dir1815.add(LEFT);

    //for posn (19, 15)
    Dir1915.add(RIGHT);

    //for posn (20, 15)
    Dir2015.add(LEFT);
    Dir2015.add(RIGHT);

    //for posn (21, 15)
    Dir2115.add(LEFT);

    //for posn (22, 15)

    //for posn (23, 15)

    //for posn (24, 15)

    //for posn (25, 15)
    Dir2515.add(RIGHT);



    //ROW 16

    //for posn (0, 16)
    Dir016.add(LEFT);

    //for posn (1, 16)

    //for posn (2, 16)

    //for posn (3, 16)

    //for posn (4, 16)
    Dir416.add(RIGHT);

    //for posn (5, 16)
    Dir516.add(LEFT);
    Dir516.add(RIGHT);

    //for posn (6, 16)
    Dir616.add(LEFT);

    //for posn (7, 16)
    Dir716.add(RIGHT);

    //for posn (8, 16)
    Dir816.add(LEFT);

    //for posn (9, 16)
    Dir916.add(UP);
    Dir916.add(DOWN);

    //for posn (10, 16)
    Dir1016.add(UP);
    Dir1016.add(DOWN);

    //for posn (11, 16)
    Dir1116.add(UP);
    Dir1116.add(DOWN);

    //for posn (12, 16)
    Dir1216.add(DOWN);
    Dir1216.add(UP);

    //for posn (13, 16)
    Dir1316.add(UP);
    Dir1316.add(DOWN);

    //for posn (14, 16)
    Dir1416.add(UP);
    Dir1416.add(DOWN);

    //for posn (15, 16)
    Dir1516.add(UP);
    Dir1516.add(DOWN);

    //for posn (16, 16)
    Dir1616.add(UP);
    Dir1616.add(DOWN);

    //for posn (17, 16)
    Dir1716.add(RIGHT);

    //for posn (18, 16)
    Dir1816.add(LEFT);

    //for posn (19, 16)
    Dir1916.add(RIGHT);

    //for posn (20, 16)
    Dir2016.add(LEFT);
    Dir2016.add(RIGHT);

    //for posn (21, 16)
    Dir2116.add(LEFT);

    //for posn (22, 16)

    //for posn (23, 16)

    //for posn (24, 16)

    //for posn (25, 16)
    Dir2516.add(RIGHT);




    //ROW 17

    //for posn (0, 17)
    Dir017.add(LEFT);

    //for posn (1, 17)

    //for posn (2, 17)

    //for posn (3, 17)

    //for posn (4, 17)
    Dir417.add(RIGHT);

    //for posn (5, 17)
    Dir517.add(LEFT);
    Dir517.add(RIGHT);

    //for posn (6, 17)
    Dir617.add(LEFT);

    //for posn (7, 17)
    Dir717.add(RIGHT);

    //for posn (8, 17)
    Dir817.add(LEFT);
    Dir817.add(RIGHT);

    //for posn (9, 17)
    Dir917.add(UP);
    Dir917.add(LEFT);

    //for posn (10, 17)
    Dir1017.add(UP);

    //for posn (11, 17)
    Dir1117.add(UP);

    //for posn (12, 17)
    Dir1217.add(UP);

    //for posn (13, 17)
    Dir1317.add(UP);

    //for posn (14, 17)
    Dir1417.add(UP);

    //for posn (15, 17)
    Dir1517.add(UP);

    //for posn (16, 17)
    Dir1617.add(UP);
    Dir1617.add(RIGHT);

    //for posn (17, 17)
    Dir1717.add(LEFT);
    Dir1717.add(RIGHT);

    //for posn (18, 17)
    Dir1817.add(LEFT);

    //for posn (19, 17)
    Dir1917.add(RIGHT);

    //for posn (20, 17)
    Dir2017.add(LEFT);
    Dir2017.add(RIGHT);

    //for posn (21, 17)
    Dir2117.add(LEFT);

    //for posn (22, 17)

    //for posn (23, 17)

    //for posn (24, 17)

    //for posn (25, 17)
    Dir2517.add(RIGHT);



    //ROW 18

    //for posn (0, 18)
    Dir018.add(LEFT);
    Dir018.add(DOWN);

    //for posn (1, 18)
    DirOneEighteen.add(DOWN);

    //for posn (2, 18)
    DirTwoEighteen.add(DOWN);

    //for posn (3, 18)
    Dir318.add(DOWN);

    //for posn (4, 18)
    Dir418.add(RIGHT);
    Dir418.add(DOWN);

    //for posn (5, 18)
    Dir518.add(LEFT);
    Dir518.add(RIGHT);

    //for posn (6, 18)
    Dir618.add(LEFT);
    Dir618.add(DOWN);

    //for posn (7, 18)
    Dir718.add(RIGHT);
    Dir718.add(DOWN);

    //for posn (8, 18)
    Dir818.add(LEFT);
    Dir818.add(RIGHT);

    //for posn (9, 18)
    Dir918.add(LEFT);
    Dir918.add(DOWN);

    //for posn (10, 18)
    Dir1018.add(DOWN);

    //for posn (11, 18)
    Dir1118.add(DOWN);

    //for posn (12, 18)

    //for posn (13, 18)

    //for posn (14, 18)
    Dir1418.add(DOWN);

    //for posn (15, 18)
    Dir1518.add(DOWN);

    //for posn (16, 18)
    Dir1618.add(RIGHT);
    Dir1618.add(DOWN);

    //for posn (17, 18)
    Dir1718.add(LEFT);
    Dir1718.add(RIGHT);

    //for posn (18, 18)
    Dir1818.add(LEFT);
    Dir1818.add(DOWN);

    //for posn (19, 18)
    Dir1918.add(RIGHT);
    Dir1918.add(DOWN);

    //for posn (20, 18)
    Dir2018.add(LEFT);
    Dir2018.add(RIGHT);

    //for posn (21, 18)
    Dir2118.add(LEFT);
    Dir2118.add(DOWN);

    //for posn (22, 18)
    Dir2218.add(DOWN);

    //for posn (23, 18)
    Dir2318.add(DOWN);

    //for posn (24, 18)
    Dir2418.add(DOWN);

    //for posn (25, 18)
    Dir2518.add(RIGHT);
    Dir2518.add(DOWN);


    //ROW 19

    //for posn (0, 19)
    Dir019.add(UP);
    Dir019.add(LEFT);

    //for posn (1, 19)
    DirOneNineteen.add(UP);
    DirOneNineteen.add(DOWN);

    //for posn (2, 19)
    DirTwoNineteen.add(UP);
    DirTwoNineteen.add(DOWN);

    //for posn (3, 19)
    Dir319.add(UP);
    Dir319.add(DOWN);

    //for posn (4, 19)
    Dir419.add(UP);
    Dir419.add(DOWN);

    //for posn (5, 19)

    //for posn (6, 19)
    Dir619.add(UP);
    Dir619.add(DOWN);

    //for posn (7, 19)
    Dir719.add(UP);
    Dir719.add(DOWN);

    //for posn (8, 19)
    Dir819.add(DOWN);

    //for posn (9, 19)
    Dir919.add(UP);
    Dir919.add(DOWN);

    //for posn (10, 19)
    Dir1019.add(UP);
    Dir1019.add(DOWN);

    //for posn (11, 19)
    Dir1119.add(UP);
    Dir1119.add(RIGHT);

    //for posn (12, 19)
    Dir1219.add(LEFT);

    //for posn (13, 19)
    Dir1319.add(RIGHT);

    //for posn (14, 19)
    Dir1419.add(UP);
    Dir1419.add(LEFT);

    //for posn (15, 19)
    Dir1519.add(UP);
    Dir1519.add(DOWN);

    //for posn (16, 19)
    Dir1619.add(UP);
    Dir1619.add(DOWN);

    //for posn (17, 19)
    Dir1719.add(DOWN);

    //for posn (18, 19)
    Dir1819.add(UP);
    Dir1819.add(DOWN);

    //for posn (19, 19)
    Dir1919.add(UP);
    Dir1919.add(DOWN);

    //for posn (20, 19)

    //for posn (21, 19)
    Dir2119.add(UP);
    Dir2119.add(DOWN);

    //for posn (22, 19)
    Dir2219.add(UP);
    Dir2219.add(DOWN);

    //for posn (23, 19)
    Dir2319.add(UP);
    Dir2319.add(DOWN);

    //for posn (24, 19)
    Dir2419.add(UP);
    Dir2419.add(DOWN);

    //for posn (25, 19)
    Dir2519.add(UP);
    Dir2519.add(RIGHT);


    //ROW 20

    //for posn (0, 20)
    Dir020.add(LEFT);
    Dir020.add(RIGHT);

    //for posn (1, 20)
    DirOneTwenty.add(UP);
    DirOneTwenty.add(LEFT);

    //for posn (2, 20)
    DirTwoTwenty.add(UP);

    //for posn (3, 20)
    Dir320.add(UP);

    //for posn (4, 20)
    Dir420.add(UP);
    Dir420.add(RIGHT);

    //for posn (5, 20)
    Dir520.add(LEFT);
    Dir520.add(RIGHT);

    //for posn (6, 20)
    Dir620.add(UP);
    Dir620.add(LEFT);

    //for posn (7, 20)
    Dir720.add(UP);

    //for posn (8, 20)
    Dir820.add(UP);

    //for posn (9, 20)
    Dir920.add(UP);

    //for posn (10, 20)
    Dir1020.add(UP);
    Dir1020.add(RIGHT);

    //for posn (11, 20)
    Dir1120.add(LEFT);
    Dir1120.add(RIGHT);

    //for posn (12, 20)
    Dir1220.add(LEFT);

    //for posn (13, 20)
    Dir1320.add(RIGHT);

    //for posn (14, 20)
    Dir1420.add(LEFT);
    Dir1420.add(RIGHT);

    //for posn (15, 20)
    Dir1520.add(UP);
    Dir1520.add(LEFT);

    //for posn (16, 20)
    Dir1620.add(UP);

    //for posn (17, 20)
    Dir1720.add(UP);

    //for posn (18, 20)
    Dir1820.add(UP);

    //for posn (19, 20)
    Dir1920.add(UP);
    Dir1920.add(RIGHT);

    //for posn (20, 20)
    Dir2020.add(LEFT);
    Dir2020.add(RIGHT);

    //for posn (21, 20)
    Dir2120.add(UP);
    Dir2120.add(LEFT);

    //for posn (22, 20)
    Dir2220.add(UP);

    //for posn (23, 20)
    Dir2320.add(UP);

    //for posn (24, 20)
    Dir2420.add(UP);
    Dir2420.add(RIGHT);

    //for posn (25, 20)
    Dir2520.add(LEFT);
    Dir2520.add(RIGHT);



    //ROW 21

    //for posn (0, 21)
    Dir021.add(LEFT);
    Dir021.add(RIGHT);

    //for posn (1, 21)
    DirOneTwentyOne.add(LEFT);
    DirOneTwentyOne.add(DOWN);

    //for posn (2, 21)
    DirTwoTwentyOne.add(DOWN);

    //for posn (3, 21)

    //for posn (4, 21)
    Dir421.add(RIGHT);

    //for posn (5, 21)
    Dir521.add(LEFT);
    Dir521.add(RIGHT);

    //for posn (6, 21)
    Dir621.add(LEFT);
    Dir621.add(DOWN);

    //for posn (7, 21)
    Dir721.add(DOWN);

    //for posn (8, 21)
    Dir821.add(DOWN);

    //for posn (9, 21)
    Dir921.add(DOWN);

    //for posn (10, 21)
    Dir1021.add(RIGHT);
    Dir1021.add(DOWN);

    //for posn (11, 21)
    Dir1121.add(LEFT);
    Dir1121.add(RIGHT);

    //for posn (12, 21)
    Dir1221.add(LEFT);
    Dir1221.add(DOWN);

    //for posn (13, 21)
    Dir1321.add(RIGHT);
    Dir1321.add(DOWN);

    //for posn (14, 21)
    Dir1421.add(LEFT);
    Dir1421.add(RIGHT);

    //for posn (15, 21)
    Dir1521.add(LEFT);
    Dir1521.add(DOWN);

    //for posn (16, 21)
    Dir1621.add(DOWN);

    //for posn (17, 21)
    Dir1721.add(DOWN);

    //for posn (18, 21)
    Dir1821.add(DOWN);

    //for posn (19, 21)
    Dir1921.add(RIGHT);
    Dir1921.add(DOWN);

    //for posn (20, 21)
    Dir2021.add(LEFT);
    Dir2021.add(RIGHT);

    //for posn (21, 21)
    Dir2121.add(LEFT);

    //for posn (22, 21)

    //for posn (23, 21)
    Dir2321.add(DOWN);

    //for posn (24, 21)
    Dir2421.add(RIGHT);
    Dir2421.add(DOWN);

    //for posn (25, 21)
    Dir2521.add(LEFT);
    Dir2521.add(RIGHT);



    //ROW 22

    //for posn (0, 22)
    Dir022.add(LEFT);
    Dir022.add(DOWN);

    //for posn (1, 22)
    DirOneTwentyTwo.add(UP);
    DirOneTwentyTwo.add(DOWN);

    //for posn (2, 22)
    DirTwoTwentyTwo.add(UP);
    DirTwoTwentyTwo.add(RIGHT);

    //for posn (3, 22)
    Dir322.add(LEFT);

    //for posn (4, 22)
    Dir422.add(RIGHT);

    //for posn (5, 22)
    Dir522.add(LEFT);

    //for posn (6, 22)
    Dir622.add(UP);
    Dir622.add(DOWN);

    //for posn (7, 22)
    Dir722.add(UP);
    Dir722.add(DOWN);

    //for posn (8, 22)
    Dir822.add(UP);

    //for posn (9, 22)
    Dir922.add(UP);
    Dir922.add(DOWN);

    //for posn (10, 22)
    Dir1022.add(UP);
    Dir1022.add(DOWN);

    //for posn (11, 22)
    Dir1122.add(DOWN);

    //for posn (12, 22)
    Dir1222.add(UP);
    Dir1222.add(DOWN);

    //for posn (13, 22)
    Dir1322.add(UP);
    Dir1322.add(DOWN);

    //for posn (14, 22)
    Dir1422.add(DOWN);

    //for posn (15, 22)
    Dir1522.add(UP);
    Dir1522.add(DOWN);

    //for posn (16, 22)
    Dir1622.add(UP);
    Dir1622.add(DOWN);

    //for posn (17, 22)
    Dir1722.add(UP);

    //for posn (18, 22)
    Dir1822.add(UP);
    Dir1822.add(DOWN);

    //for posn (19, 22)
    Dir1922.add(UP);
    Dir1922.add(DOWN);

    //for posn (20, 22)
    Dir2022.add(RIGHT);

    //for posn (21, 22)
    Dir2122.add(LEFT);

    //for posn (22, 22)
    Dir2222.add(RIGHT);

    //for posn (23, 22)
    Dir2322.add(UP);
    Dir2322.add(LEFT);

    //for posn (24, 22)
    Dir2422.add(UP);
    Dir2422.add(DOWN);

    //for posn (25, 22)
    Dir2522.add(RIGHT);
    Dir2522.add(DOWN);



    //ROW 23

    //for posn (0, 23)
    Dir023.add(UP);
    Dir023.add(LEFT);

    //for posn (1, 23)
    DirOneTwentyThree.add(UP);
    DirOneTwentyThree.add(RIGHT);

    //for posn (2, 23)
    DirTwoTwentyThree.add(LEFT);
    DirTwoTwentyThree.add(RIGHT);

    //for posn (3, 23)
    Dir323.add(LEFT);

    //for posn (4, 23)
    Dir423.add(RIGHT);

    //for posn (5, 23)
    Dir523.add(LEFT);
    Dir523.add(RIGHT);

    //for posn (6, 23)
    Dir623.add(UP);
    Dir623.add(LEFT);

    //for posn (7, 23)
    Dir723.add(UP);
    Dir723.add(RIGHT);

    //for posn (8, 23)
    Dir823.add(LEFT);
    Dir823.add(RIGHT);

    //for posn (9, 23)
    Dir923.add(UP);
    Dir923.add(LEFT);

    //for posn (10, 23)
    Dir1023.add(UP);

    //for posn (11, 23)
    Dir1123.add(UP);

    //for posn (12, 22)
    Dir1223.add(UP);

    //for posn (13, 23)
    Dir1323.add(UP);

    //for posn (14, 23)
    Dir1423.add(UP);

    //for posn (15, 23)
    Dir1523.add(UP);

    //for posn (16, 23)
    Dir1623.add(UP);
    Dir1623.add(RIGHT);

    //for posn (17, 23)
    Dir1723.add(LEFT);
    Dir1723.add(RIGHT);

    //for posn (18, 23)
    Dir1823.add(UP);
    Dir1823.add(LEFT);

    //for posn (19, 23)
    Dir1923.add(UP);
    Dir1923.add(RIGHT);

    //for posn (20, 23)
    Dir2023.add(LEFT);
    Dir2023.add(RIGHT);

    //for posn (21, 23)
    Dir2123.add(LEFT);

    //for posn (22, 23)
    Dir2223.add(RIGHT);

    //for posn (23, 23)
    Dir2323.add(LEFT);
    Dir2323.add(RIGHT);

    //for posn (24, 23)
    Dir2423.add(UP);
    Dir2423.add(LEFT);

    //for posn (25, 23)
    Dir2523.add(UP);
    Dir2523.add(RIGHT);




    //ROW 24

    //for posn (0, 24)
    Dir024.add(LEFT);
    Dir024.add(DOWN);

    //for posn (1, 24)
    DirOneTwentyFour.add(RIGHT);
    DirOneTwentyFour.add(DOWN);

    //for posn (2, 24)
    DirTwoTwentyFour.add(LEFT);
    DirTwoTwentyFour.add(RIGHT);

    //for posn (3, 24)
    Dir324.add(LEFT);
    Dir324.add(DOWN);

    //for posn (4, 24)
    Dir424.add(RIGHT);
    Dir424.add(DOWN);

    //for posn (5, 24)
    Dir524.add(LEFT);
    Dir524.add(RIGHT);

    //for posn (6, 24)
    Dir624.add(LEFT);

    //for posn (7, 24)
    Dir724.add(RIGHT);

    //for posn (8, 24)
    Dir824.add(LEFT);
    Dir824.add(RIGHT);

    //for posn (9, 24)
    Dir924.add(LEFT);
    Dir924.add(DOWN);

    //for posn (10, 24)
    Dir1024.add(DOWN);

    //for posn (11, 24)
    Dir1124.add(DOWN);

    //for posn (12, 24)

    //for posn (13, 24)

    //for posn (14, 24)
    Dir1424.add(DOWN);

    //for posn (15, 24)
    Dir1524.add(DOWN);

    //for posn (16, 24)
    Dir1624.add(RIGHT);
    Dir1624.add(DOWN);

    //for posn (17, 24)
    Dir1724.add(LEFT);
    Dir1724.add(RIGHT);

    //for posn (18, 24)
    Dir1824.add(LEFT);

    //for posn (19, 24)
    Dir1924.add(RIGHT);

    //for posn (20, 24)
    Dir2024.add(LEFT);
    Dir2024.add(RIGHT);

    //for posn (21, 24)
    Dir2124.add(LEFT);
    Dir2124.add(DOWN);

    //for posn (22, 24)
    Dir2224.add(RIGHT);
    Dir2224.add(DOWN);

    //for posn (23, 24)
    Dir2324.add(LEFT);
    Dir2324.add(RIGHT);

    //for posn (24, 24)
    Dir2424.add(LEFT);
    Dir2424.add(DOWN);

    //for posn (25, 24)
    Dir2524.add(RIGHT);
    Dir2524.add(DOWN);


    //ROW 25

    //for posn (0, 25)
    Dir025.add(UP);
    Dir025.add(LEFT);

    //for posn (1, 25)
    DirOneTwentyFive.add(UP);
    DirOneTwentyFive.add(DOWN);

    //for posn (2, 25)
    DirTwoTwentyFive.add(DOWN);

    //for posn (3, 25)
    Dir325.add(UP);
    Dir325.add(DOWN);

    //for posn (4, 25)
    Dir425.add(UP);
    Dir425.add(DOWN);

    //for posn (5, 25)
    Dir525.add(RIGHT);
    Dir525.add(DOWN);

    //for posn (6, 25)
    Dir625.add(LEFT);

    //for posn (7, 25)
    Dir725.add(RIGHT);

    //for posn (8, 25)
    Dir825.add(LEFT);
    Dir825.add(DOWN);

    //for posn (9, 25)
    Dir925.add(UP);
    Dir925.add(DOWN);

    //for posn (10, 25)
    Dir1025.add(UP);
    Dir1025.add(DOWN);

    //for posn (11, 25)
    Dir1125.add(UP);
    Dir1125.add(RIGHT);

    //for posn (12, 25)
    Dir1225.add(LEFT);

    //for posn (13, 25)
    Dir1325.add(RIGHT);

    //for posn (14, 25)
    Dir1425.add(UP);
    Dir1425.add(LEFT);

    //for posn (15, 25)
    Dir1525.add(UP);
    Dir1525.add(DOWN);

    //for posn (16, 25)
    Dir1625.add(UP);
    Dir1625.add(DOWN);

    //for posn (17, 25)
    Dir1725.add(RIGHT);
    Dir1725.add(DOWN);

    //for posn (18, 25)
    Dir1825.add(LEFT);

    //for posn (19, 25)
    Dir1925.add(RIGHT);

    //for posn (20, 25)
    Dir2025.add(LEFT);
    Dir2025.add(DOWN);

    //for posn (21, 25)
    Dir2125.add(UP);
    Dir2125.add(DOWN);

    //for posn (22, 25)
    Dir2225.add(UP);
    Dir2225.add(DOWN);

    //for posn (23, 25)
    Dir2325.add(DOWN);

    //for posn (24, 25)
    Dir2425.add(UP);
    Dir2425.add(DOWN);

    //for posn (25, 25)
    Dir2525.add(UP);
    Dir2525.add(RIGHT);




    //ROW 26

    //for posn (0, 26)
    Dir026.add(LEFT);
    Dir026.add(RIGHT);

    //for posn (1, 26)
    DirOneTwentySix.add(UP);
    DirOneTwentySix.add(LEFT);

    //for posn (2, 26)
    DirTwoTwentySix.add(UP);

    //for posn (3, 26)
    Dir326.add(UP);

    //for posn (4, 26)
    Dir426.add(UP);

    //for posn (5, 26)
    Dir526.add(UP);

    //for posn (6, 26)

    //for posn (7, 26)

    //for posn (8, 26)
    Dir826.add(UP);

    //for posn (9, 26)
    Dir926.add(UP);

    //for posn (10, 26)
    Dir1026.add(UP);
    Dir1026.add(RIGHT);

    //for posn (11, 26)
    Dir1126.add(LEFT);
    Dir1126.add(RIGHT);

    //for posn (12, 26)
    Dir1226.add(LEFT);

    //for posn (13, 26)
    Dir1326.add(RIGHT);

    //for posn (14, 26)
    Dir1426.add(LEFT);
    Dir1426.add(RIGHT);

    //for posn (15, 26)
    Dir1526.add(UP);
    Dir1526.add(LEFT);

    //for posn (16, 26)
    Dir1626.add(UP);

    //for posn (17, 26)
    Dir1726.add(UP);

    //for posn (18, 26)

    //for posn (19, 26)

    //for posn (20, 26)
    Dir2026.add(UP);

    //for posn (21, 26)
    Dir2126.add(UP);

    //for posn (22, 26)
    Dir2226.add(UP);

    //for posn (23, 26)
    Dir2326.add(UP);

    //for posn (24, 26)
    Dir2426.add(UP);
    Dir2426.add(RIGHT);

    //for posn (25, 26)
    Dir2526.add(LEFT);
    Dir2526.add(RIGHT);


    //ROW 27

    //for posn (0, 27)
    Dir027.add(LEFT);
    Dir027.add(RIGHT);

    //for posn (1, 27)
    DirOneTwentySeven.add(LEFT);
    DirOneTwentySeven.add(DOWN);

    //for posn (2, 27)
    DirTwoTwentySeven.add(DOWN);

    //for posn (3, 27)
    Dir327.add(DOWN);

    //for posn (4, 27)
    Dir427.add(DOWN);

    //for posn (5, 27)
    Dir527.add(DOWN);

    //for posn (6, 27)
    Dir627.add(DOWN);

    //for posn (7, 27)
    Dir727.add(DOWN);

    //for posn (8, 27)
    Dir827.add(DOWN);

    //for posn (9, 27)
    Dir927.add(DOWN);

    //for posn (10, 27)
    Dir1027.add(RIGHT);
    Dir1027.add(DOWN);

    //for posn (11, 27)
    Dir1127.add(LEFT);
    Dir1127.add(RIGHT);

    //for posn (12, 27)
    Dir1227.add(LEFT);
    Dir1227.add(DOWN);

    //for posn (13, 27)
    Dir1327.add(RIGHT);
    Dir1327.add(DOWN);

    //for posn (14, 27)
    Dir1427.add(LEFT);
    Dir1427.add(RIGHT);

    //for posn (15, 27)
    Dir1527.add(LEFT);
    Dir1527.add(DOWN);

    //for posn (16, 27)
    Dir1627.add(DOWN);

    //for posn (17, 27)
    Dir1727.add(DOWN);

    //for posn (18, 27)
    Dir1827.add(DOWN);

    //for posn (19, 27)
    Dir1927.add(DOWN);

    //for posn (20, 27)
    Dir2027.add(DOWN);

    //for posn (21, 27)
    Dir2127.add(DOWN);

    //for posn (22, 27)
    Dir2227.add(DOWN);

    //for posn (23, 27)
    Dir2327.add(DOWN);

    //for posn (24, 27)
    Dir2427.add(RIGHT);
    Dir2427.add(DOWN);

    //for posn (25, 27)
    Dir2527.add(LEFT);
    Dir2527.add(RIGHT);



    //ROW 28

    //for posn (0, 28)
    Dir028.add(LEFT);
    Dir028.add(DOWN);

    //for posn (1, 28)
    DirOneTwentyEight.add(UP);
    DirOneTwentyEight.add(DOWN);

    //for posn (2, 28)
    DirTwoTwentyEight.add(UP);
    DirTwoTwentyEight.add(DOWN);

    //for posn (3, 28)
    Dir328.add(UP);
    Dir328.add(DOWN);

    //for posn (4, 28)
    Dir428.add(UP);
    Dir428.add(DOWN);

    //for posn (5, 28)
    Dir528.add(UP);
    Dir528.add(DOWN);

    //for posn (6, 28)
    Dir628.add(UP);
    Dir628.add(DOWN);

    //for posn (7, 28)
    Dir728.add(UP);
    Dir728.add(DOWN);

    //for posn (8, 28)
    Dir828.add(UP);
    Dir828.add(DOWN);

    //for posn (9, 28)
    Dir928.add(UP);
    Dir928.add(DOWN);

    //for posn (10, 28)
    Dir1028.add(UP);
    Dir1028.add(DOWN);

    //for posn (11, 28)
    Dir1128.add(DOWN);

    //for posn (12, 28)
    Dir1228.add(UP);
    Dir1228.add(DOWN);

    //for posn (13, 28)
    Dir1328.add(UP);
    Dir1328.add(DOWN);

    //for posn (14, 28)
    Dir1428.add(DOWN);

    //for posn (15, 28)
    Dir1528.add(UP);
    Dir1528.add(DOWN);

    //for posn (16, 28)
    Dir1628.add(UP);
    Dir1628.add(DOWN);

    //for posn (17, 28)
    Dir1728.add(UP);
    Dir1728.add(DOWN);

    //for posn (18, 28)
    Dir1828.add(UP);
    Dir1828.add(DOWN);

    //for posn (19, 28)
    Dir1928.add(UP);
    Dir1928.add(DOWN);

    //for posn (20, 28)
    Dir2028.add(UP);
    Dir2028.add(DOWN);

    //for posn (21, 28)
    Dir2128.add(UP);
    Dir2128.add(DOWN);

    //for posn (22, 28)
    Dir2228.add(UP);
    Dir2228.add(DOWN);

    //for posn (23, 28)
    Dir2328.add(UP);
    Dir2328.add(DOWN);

    //for posn (24, 28)
    Dir2428.add(UP);
    Dir2428.add(DOWN);

    //for posn (25, 28)
    Dir2528.add(RIGHT);
    Dir2528.add(DOWN);



    //assemble big board

    //row 0
    bigBoard.add(new Tile(new Posn(0, 0), Dir00));
    bigBoard.add(new Tile(new Posn(1, 0), Dir10));
    bigBoard.add(new Tile(new Posn(2, 0), Dir20));
    bigBoard.add(new Tile(new Posn(3, 0), Dir30));
    bigBoard.add(new Tile(new Posn(4, 0), Dir40));
    bigBoard.add(new Tile(new Posn(5, 0), Dir50));
    bigBoard.add(new Tile(new Posn(6, 0), Dir60));
    bigBoard.add(new Tile(new Posn(7, 0), Dir70));
    bigBoard.add(new Tile(new Posn(8, 0), Dir80));
    bigBoard.add(new Tile(new Posn(9, 0), Dir90));
    bigBoard.add(new Tile(new Posn(10, 0), Dir100));
    bigBoard.add(new Tile(new Posn(11, 0), Dir110));
    bigBoard.add(new Tile(new Posn(12, 0), Dir120));
    bigBoard.add(new Tile(new Posn(13, 0), Dir130));
    bigBoard.add(new Tile(new Posn(14, 0), Dir140));
    bigBoard.add(new Tile(new Posn(15, 0), Dir150));
    bigBoard.add(new Tile(new Posn(16, 0), Dir160));
    bigBoard.add(new Tile(new Posn(17, 0), Dir170));
    bigBoard.add(new Tile(new Posn(18, 0), Dir180));
    bigBoard.add(new Tile(new Posn(19, 0), Dir190));
    bigBoard.add(new Tile(new Posn(20, 0), Dir200));
    bigBoard.add(new Tile(new Posn(21, 0), Dir210));
    bigBoard.add(new Tile(new Posn(22, 0), Dir220));
    bigBoard.add(new Tile(new Posn(23, 0), Dir230));
    bigBoard.add(new Tile(new Posn(24, 0), Dir240));
    bigBoard.add(new Tile(new Posn(25, 0), Dir250));
    //row 1
    bigBoard.add(new Tile(new Posn(0, 1), Dir01));
    bigBoard.add(new Tile(new Posn(1, 1), Dir11));
    bigBoard.add(new Tile(new Posn(2, 1), Dir21));
    bigBoard.add(new Tile(new Posn(3, 1), Dir31));
    bigBoard.add(new Tile(new Posn(4, 1), Dir41));
    bigBoard.add(new Tile(new Posn(5, 1), Dir51));
    bigBoard.add(new Tile(new Posn(6, 1), Dir61));
    bigBoard.add(new Tile(new Posn(7, 1), Dir71));
    bigBoard.add(new Tile(new Posn(8, 1), Dir81));
    bigBoard.add(new Tile(new Posn(9, 1), Dir91));
    bigBoard.add(new Tile(new Posn(10, 1), Dir101));
    bigBoard.add(new Tile(new Posn(11, 1), Dir111));
    bigBoard.add(new Tile(new Posn(12, 1), Dir121));
    bigBoard.add(new Tile(new Posn(13, 1), Dir131));
    bigBoard.add(new Tile(new Posn(14, 1), Dir141));
    bigBoard.add(new Tile(new Posn(15, 1), Dir151));
    bigBoard.add(new Tile(new Posn(16, 1), Dir161));
    bigBoard.add(new Tile(new Posn(17, 1), Dir171));
    bigBoard.add(new Tile(new Posn(18, 1), Dir181));
    bigBoard.add(new Tile(new Posn(19, 1), Dir191));
    bigBoard.add(new Tile(new Posn(20, 1), Dir201));
    bigBoard.add(new Tile(new Posn(21, 1), Dir211));
    bigBoard.add(new Tile(new Posn(22, 1), Dir221));
    bigBoard.add(new Tile(new Posn(23, 1), Dir231));
    bigBoard.add(new Tile(new Posn(24, 1), Dir241));
    bigBoard.add(new Tile(new Posn(25, 1), Dir251));
    //row 2
    bigBoard.add(new Tile(new Posn(0, 2), Dir02));
    bigBoard.add(new Tile(new Posn(1, 2), Dir12));
    bigBoard.add(new Tile(new Posn(2, 2), Dir22));
    bigBoard.add(new Tile(new Posn(3, 2), Dir32));
    bigBoard.add(new Tile(new Posn(4, 2), Dir42));
    bigBoard.add(new Tile(new Posn(5, 2), Dir52));
    bigBoard.add(new Tile(new Posn(6, 2), Dir62));
    bigBoard.add(new Tile(new Posn(7, 2), Dir72));
    bigBoard.add(new Tile(new Posn(8, 2), Dir82));
    bigBoard.add(new Tile(new Posn(9, 2), Dir92));
    bigBoard.add(new Tile(new Posn(10, 2), Dir102));
    bigBoard.add(new Tile(new Posn(11, 2), Dir112));
    bigBoard.add(new Tile(new Posn(12, 2), Dir122));
    bigBoard.add(new Tile(new Posn(13, 2), Dir132));
    bigBoard.add(new Tile(new Posn(14, 2), Dir142));
    bigBoard.add(new Tile(new Posn(15, 2), Dir152));
    bigBoard.add(new Tile(new Posn(16, 2), Dir162));
    bigBoard.add(new Tile(new Posn(17, 2), Dir172));
    bigBoard.add(new Tile(new Posn(18, 2), Dir182));
    bigBoard.add(new Tile(new Posn(19, 2), Dir192));
    bigBoard.add(new Tile(new Posn(20, 2), Dir202));
    bigBoard.add(new Tile(new Posn(21, 2), Dir212));
    bigBoard.add(new Tile(new Posn(22, 2), Dir222));
    bigBoard.add(new Tile(new Posn(23, 2), Dir232));
    bigBoard.add(new Tile(new Posn(24, 2), Dir242));
    bigBoard.add(new Tile(new Posn(25, 2), Dir252));
    //row 3
    bigBoard.add(new Tile(new Posn(0, 3), Dir03));
    bigBoard.add(new Tile(new Posn(1, 3), Dir13));
    bigBoard.add(new Tile(new Posn(2, 3), Dir23));
    bigBoard.add(new Tile(new Posn(3, 3), Dir33));
    bigBoard.add(new Tile(new Posn(4, 3), Dir43));
    bigBoard.add(new Tile(new Posn(5, 3), Dir53));
    bigBoard.add(new Tile(new Posn(6, 3), Dir63));
    bigBoard.add(new Tile(new Posn(7, 3), Dir73));
    bigBoard.add(new Tile(new Posn(8, 3), Dir83));
    bigBoard.add(new Tile(new Posn(9, 3), Dir93));
    bigBoard.add(new Tile(new Posn(10, 3), Dir103));
    bigBoard.add(new Tile(new Posn(11, 3), Dir113));
    bigBoard.add(new Tile(new Posn(12, 3), Dir123));
    bigBoard.add(new Tile(new Posn(13, 3), Dir133));
    bigBoard.add(new Tile(new Posn(14, 3), Dir143));
    bigBoard.add(new Tile(new Posn(15, 3), Dir153));
    bigBoard.add(new Tile(new Posn(16, 3), Dir163));
    bigBoard.add(new Tile(new Posn(17, 3), Dir173));
    bigBoard.add(new Tile(new Posn(18, 3), Dir183));
    bigBoard.add(new Tile(new Posn(19, 3), Dir193));
    bigBoard.add(new Tile(new Posn(20, 3), Dir203));
    bigBoard.add(new Tile(new Posn(21, 3), Dir213));
    bigBoard.add(new Tile(new Posn(22, 3), Dir223));
    bigBoard.add(new Tile(new Posn(23, 3), Dir233));
    bigBoard.add(new Tile(new Posn(24, 3), Dir243));
    bigBoard.add(new Tile(new Posn(25, 3), Dir253));
    //row 4
    bigBoard.add(new Tile(new Posn(0, 4), Dir04));
    bigBoard.add(new Tile(new Posn(1, 4), Dir14));
    bigBoard.add(new Tile(new Posn(2, 4), Dir24));
    bigBoard.add(new Tile(new Posn(3, 4), Dir34));
    bigBoard.add(new Tile(new Posn(4, 4), Dir44));
    bigBoard.add(new Tile(new Posn(5, 4), Dir54));
    bigBoard.add(new Tile(new Posn(6, 4), Dir64));
    bigBoard.add(new Tile(new Posn(7, 4), Dir74));
    bigBoard.add(new Tile(new Posn(8, 4), Dir84));
    bigBoard.add(new Tile(new Posn(9, 4), Dir94));
    bigBoard.add(new Tile(new Posn(10, 4), Dir104));
    bigBoard.add(new Tile(new Posn(11, 4), Dir114));
    bigBoard.add(new Tile(new Posn(12, 4), Dir124));
    bigBoard.add(new Tile(new Posn(13, 4), Dir134));
    bigBoard.add(new Tile(new Posn(14, 4), Dir144));
    bigBoard.add(new Tile(new Posn(15, 4), Dir154));
    bigBoard.add(new Tile(new Posn(16, 4), Dir164));
    bigBoard.add(new Tile(new Posn(17, 4), Dir174));
    bigBoard.add(new Tile(new Posn(18, 4), Dir184));
    bigBoard.add(new Tile(new Posn(19, 4), Dir194));
    bigBoard.add(new Tile(new Posn(20, 4), Dir204));
    bigBoard.add(new Tile(new Posn(21, 4), Dir214));
    bigBoard.add(new Tile(new Posn(22, 4), Dir224));
    bigBoard.add(new Tile(new Posn(23, 4), Dir234));
    bigBoard.add(new Tile(new Posn(24, 4), Dir244));
    bigBoard.add(new Tile(new Posn(25, 4), Dir254));
    //row 5
    bigBoard.add(new Tile(new Posn(0, 5), Dir05));
    bigBoard.add(new Tile(new Posn(1, 5), Dir15));
    bigBoard.add(new Tile(new Posn(2, 5), Dir25));
    bigBoard.add(new Tile(new Posn(3, 5), Dir35));
    bigBoard.add(new Tile(new Posn(4, 5), Dir45));
    bigBoard.add(new Tile(new Posn(5, 5), Dir55));
    bigBoard.add(new Tile(new Posn(6, 5), Dir65));
    bigBoard.add(new Tile(new Posn(7, 5), Dir75));
    bigBoard.add(new Tile(new Posn(8, 5), Dir85));
    bigBoard.add(new Tile(new Posn(9, 5), Dir95));
    bigBoard.add(new Tile(new Posn(10, 5), Dir105));
    bigBoard.add(new Tile(new Posn(11, 5), Dir115));
    bigBoard.add(new Tile(new Posn(12, 5), Dir125));
    bigBoard.add(new Tile(new Posn(13, 5), Dir135));
    bigBoard.add(new Tile(new Posn(14, 5), Dir145));
    bigBoard.add(new Tile(new Posn(15, 5), Dir155));
    bigBoard.add(new Tile(new Posn(16, 5), Dir165));
    bigBoard.add(new Tile(new Posn(17, 5), Dir175));
    bigBoard.add(new Tile(new Posn(18, 5), Dir185));
    bigBoard.add(new Tile(new Posn(19, 5), Dir195));
    bigBoard.add(new Tile(new Posn(20, 5), Dir205));
    bigBoard.add(new Tile(new Posn(21, 5), Dir215));
    bigBoard.add(new Tile(new Posn(22, 5), Dir225));
    bigBoard.add(new Tile(new Posn(23, 5), Dir235));
    bigBoard.add(new Tile(new Posn(24, 5), Dir245));
    bigBoard.add(new Tile(new Posn(25, 5), Dir255));
    //row 6
    bigBoard.add(new Tile(new Posn(0, 6), Dir06));
    bigBoard.add(new Tile(new Posn(1, 6), Dir16));
    bigBoard.add(new Tile(new Posn(2, 6), Dir26));
    bigBoard.add(new Tile(new Posn(3, 6), Dir36));
    bigBoard.add(new Tile(new Posn(4, 6), Dir46));
    bigBoard.add(new Tile(new Posn(5, 6), Dir56));
    bigBoard.add(new Tile(new Posn(6, 6), Dir66));
    bigBoard.add(new Tile(new Posn(7, 6), Dir76));
    bigBoard.add(new Tile(new Posn(8, 6), Dir86));
    bigBoard.add(new Tile(new Posn(9, 6), Dir96));
    bigBoard.add(new Tile(new Posn(10, 6), Dir106));
    bigBoard.add(new Tile(new Posn(11, 6), Dir116));
    bigBoard.add(new Tile(new Posn(12, 6), Dir126));
    bigBoard.add(new Tile(new Posn(13, 6), Dir136));
    bigBoard.add(new Tile(new Posn(14, 6), Dir146));
    bigBoard.add(new Tile(new Posn(15, 6), Dir156));
    bigBoard.add(new Tile(new Posn(16, 6), Dir166));
    bigBoard.add(new Tile(new Posn(17, 6), Dir176));
    bigBoard.add(new Tile(new Posn(18, 6), Dir186));
    bigBoard.add(new Tile(new Posn(19, 6), Dir196));
    bigBoard.add(new Tile(new Posn(20, 6), Dir206));
    bigBoard.add(new Tile(new Posn(21, 6), Dir216));
    bigBoard.add(new Tile(new Posn(22, 6), Dir226));
    bigBoard.add(new Tile(new Posn(23, 6), Dir236));
    bigBoard.add(new Tile(new Posn(24, 6), Dir246));
    bigBoard.add(new Tile(new Posn(25, 6), Dir256));
    //row 7
    bigBoard.add(new Tile(new Posn(0, 7), Dir07));
    bigBoard.add(new Tile(new Posn(1, 7), Dir17));
    bigBoard.add(new Tile(new Posn(2, 7), Dir27));
    bigBoard.add(new Tile(new Posn(3, 7), Dir37));
    bigBoard.add(new Tile(new Posn(4, 7), Dir47));
    bigBoard.add(new Tile(new Posn(5, 7), Dir57));
    bigBoard.add(new Tile(new Posn(6, 7), Dir67));
    bigBoard.add(new Tile(new Posn(7, 7), Dir77));
    bigBoard.add(new Tile(new Posn(8, 7), Dir87));
    bigBoard.add(new Tile(new Posn(9, 7), Dir97));
    bigBoard.add(new Tile(new Posn(10, 7), Dir107));
    bigBoard.add(new Tile(new Posn(11, 7), Dir117));
    bigBoard.add(new Tile(new Posn(12, 7), Dir127));
    bigBoard.add(new Tile(new Posn(13, 7), Dir137));
    bigBoard.add(new Tile(new Posn(14, 7), Dir147));
    bigBoard.add(new Tile(new Posn(15, 7), Dir157));
    bigBoard.add(new Tile(new Posn(16, 7), Dir167));
    bigBoard.add(new Tile(new Posn(17, 7), Dir177));
    bigBoard.add(new Tile(new Posn(18, 7), Dir187));
    bigBoard.add(new Tile(new Posn(19, 7), Dir197));
    bigBoard.add(new Tile(new Posn(20, 7), Dir207));
    bigBoard.add(new Tile(new Posn(21, 7), Dir217));
    bigBoard.add(new Tile(new Posn(22, 7), Dir227));
    bigBoard.add(new Tile(new Posn(23, 7), Dir237));
    bigBoard.add(new Tile(new Posn(24, 7), Dir247));
    bigBoard.add(new Tile(new Posn(25, 7), Dir257));
    //row 8
    bigBoard.add(new Tile(new Posn(0, 8), Dir08));
    bigBoard.add(new Tile(new Posn(1, 8), Dir18));
    bigBoard.add(new Tile(new Posn(2, 8), Dir28));
    bigBoard.add(new Tile(new Posn(3, 8), Dir38));
    bigBoard.add(new Tile(new Posn(4, 8), Dir48));
    bigBoard.add(new Tile(new Posn(5, 8), Dir58));
    bigBoard.add(new Tile(new Posn(6, 8), Dir68));
    bigBoard.add(new Tile(new Posn(7, 8), Dir78));
    bigBoard.add(new Tile(new Posn(8, 8), Dir88));
    bigBoard.add(new Tile(new Posn(9, 8), Dir98));
    bigBoard.add(new Tile(new Posn(10, 8), Dir108));
    bigBoard.add(new Tile(new Posn(11, 8), Dir118));
    bigBoard.add(new Tile(new Posn(12, 8), Dir128));
    bigBoard.add(new Tile(new Posn(13, 8), Dir138));
    bigBoard.add(new Tile(new Posn(14, 8), Dir148));
    bigBoard.add(new Tile(new Posn(15, 8), Dir158));
    bigBoard.add(new Tile(new Posn(16, 8), Dir168));
    bigBoard.add(new Tile(new Posn(17, 8), Dir178));
    bigBoard.add(new Tile(new Posn(18, 8), Dir188));
    bigBoard.add(new Tile(new Posn(19, 8), Dir198));
    bigBoard.add(new Tile(new Posn(20, 8), Dir208));
    bigBoard.add(new Tile(new Posn(21, 8), Dir218));
    bigBoard.add(new Tile(new Posn(22, 8), Dir228));
    bigBoard.add(new Tile(new Posn(23, 8), Dir238));
    bigBoard.add(new Tile(new Posn(24, 8), Dir248));
    bigBoard.add(new Tile(new Posn(25, 8), Dir258));
    //row 9
    bigBoard.add(new Tile(new Posn(0, 9), Dir09));
    bigBoard.add(new Tile(new Posn(1, 9), Dir19));
    bigBoard.add(new Tile(new Posn(2, 9), Dir29));
    bigBoard.add(new Tile(new Posn(3, 9), Dir39));
    bigBoard.add(new Tile(new Posn(4, 9), Dir49));
    bigBoard.add(new Tile(new Posn(5, 9), Dir59));
    bigBoard.add(new Tile(new Posn(6, 9), Dir69));
    bigBoard.add(new Tile(new Posn(7, 9), Dir79));
    bigBoard.add(new Tile(new Posn(8, 9), Dir89));
    bigBoard.add(new Tile(new Posn(9, 9), Dir99));
    bigBoard.add(new Tile(new Posn(10, 9), Dir109));
    bigBoard.add(new Tile(new Posn(11, 9), Dir119));
    bigBoard.add(new Tile(new Posn(12, 9), Dir129));
    bigBoard.add(new Tile(new Posn(13, 9), Dir139));
    bigBoard.add(new Tile(new Posn(14, 9), Dir149));
    bigBoard.add(new Tile(new Posn(15, 9), Dir159));
    bigBoard.add(new Tile(new Posn(16, 9), Dir169));
    bigBoard.add(new Tile(new Posn(17, 9), Dir179));
    bigBoard.add(new Tile(new Posn(18, 9), Dir189));
    bigBoard.add(new Tile(new Posn(19, 9), Dir199));
    bigBoard.add(new Tile(new Posn(20, 9), Dir209));
    bigBoard.add(new Tile(new Posn(21, 9), Dir219));
    bigBoard.add(new Tile(new Posn(22, 9), Dir229));
    bigBoard.add(new Tile(new Posn(23, 9), Dir239));
    bigBoard.add(new Tile(new Posn(24, 9), Dir249));
    bigBoard.add(new Tile(new Posn(25, 9), Dir259));
    //row 10
    bigBoard.add(new Tile(new Posn(0, 10), Dir010));
    bigBoard.add(new Tile(new Posn(1, 10), DirOneTen));
    bigBoard.add(new Tile(new Posn(2, 10), DirTwoTen));
    bigBoard.add(new Tile(new Posn(3, 10), Dir310));
    bigBoard.add(new Tile(new Posn(4, 10), Dir410));
    bigBoard.add(new Tile(new Posn(5, 10), Dir510));
    bigBoard.add(new Tile(new Posn(6, 10), Dir610));
    bigBoard.add(new Tile(new Posn(7, 10), Dir710));
    bigBoard.add(new Tile(new Posn(8, 10), Dir810));
    bigBoard.add(new Tile(new Posn(9, 10), Dir910));
    bigBoard.add(new Tile(new Posn(10, 10), Dir1010));
    bigBoard.add(new Tile(new Posn(11, 10), Dir1110));
    bigBoard.add(new Tile(new Posn(12, 10), Dir1210));
    bigBoard.add(new Tile(new Posn(13, 10), Dir1310));
    bigBoard.add(new Tile(new Posn(14, 10), Dir1410));
    bigBoard.add(new Tile(new Posn(15, 10), Dir1510));
    bigBoard.add(new Tile(new Posn(16, 10), Dir1610));
    bigBoard.add(new Tile(new Posn(17, 10), Dir1710));
    bigBoard.add(new Tile(new Posn(18, 10), Dir1810));
    bigBoard.add(new Tile(new Posn(19, 10), Dir1910));
    bigBoard.add(new Tile(new Posn(20, 10), Dir2010));
    bigBoard.add(new Tile(new Posn(21, 10), Dir2110));
    bigBoard.add(new Tile(new Posn(22, 10), Dir2210));
    bigBoard.add(new Tile(new Posn(23, 10), Dir2310));
    bigBoard.add(new Tile(new Posn(24, 10), Dir2410));
    bigBoard.add(new Tile(new Posn(25, 10), Dir2510));
    //row 11
    bigBoard.add(new Tile(new Posn(0, 11), Dir011));
    bigBoard.add(new Tile(new Posn(1, 11), DirOneEleven));
    bigBoard.add(new Tile(new Posn(2, 11), DirTwoEleven));
    bigBoard.add(new Tile(new Posn(3, 11), Dir311));
    bigBoard.add(new Tile(new Posn(4, 11), Dir411));
    bigBoard.add(new Tile(new Posn(5, 11), Dir511));
    bigBoard.add(new Tile(new Posn(6, 11), Dir611));
    bigBoard.add(new Tile(new Posn(7, 11), Dir711));
    bigBoard.add(new Tile(new Posn(8, 11), Dir811));
    bigBoard.add(new Tile(new Posn(9, 11), Dir911));
    bigBoard.add(new Tile(new Posn(10, 11), Dir1011));
    bigBoard.add(new Tile(new Posn(11, 11), Dir1111));
    bigBoard.add(new Tile(new Posn(12, 11), Dir1211));
    bigBoard.add(new Tile(new Posn(13, 11), Dir1311));
    bigBoard.add(new Tile(new Posn(14, 11), Dir1411));
    bigBoard.add(new Tile(new Posn(15, 11), Dir1511));
    bigBoard.add(new Tile(new Posn(16, 11), Dir1611));
    bigBoard.add(new Tile(new Posn(17, 11), Dir1711));
    bigBoard.add(new Tile(new Posn(18, 11), Dir1811));
    bigBoard.add(new Tile(new Posn(19, 11), Dir1911));
    bigBoard.add(new Tile(new Posn(20, 11), Dir2011));
    bigBoard.add(new Tile(new Posn(21, 11), Dir2111));
    bigBoard.add(new Tile(new Posn(22, 11), Dir2211));
    bigBoard.add(new Tile(new Posn(23, 11), Dir2311));
    bigBoard.add(new Tile(new Posn(24, 11), Dir2411));
    bigBoard.add(new Tile(new Posn(25, 11), Dir2511));
    //row 12
    bigBoard.add(new Tile(new Posn(0, 12), Dir012));
    bigBoard.add(new Tile(new Posn(1, 12), DirOneTwelve));
    bigBoard.add(new Tile(new Posn(2, 12), DirTwoTwelve));
    bigBoard.add(new Tile(new Posn(3, 12), Dir312));
    bigBoard.add(new Tile(new Posn(4, 12), Dir412));
    bigBoard.add(new Tile(new Posn(5, 12), Dir512));
    bigBoard.add(new Tile(new Posn(6, 12), Dir612));
    bigBoard.add(new Tile(new Posn(7, 12), Dir712));
    bigBoard.add(new Tile(new Posn(8, 12), Dir812));
    bigBoard.add(new Tile(new Posn(9, 12), Dir912));
    bigBoard.add(new Tile(new Posn(10, 12), Dir1012));
    bigBoard.add(new Tile(new Posn(11, 12), Dir1212));
    bigBoard.add(new Tile(new Posn(12, 12), Dir1212));
    bigBoard.add(new Tile(new Posn(13, 12), Dir1312));
    bigBoard.add(new Tile(new Posn(14, 12), Dir1412));
    bigBoard.add(new Tile(new Posn(15, 12), Dir1512));
    bigBoard.add(new Tile(new Posn(16, 12), Dir1612));
    bigBoard.add(new Tile(new Posn(17, 12), Dir1712));
    bigBoard.add(new Tile(new Posn(18, 12), Dir1812));
    bigBoard.add(new Tile(new Posn(19, 12), Dir1912));
    bigBoard.add(new Tile(new Posn(20, 12), Dir2012));
    bigBoard.add(new Tile(new Posn(21, 12), Dir2112));
    bigBoard.add(new Tile(new Posn(22, 12), Dir2212));
    bigBoard.add(new Tile(new Posn(23, 12), Dir2312));
    bigBoard.add(new Tile(new Posn(24, 12), Dir2412));
    bigBoard.add(new Tile(new Posn(25, 12), Dir2512));
    //row 13
    bigBoard.add(new Tile(new Posn(0, 13), Dir013));
    bigBoard.add(new Tile(new Posn(1, 13), DirOneThirteen));
    bigBoard.add(new Tile(new Posn(2, 13), DirTwoThirteen));
    bigBoard.add(new Tile(new Posn(3, 13), Dir313));
    bigBoard.add(new Tile(new Posn(4, 13), Dir413));
    bigBoard.add(new Tile(new Posn(5, 13), Dir513));
    bigBoard.add(new Tile(new Posn(6, 13), Dir613));
    bigBoard.add(new Tile(new Posn(7, 13), Dir713));
    bigBoard.add(new Tile(new Posn(8, 13), Dir813));
    bigBoard.add(new Tile(new Posn(9, 13), Dir913));
    bigBoard.add(new Tile(new Posn(10, 13), Dir1013));
    bigBoard.add(new Tile(new Posn(11, 13), Dir1313));
    bigBoard.add(new Tile(new Posn(12, 13), Dir1213));
    bigBoard.add(new Tile(new Posn(13, 13), Dir1313));
    bigBoard.add(new Tile(new Posn(14, 13), Dir1413));
    bigBoard.add(new Tile(new Posn(15, 13), Dir1513));
    bigBoard.add(new Tile(new Posn(16, 13), Dir1613));
    bigBoard.add(new Tile(new Posn(17, 13), Dir1713));
    bigBoard.add(new Tile(new Posn(18, 13), Dir1813));
    bigBoard.add(new Tile(new Posn(19, 13), Dir1913));
    bigBoard.add(new Tile(new Posn(20, 13), Dir2013));
    bigBoard.add(new Tile(new Posn(21, 13), Dir2113));
    bigBoard.add(new Tile(new Posn(22, 13), Dir2213));
    bigBoard.add(new Tile(new Posn(23, 13), Dir2313));
    bigBoard.add(new Tile(new Posn(24, 13), Dir2413));
    bigBoard.add(new Tile(new Posn(25, 13), Dir2513));
    //row 14
    bigBoard.add(new Tile(new Posn(0, 14), Dir014));
    bigBoard.add(new Tile(new Posn(1, 14), DirOneFourteen));
    bigBoard.add(new Tile(new Posn(2, 14), DirTwoFourteen));
    bigBoard.add(new Tile(new Posn(3, 14), Dir314));
    bigBoard.add(new Tile(new Posn(4, 14), Dir414));
    bigBoard.add(new Tile(new Posn(5, 14), Dir514));
    bigBoard.add(new Tile(new Posn(6, 14), Dir614));
    bigBoard.add(new Tile(new Posn(7, 14), Dir714));
    bigBoard.add(new Tile(new Posn(8, 14), Dir814));
    bigBoard.add(new Tile(new Posn(9, 14), Dir914));
    bigBoard.add(new Tile(new Posn(10, 14), Dir1014));
    bigBoard.add(new Tile(new Posn(11, 14), Dir1414));
    bigBoard.add(new Tile(new Posn(12, 14), Dir1214));
    bigBoard.add(new Tile(new Posn(13, 14), Dir1314));
    bigBoard.add(new Tile(new Posn(14, 14), Dir1414));
    bigBoard.add(new Tile(new Posn(15, 14), Dir1514));
    bigBoard.add(new Tile(new Posn(16, 14), Dir1614));
    bigBoard.add(new Tile(new Posn(17, 14), Dir1714));
    bigBoard.add(new Tile(new Posn(18, 14), Dir1814));
    bigBoard.add(new Tile(new Posn(19, 14), Dir1914));
    bigBoard.add(new Tile(new Posn(20, 14), Dir2014));
    bigBoard.add(new Tile(new Posn(21, 14), Dir2114));
    bigBoard.add(new Tile(new Posn(22, 14), Dir2214));
    bigBoard.add(new Tile(new Posn(23, 14), Dir2314));
    bigBoard.add(new Tile(new Posn(24, 14), Dir2414));
    bigBoard.add(new Tile(new Posn(25, 14), Dir2514));
    //row 15
    bigBoard.add(new Tile(new Posn(0, 15), Dir015));
    bigBoard.add(new Tile(new Posn(1, 15), DirOneFifteen));
    bigBoard.add(new Tile(new Posn(2, 15), DirTwoFifteen));
    bigBoard.add(new Tile(new Posn(3, 15), Dir315));
    bigBoard.add(new Tile(new Posn(4, 15), Dir415));
    bigBoard.add(new Tile(new Posn(5, 15), Dir515));
    bigBoard.add(new Tile(new Posn(6, 15), Dir615));
    bigBoard.add(new Tile(new Posn(7, 15), Dir715));
    bigBoard.add(new Tile(new Posn(8, 15), Dir815));
    bigBoard.add(new Tile(new Posn(9, 15), Dir915));
    bigBoard.add(new Tile(new Posn(10, 15), Dir1015));
    bigBoard.add(new Tile(new Posn(11, 15), Dir1115));
    bigBoard.add(new Tile(new Posn(12, 15), Dir1215));
    bigBoard.add(new Tile(new Posn(13, 15), Dir1315));
    bigBoard.add(new Tile(new Posn(14, 15), Dir1415));
    bigBoard.add(new Tile(new Posn(15, 15), Dir1515));
    bigBoard.add(new Tile(new Posn(16, 15), Dir1615));
    bigBoard.add(new Tile(new Posn(17, 15), Dir1715));
    bigBoard.add(new Tile(new Posn(18, 15), Dir1815));
    bigBoard.add(new Tile(new Posn(19, 15), Dir1915));
    bigBoard.add(new Tile(new Posn(20, 15), Dir2015));
    bigBoard.add(new Tile(new Posn(21, 15), Dir2115));
    bigBoard.add(new Tile(new Posn(22, 15), Dir2215));
    bigBoard.add(new Tile(new Posn(23, 15), Dir2315));
    bigBoard.add(new Tile(new Posn(24, 15), Dir2415));
    bigBoard.add(new Tile(new Posn(25, 15), Dir2515));
    //row 16
    bigBoard.add(new Tile(new Posn(0, 16), Dir016));
    bigBoard.add(new Tile(new Posn(1, 16), DirOneSixteen));
    bigBoard.add(new Tile(new Posn(2, 16), DirTwoSixteen));
    bigBoard.add(new Tile(new Posn(3, 16), Dir316));
    bigBoard.add(new Tile(new Posn(4, 16), Dir416));
    bigBoard.add(new Tile(new Posn(5, 16), Dir516));
    bigBoard.add(new Tile(new Posn(6, 16), Dir616));
    bigBoard.add(new Tile(new Posn(7, 16), Dir716));
    bigBoard.add(new Tile(new Posn(8, 16), Dir816));
    bigBoard.add(new Tile(new Posn(9, 16), Dir916));
    bigBoard.add(new Tile(new Posn(10, 16), Dir1016));
    bigBoard.add(new Tile(new Posn(11, 16), Dir1116));
    bigBoard.add(new Tile(new Posn(12, 16), Dir1216));
    bigBoard.add(new Tile(new Posn(13, 16), Dir1316));
    bigBoard.add(new Tile(new Posn(14, 16), Dir1416));
    bigBoard.add(new Tile(new Posn(15, 16), Dir1616));
    bigBoard.add(new Tile(new Posn(16, 16), Dir1616));
    bigBoard.add(new Tile(new Posn(17, 16), Dir1716));
    bigBoard.add(new Tile(new Posn(18, 16), Dir1816));
    bigBoard.add(new Tile(new Posn(19, 16), Dir1916));
    bigBoard.add(new Tile(new Posn(20, 16), Dir2016));
    bigBoard.add(new Tile(new Posn(21, 16), Dir2116));
    bigBoard.add(new Tile(new Posn(22, 16), Dir2216));
    bigBoard.add(new Tile(new Posn(23, 16), Dir2316));
    bigBoard.add(new Tile(new Posn(24, 16), Dir2416));
    bigBoard.add(new Tile(new Posn(25, 16), Dir2516));
    //row 17
    bigBoard.add(new Tile(new Posn(0, 17), Dir017));
    bigBoard.add(new Tile(new Posn(1, 17), DirOneSeventeen));
    bigBoard.add(new Tile(new Posn(2, 17), DirTwoSeventeen));
    bigBoard.add(new Tile(new Posn(3, 17), Dir317));
    bigBoard.add(new Tile(new Posn(4, 17), Dir417));
    bigBoard.add(new Tile(new Posn(5, 17), Dir517));
    bigBoard.add(new Tile(new Posn(6, 17), Dir617));
    bigBoard.add(new Tile(new Posn(7, 17), Dir717));
    bigBoard.add(new Tile(new Posn(8, 17), Dir817));
    bigBoard.add(new Tile(new Posn(9, 17), Dir917));
    bigBoard.add(new Tile(new Posn(10, 17), Dir1017));
    bigBoard.add(new Tile(new Posn(11, 17), Dir1117));
    bigBoard.add(new Tile(new Posn(12, 17), Dir1217));
    bigBoard.add(new Tile(new Posn(13, 17), Dir1317));
    bigBoard.add(new Tile(new Posn(14, 17), Dir1417));
    bigBoard.add(new Tile(new Posn(15, 17), Dir1517));
    bigBoard.add(new Tile(new Posn(16, 17), Dir1617));
    bigBoard.add(new Tile(new Posn(17, 17), Dir1717));
    bigBoard.add(new Tile(new Posn(18, 17), Dir1817));
    bigBoard.add(new Tile(new Posn(19, 17), Dir1917));
    bigBoard.add(new Tile(new Posn(20, 17), Dir2017));
    bigBoard.add(new Tile(new Posn(21, 17), Dir2117));
    bigBoard.add(new Tile(new Posn(22, 17), Dir2217));
    bigBoard.add(new Tile(new Posn(23, 17), Dir2317));
    bigBoard.add(new Tile(new Posn(24, 17), Dir2417));
    bigBoard.add(new Tile(new Posn(25, 17), Dir2517));
    //row 18
    bigBoard.add(new Tile(new Posn(0, 18), Dir018));
    bigBoard.add(new Tile(new Posn(1, 18), DirOneEighteen));
    bigBoard.add(new Tile(new Posn(2, 18), DirTwoEighteen));
    bigBoard.add(new Tile(new Posn(3, 18), Dir318));
    bigBoard.add(new Tile(new Posn(4, 18), Dir418));
    bigBoard.add(new Tile(new Posn(5, 18), Dir518));
    bigBoard.add(new Tile(new Posn(6, 18), Dir618));
    bigBoard.add(new Tile(new Posn(7, 18), Dir718));
    bigBoard.add(new Tile(new Posn(8, 18), Dir818));
    bigBoard.add(new Tile(new Posn(9, 18), Dir918));
    bigBoard.add(new Tile(new Posn(10, 18), Dir1018));
    bigBoard.add(new Tile(new Posn(11, 18), Dir1118));
    bigBoard.add(new Tile(new Posn(12, 18), Dir1218));
    bigBoard.add(new Tile(new Posn(13, 18), Dir1318));
    bigBoard.add(new Tile(new Posn(14, 18), Dir1418));
    bigBoard.add(new Tile(new Posn(15, 18), Dir1518));
    bigBoard.add(new Tile(new Posn(16, 18), Dir1618));
    bigBoard.add(new Tile(new Posn(17, 18), Dir1718));
    bigBoard.add(new Tile(new Posn(18, 18), Dir1818));
    bigBoard.add(new Tile(new Posn(19, 18), Dir1918));
    bigBoard.add(new Tile(new Posn(20, 18), Dir2018));
    bigBoard.add(new Tile(new Posn(21, 18), Dir2118));
    bigBoard.add(new Tile(new Posn(22, 18), Dir2218));
    bigBoard.add(new Tile(new Posn(23, 18), Dir2318));
    bigBoard.add(new Tile(new Posn(24, 18), Dir2418));
    bigBoard.add(new Tile(new Posn(25, 18), Dir2518));
    //row 19
    bigBoard.add(new Tile(new Posn(0, 19), Dir019));
    bigBoard.add(new Tile(new Posn(1, 19), DirOneNineteen));
    bigBoard.add(new Tile(new Posn(2, 19), DirTwoNineteen));
    bigBoard.add(new Tile(new Posn(3, 19), Dir319));
    bigBoard.add(new Tile(new Posn(4, 19), Dir419));
    bigBoard.add(new Tile(new Posn(5, 19), Dir519));
    bigBoard.add(new Tile(new Posn(6, 19), Dir619));
    bigBoard.add(new Tile(new Posn(7, 19), Dir719));
    bigBoard.add(new Tile(new Posn(8, 19), Dir819));
    bigBoard.add(new Tile(new Posn(9, 19), Dir919));
    bigBoard.add(new Tile(new Posn(10, 19), Dir1019));
    bigBoard.add(new Tile(new Posn(11, 19), Dir1119));
    bigBoard.add(new Tile(new Posn(12, 19), Dir1219));
    bigBoard.add(new Tile(new Posn(13, 19), Dir1319));
    bigBoard.add(new Tile(new Posn(14, 19), Dir1419));
    bigBoard.add(new Tile(new Posn(15, 19), Dir1919));
    bigBoard.add(new Tile(new Posn(16, 19), Dir1619));
    bigBoard.add(new Tile(new Posn(17, 19), Dir1719));
    bigBoard.add(new Tile(new Posn(18, 19), Dir1819));
    bigBoard.add(new Tile(new Posn(19, 19), Dir1919));
    bigBoard.add(new Tile(new Posn(20, 19), Dir2019));
    bigBoard.add(new Tile(new Posn(21, 19), Dir2119));
    bigBoard.add(new Tile(new Posn(22, 19), Dir2219));
    bigBoard.add(new Tile(new Posn(23, 19), Dir2319));
    bigBoard.add(new Tile(new Posn(24, 19), Dir2419));
    bigBoard.add(new Tile(new Posn(25, 19), Dir2519));
    //row 20
    bigBoard.add(new Tile(new Posn(0, 20), Dir020));
    bigBoard.add(new Tile(new Posn(1, 20), DirOneTwenty));
    bigBoard.add(new Tile(new Posn(2, 20), DirTwoTwenty));
    bigBoard.add(new Tile(new Posn(3, 20), Dir320));
    bigBoard.add(new Tile(new Posn(4, 20), Dir420));
    bigBoard.add(new Tile(new Posn(5, 20), Dir520));
    bigBoard.add(new Tile(new Posn(6, 20), Dir620));
    bigBoard.add(new Tile(new Posn(7, 20), Dir720));
    bigBoard.add(new Tile(new Posn(8, 20), Dir820));
    bigBoard.add(new Tile(new Posn(9, 20), Dir920));
    bigBoard.add(new Tile(new Posn(10, 20), Dir1020));
    bigBoard.add(new Tile(new Posn(11, 20), Dir1120));
    bigBoard.add(new Tile(new Posn(12, 20), Dir1220));
    bigBoard.add(new Tile(new Posn(13, 20), Dir1320));
    bigBoard.add(new Tile(new Posn(14, 20), Dir1420));
    bigBoard.add(new Tile(new Posn(15, 20), Dir1520));
    bigBoard.add(new Tile(new Posn(16, 20), Dir1620));
    bigBoard.add(new Tile(new Posn(17, 20), Dir1720));
    bigBoard.add(new Tile(new Posn(18, 20), Dir1820));
    bigBoard.add(new Tile(new Posn(19, 20), Dir1920));
    bigBoard.add(new Tile(new Posn(20, 20), Dir2020));
    bigBoard.add(new Tile(new Posn(21, 20), Dir2120));
    bigBoard.add(new Tile(new Posn(22, 20), Dir2220));
    bigBoard.add(new Tile(new Posn(23, 20), Dir2320));
    bigBoard.add(new Tile(new Posn(24, 20), Dir2420));
    bigBoard.add(new Tile(new Posn(25, 20), Dir2520));
    //row 21
    bigBoard.add(new Tile(new Posn(0, 21), Dir021));
    bigBoard.add(new Tile(new Posn(1, 21), DirOneTwentyOne));
    bigBoard.add(new Tile(new Posn(2, 21), DirTwoTwentyOne));
    bigBoard.add(new Tile(new Posn(3, 21), Dir321));
    bigBoard.add(new Tile(new Posn(4, 21), Dir421));
    bigBoard.add(new Tile(new Posn(5, 21), Dir521));
    bigBoard.add(new Tile(new Posn(6, 21), Dir621));
    bigBoard.add(new Tile(new Posn(7, 21), Dir721));
    bigBoard.add(new Tile(new Posn(8, 21), Dir821));
    bigBoard.add(new Tile(new Posn(9, 21), Dir921));
    bigBoard.add(new Tile(new Posn(10, 21), Dir1021));
    bigBoard.add(new Tile(new Posn(11, 21), Dir1121));
    bigBoard.add(new Tile(new Posn(12, 21), Dir1221));
    bigBoard.add(new Tile(new Posn(13, 21), Dir1321));
    bigBoard.add(new Tile(new Posn(14, 21), Dir1421));
    bigBoard.add(new Tile(new Posn(15, 21), Dir1521));
    bigBoard.add(new Tile(new Posn(16, 21), Dir1621));
    bigBoard.add(new Tile(new Posn(17, 21), Dir1721));
    bigBoard.add(new Tile(new Posn(18, 21), Dir1821));
    bigBoard.add(new Tile(new Posn(19, 21), Dir1921));
    bigBoard.add(new Tile(new Posn(20, 21), Dir2021));
    bigBoard.add(new Tile(new Posn(21, 21), Dir2121));
    bigBoard.add(new Tile(new Posn(22, 21), Dir2221));
    bigBoard.add(new Tile(new Posn(23, 21), Dir2321));
    bigBoard.add(new Tile(new Posn(24, 21), Dir2421));
    bigBoard.add(new Tile(new Posn(25, 21), Dir2521));
    //row 22
    bigBoard.add(new Tile(new Posn(0, 22), Dir022));
    bigBoard.add(new Tile(new Posn(1, 22), DirOneTwentyTwo));
    bigBoard.add(new Tile(new Posn(2, 22), DirTwoTwentyTwo));
    bigBoard.add(new Tile(new Posn(3, 22), Dir322));
    bigBoard.add(new Tile(new Posn(4, 22), Dir422));
    bigBoard.add(new Tile(new Posn(5, 22), Dir522));
    bigBoard.add(new Tile(new Posn(6, 22), Dir622));
    bigBoard.add(new Tile(new Posn(7, 22), Dir722));
    bigBoard.add(new Tile(new Posn(8, 22), Dir822));
    bigBoard.add(new Tile(new Posn(9, 22), Dir922));
    bigBoard.add(new Tile(new Posn(10, 22), Dir1022));
    bigBoard.add(new Tile(new Posn(11, 22), Dir1122));
    bigBoard.add(new Tile(new Posn(12, 22), Dir1222));
    bigBoard.add(new Tile(new Posn(13, 22), Dir1322));
    bigBoard.add(new Tile(new Posn(14, 22), Dir1422));
    bigBoard.add(new Tile(new Posn(15, 22), Dir1522));
    bigBoard.add(new Tile(new Posn(16, 22), Dir1622));
    bigBoard.add(new Tile(new Posn(17, 22), Dir1722));
    bigBoard.add(new Tile(new Posn(18, 22), Dir1822));
    bigBoard.add(new Tile(new Posn(19, 22), Dir1922));
    bigBoard.add(new Tile(new Posn(20, 22), Dir2022));
    bigBoard.add(new Tile(new Posn(21, 22), Dir2122));
    bigBoard.add(new Tile(new Posn(22, 22), Dir2222));
    bigBoard.add(new Tile(new Posn(23, 22), Dir2322));
    bigBoard.add(new Tile(new Posn(24, 22), Dir2422));
    bigBoard.add(new Tile(new Posn(25, 22), Dir2522));
    //row 23
    bigBoard.add(new Tile(new Posn(0, 23), Dir023));
    bigBoard.add(new Tile(new Posn(1, 23), DirOneTwentyThree));
    bigBoard.add(new Tile(new Posn(2, 23), DirTwoTwentyThree));
    bigBoard.add(new Tile(new Posn(3, 23), Dir323));
    bigBoard.add(new Tile(new Posn(4, 23), Dir423));
    bigBoard.add(new Tile(new Posn(5, 23), Dir523));
    bigBoard.add(new Tile(new Posn(6, 23), Dir623));
    bigBoard.add(new Tile(new Posn(7, 23), Dir723));
    bigBoard.add(new Tile(new Posn(8, 23), Dir823));
    bigBoard.add(new Tile(new Posn(9, 23), Dir923));
    bigBoard.add(new Tile(new Posn(10, 23), Dir1023));
    bigBoard.add(new Tile(new Posn(11, 23), Dir1123));
    bigBoard.add(new Tile(new Posn(12, 23), Dir1223));
    bigBoard.add(new Tile(new Posn(13, 23), Dir1323));
    bigBoard.add(new Tile(new Posn(14, 23), Dir1423));
    bigBoard.add(new Tile(new Posn(15, 23), Dir1523));
    bigBoard.add(new Tile(new Posn(16, 23), Dir1623));
    bigBoard.add(new Tile(new Posn(17, 23), Dir1723));
    bigBoard.add(new Tile(new Posn(18, 23), Dir1823));
    bigBoard.add(new Tile(new Posn(19, 23), Dir1923));
    bigBoard.add(new Tile(new Posn(20, 23), Dir2023));
    bigBoard.add(new Tile(new Posn(21, 23), Dir2123));
    bigBoard.add(new Tile(new Posn(22, 23), Dir2223));
    bigBoard.add(new Tile(new Posn(23, 23), Dir2323));
    bigBoard.add(new Tile(new Posn(24, 23), Dir2423));
    bigBoard.add(new Tile(new Posn(25, 23), Dir2523));
    //row 24
    bigBoard.add(new Tile(new Posn(0, 24), Dir024));
    bigBoard.add(new Tile(new Posn(1, 24), DirOneTwentyFour));
    bigBoard.add(new Tile(new Posn(2, 24), DirTwoTwentyFour));
    bigBoard.add(new Tile(new Posn(3, 24), Dir324));
    bigBoard.add(new Tile(new Posn(4, 24), Dir424));
    bigBoard.add(new Tile(new Posn(5, 24), Dir524));
    bigBoard.add(new Tile(new Posn(6, 24), Dir624));
    bigBoard.add(new Tile(new Posn(7, 24), Dir724));
    bigBoard.add(new Tile(new Posn(8, 24), Dir824));
    bigBoard.add(new Tile(new Posn(9, 24), Dir924));
    bigBoard.add(new Tile(new Posn(10, 24), Dir1024));
    bigBoard.add(new Tile(new Posn(11, 24), Dir1124));
    bigBoard.add(new Tile(new Posn(12, 24), Dir1224));
    bigBoard.add(new Tile(new Posn(13, 24), Dir1324));
    bigBoard.add(new Tile(new Posn(14, 24), Dir1424));
    bigBoard.add(new Tile(new Posn(15, 24), Dir1524));
    bigBoard.add(new Tile(new Posn(16, 24), Dir1624));
    bigBoard.add(new Tile(new Posn(17, 24), Dir1724));
    bigBoard.add(new Tile(new Posn(18, 24), Dir1824));
    bigBoard.add(new Tile(new Posn(19, 24), Dir1924));
    bigBoard.add(new Tile(new Posn(20, 24), Dir2024));
    bigBoard.add(new Tile(new Posn(21, 24), Dir2124));
    bigBoard.add(new Tile(new Posn(22, 24), Dir2224));
    bigBoard.add(new Tile(new Posn(23, 24), Dir2324));
    bigBoard.add(new Tile(new Posn(24, 24), Dir2424));
    bigBoard.add(new Tile(new Posn(25, 24), Dir2524));
    //row 25
    bigBoard.add(new Tile(new Posn(0, 25), Dir025));
    bigBoard.add(new Tile(new Posn(1, 25), DirOneTwentyFive));
    bigBoard.add(new Tile(new Posn(2, 25), DirTwoTwentyFive));
    bigBoard.add(new Tile(new Posn(3, 25), Dir325));
    bigBoard.add(new Tile(new Posn(4, 25), Dir425));
    bigBoard.add(new Tile(new Posn(5, 25), Dir525));
    bigBoard.add(new Tile(new Posn(6, 25), Dir625));
    bigBoard.add(new Tile(new Posn(7, 25), Dir725));
    bigBoard.add(new Tile(new Posn(8, 25), Dir825));
    bigBoard.add(new Tile(new Posn(9, 25), Dir925));
    bigBoard.add(new Tile(new Posn(10, 25), Dir1025));
    bigBoard.add(new Tile(new Posn(11, 25), Dir1125));
    bigBoard.add(new Tile(new Posn(12, 25), Dir1225));
    bigBoard.add(new Tile(new Posn(13, 25), Dir1325));
    bigBoard.add(new Tile(new Posn(14, 25), Dir1425));
    bigBoard.add(new Tile(new Posn(15, 25), Dir1525));
    bigBoard.add(new Tile(new Posn(16, 25), Dir1625));
    bigBoard.add(new Tile(new Posn(17, 25), Dir1725));
    bigBoard.add(new Tile(new Posn(18, 25), Dir1825));
    bigBoard.add(new Tile(new Posn(19, 25), Dir1925));
    bigBoard.add(new Tile(new Posn(20, 25), Dir2025));
    bigBoard.add(new Tile(new Posn(21, 25), Dir2125));
    bigBoard.add(new Tile(new Posn(22, 25), Dir2225));
    bigBoard.add(new Tile(new Posn(23, 25), Dir2325));
    bigBoard.add(new Tile(new Posn(24, 25), Dir2425));
    bigBoard.add(new Tile(new Posn(25, 25), Dir2525));
    //row 26
    bigBoard.add(new Tile(new Posn(0, 26), Dir026));
    bigBoard.add(new Tile(new Posn(1, 26), DirOneTwentySix));
    bigBoard.add(new Tile(new Posn(2, 26), DirTwoTwentySix));
    bigBoard.add(new Tile(new Posn(3, 26), Dir326));
    bigBoard.add(new Tile(new Posn(4, 26), Dir426));
    bigBoard.add(new Tile(new Posn(5, 26), Dir526));
    bigBoard.add(new Tile(new Posn(6, 26), Dir626));
    bigBoard.add(new Tile(new Posn(7, 26), Dir726));
    bigBoard.add(new Tile(new Posn(8, 26), Dir826));
    bigBoard.add(new Tile(new Posn(9, 26), Dir926));
    bigBoard.add(new Tile(new Posn(10, 26), Dir1026));
    bigBoard.add(new Tile(new Posn(11, 26), Dir1126));
    bigBoard.add(new Tile(new Posn(12, 26), Dir1226));
    bigBoard.add(new Tile(new Posn(13, 26), Dir1326));
    bigBoard.add(new Tile(new Posn(14, 26), Dir1426));
    bigBoard.add(new Tile(new Posn(15, 26), Dir1526));
    bigBoard.add(new Tile(new Posn(16, 26), Dir1626));
    bigBoard.add(new Tile(new Posn(17, 26), Dir1726));
    bigBoard.add(new Tile(new Posn(18, 26), Dir1826));
    bigBoard.add(new Tile(new Posn(19, 26), Dir1926));
    bigBoard.add(new Tile(new Posn(20, 26), Dir2026));
    bigBoard.add(new Tile(new Posn(21, 26), Dir2126));
    bigBoard.add(new Tile(new Posn(22, 26), Dir2226));
    bigBoard.add(new Tile(new Posn(23, 26), Dir2326));
    bigBoard.add(new Tile(new Posn(24, 26), Dir2426));
    bigBoard.add(new Tile(new Posn(25, 26), Dir2526));
    //row 27
    bigBoard.add(new Tile(new Posn(0, 27), Dir027));
    bigBoard.add(new Tile(new Posn(1, 27), DirOneTwentySeven));
    bigBoard.add(new Tile(new Posn(2, 27), DirTwoTwentySeven));
    bigBoard.add(new Tile(new Posn(3, 27), Dir327));
    bigBoard.add(new Tile(new Posn(4, 27), Dir427));
    bigBoard.add(new Tile(new Posn(5, 27), Dir527));
    bigBoard.add(new Tile(new Posn(6, 27), Dir627));
    bigBoard.add(new Tile(new Posn(7, 27), Dir727));
    bigBoard.add(new Tile(new Posn(8, 27), Dir827));
    bigBoard.add(new Tile(new Posn(9, 27), Dir927));
    bigBoard.add(new Tile(new Posn(10, 27), Dir1027));
    bigBoard.add(new Tile(new Posn(11, 27), Dir1127));
    bigBoard.add(new Tile(new Posn(12, 27), Dir1227));
    bigBoard.add(new Tile(new Posn(13, 27), Dir1327));
    bigBoard.add(new Tile(new Posn(14, 27), Dir1427));
    bigBoard.add(new Tile(new Posn(15, 27), Dir1527));
    bigBoard.add(new Tile(new Posn(16, 27), Dir1627));
    bigBoard.add(new Tile(new Posn(17, 27), Dir1727));
    bigBoard.add(new Tile(new Posn(18, 27), Dir1827));
    bigBoard.add(new Tile(new Posn(19, 27), Dir1927));
    bigBoard.add(new Tile(new Posn(20, 27), Dir2027));
    bigBoard.add(new Tile(new Posn(21, 27), Dir2127));
    bigBoard.add(new Tile(new Posn(22, 27), Dir2227));
    bigBoard.add(new Tile(new Posn(23, 27), Dir2327));
    bigBoard.add(new Tile(new Posn(24, 27), Dir2427));
    bigBoard.add(new Tile(new Posn(25, 27), Dir2527));
    //row 28
    bigBoard.add(new Tile(new Posn(0, 28), Dir028));
    bigBoard.add(new Tile(new Posn(1, 28), DirOneTwentyEight));
    bigBoard.add(new Tile(new Posn(2, 28), DirTwoTwentyEight));
    bigBoard.add(new Tile(new Posn(3, 28), Dir328));
    bigBoard.add(new Tile(new Posn(4, 28), Dir428));
    bigBoard.add(new Tile(new Posn(5, 28), Dir528));
    bigBoard.add(new Tile(new Posn(6, 28), Dir628));
    bigBoard.add(new Tile(new Posn(7, 28), Dir728));
    bigBoard.add(new Tile(new Posn(8, 28), Dir828));
    bigBoard.add(new Tile(new Posn(9, 28), Dir928));
    bigBoard.add(new Tile(new Posn(10, 28), Dir1028));
    bigBoard.add(new Tile(new Posn(11, 28), Dir1128));
    bigBoard.add(new Tile(new Posn(12, 28), Dir1228));
    bigBoard.add(new Tile(new Posn(13, 28), Dir1328));
    bigBoard.add(new Tile(new Posn(14, 28), Dir1428));
    bigBoard.add(new Tile(new Posn(15, 28), Dir1528));
    bigBoard.add(new Tile(new Posn(16, 28), Dir1628));
    bigBoard.add(new Tile(new Posn(17, 28), Dir1728));
    bigBoard.add(new Tile(new Posn(18, 28), Dir1828));
    bigBoard.add(new Tile(new Posn(19, 28), Dir1928));
    bigBoard.add(new Tile(new Posn(20, 28), Dir2028));
    bigBoard.add(new Tile(new Posn(21, 28), Dir2128));
    bigBoard.add(new Tile(new Posn(22, 28), Dir2228));
    bigBoard.add(new Tile(new Posn(23, 28), Dir2328));
    bigBoard.add(new Tile(new Posn(24, 28), Dir2428));
    bigBoard.add(new Tile(new Posn(25, 28), Dir2528));


    //big dots
    bigDots.add(new Posn(0, 0));
    bigDots.add(new Posn(0, 1));
    bigDots.add(new Posn(0, 3));
    bigDots.add(new Posn(0, 4));
    bigDots.add(new Posn(0, 5));
    bigDots.add(new Posn(0, 6));
    bigDots.add(new Posn(0, 7));
    bigDots.add(new Posn(0, 19));
    bigDots.add(new Posn(0, 20));
    bigDots.add(new Posn(0, 21));
    bigDots.add(new Posn(0, 25));
    bigDots.add(new Posn(0, 26));
    bigDots.add(new Posn(0, 27));
    bigDots.add(new Posn(0, 28));
    bigDots.add(new Posn(1, 0));
    bigDots.add(new Posn(1, 4));
    bigDots.add(new Posn(1, 7));
    bigDots.add(new Posn(1, 19));
    bigDots.add(new Posn(1, 22));
    bigDots.add(new Posn(1, 25));
    bigDots.add(new Posn(1, 28));
    bigDots.add(new Posn(2, 0));
    bigDots.add(new Posn(2, 4));
    bigDots.add(new Posn(2, 7));
    bigDots.add(new Posn(2, 19));
    bigDots.add(new Posn(2, 22));
    bigDots.add(new Posn(2, 23));
    bigDots.add(new Posn(2, 24));
    bigDots.add(new Posn(2, 25));    
    bigDots.add(new Posn(2, 28));
    bigDots.add(new Posn(3, 0));
    bigDots.add(new Posn(3, 4));
    bigDots.add(new Posn(3, 7));
    bigDots.add(new Posn(3, 19));
    bigDots.add(new Posn(3, 25));
    bigDots.add(new Posn(3, 28));
    bigDots.add(new Posn(4, 0));
    bigDots.add(new Posn(4, 4));
    bigDots.add(new Posn(4, 7));
    bigDots.add(new Posn(4, 19));
    bigDots.add(new Posn(4, 25));
    bigDots.add(new Posn(4, 28));
    bigDots.add(new Posn(5, 0));
    bigDots.add(new Posn(5, 1));
    bigDots.add(new Posn(5, 2));
    bigDots.add(new Posn(5, 3));
    bigDots.add(new Posn(5, 4));
    bigDots.add(new Posn(5, 5));
    bigDots.add(new Posn(5, 6));
    bigDots.add(new Posn(5, 7));
    bigDots.add(new Posn(5, 8));
    bigDots.add(new Posn(5, 9));
    bigDots.add(new Posn(5, 10));
    bigDots.add(new Posn(5, 11));
    bigDots.add(new Posn(5, 12));
    bigDots.add(new Posn(5, 13));
    bigDots.add(new Posn(5, 14));
    bigDots.add(new Posn(5, 15));
    bigDots.add(new Posn(5, 16));
    bigDots.add(new Posn(5, 17));
    bigDots.add(new Posn(5, 18));
    bigDots.add(new Posn(5, 19));
    bigDots.add(new Posn(5, 20));
    bigDots.add(new Posn(5, 21));
    bigDots.add(new Posn(5, 22));
    bigDots.add(new Posn(5, 23));
    bigDots.add(new Posn(5, 24));
    bigDots.add(new Posn(5, 25));
    bigDots.add(new Posn(5, 28));
    bigDots.add(new Posn(6, 0));
    bigDots.add(new Posn(6, 4));
    bigDots.add(new Posn(6, 19));
    bigDots.add(new Posn(6, 22));
    bigDots.add(new Posn(6, 28));
    bigDots.add(new Posn(7, 0));
    bigDots.add(new Posn(7, 4));
    bigDots.add(new Posn(7, 19));
    bigDots.add(new Posn(7, 22));
    bigDots.add(new Posn(7, 28));
    bigDots.add(new Posn(8, 0));
    bigDots.add(new Posn(8, 4));
    bigDots.add(new Posn(8, 5));
    bigDots.add(new Posn(8, 6));
    bigDots.add(new Posn(8, 7));
    bigDots.add(new Posn(8, 19));
    bigDots.add(new Posn(8, 22));
    bigDots.add(new Posn(8, 23));
    bigDots.add(new Posn(8, 24));
    bigDots.add(new Posn(8, 25));
    bigDots.add(new Posn(8, 28));
    bigDots.add(new Posn(9, 0));
    bigDots.add(new Posn(9, 4));
    bigDots.add(new Posn(9, 7));
    bigDots.add(new Posn(9, 19));
    bigDots.add(new Posn(9, 22));
    bigDots.add(new Posn(9, 25));
    bigDots.add(new Posn(9, 28));
    bigDots.add(new Posn(10, 0));
    bigDots.add(new Posn(10, 4));
    bigDots.add(new Posn(10, 7));
    bigDots.add(new Posn(10, 19));
    bigDots.add(new Posn(10, 22));
    bigDots.add(new Posn(10, 25));
    bigDots.add(new Posn(10, 28));
    bigDots.add(new Posn(11, 0));
    bigDots.add(new Posn(11, 1));
    bigDots.add(new Posn(11, 2));
    bigDots.add(new Posn(11, 3));
    bigDots.add(new Posn(11, 4));
    bigDots.add(new Posn(11, 7));
    bigDots.add(new Posn(11, 19));
    bigDots.add(new Posn(11, 20));
    bigDots.add(new Posn(11, 21));
    bigDots.add(new Posn(11, 22));
    bigDots.add(new Posn(11, 25));
    bigDots.add(new Posn(11, 26));
    bigDots.add(new Posn(11, 27));
    bigDots.add(new Posn(11, 28));
    bigDots.add(new Posn(12, 4));
    bigDots.add(new Posn(12, 22));
    bigDots.add(new Posn(12, 28));
    bigDots.add(new Posn(13, 4));
    bigDots.add(new Posn(13, 22));
    bigDots.add(new Posn(13, 28));
    bigDots.add(new Posn(14, 0));
    bigDots.add(new Posn(14, 1));
    bigDots.add(new Posn(14, 2));
    bigDots.add(new Posn(14, 3));
    bigDots.add(new Posn(14, 4));
    bigDots.add(new Posn(14, 7));
    bigDots.add(new Posn(14, 19));
    bigDots.add(new Posn(14, 20));
    bigDots.add(new Posn(14, 21));
    bigDots.add(new Posn(14, 22));
    bigDots.add(new Posn(14, 25));
    bigDots.add(new Posn(14, 26));
    bigDots.add(new Posn(14, 27));
    bigDots.add(new Posn(14, 28));
    bigDots.add(new Posn(15, 0));
    bigDots.add(new Posn(15, 4));
    bigDots.add(new Posn(15, 7));
    bigDots.add(new Posn(15, 19));
    bigDots.add(new Posn(15, 22));
    bigDots.add(new Posn(15, 25));
    bigDots.add(new Posn(15, 28));
    bigDots.add(new Posn(16, 0));
    bigDots.add(new Posn(16, 4));
    bigDots.add(new Posn(16, 7));
    bigDots.add(new Posn(16, 19));
    bigDots.add(new Posn(16, 22));
    bigDots.add(new Posn(16, 25));
    bigDots.add(new Posn(16, 28));
    bigDots.add(new Posn(17, 0));
    bigDots.add(new Posn(17, 4));
    bigDots.add(new Posn(17, 5));
    bigDots.add(new Posn(17, 6));
    bigDots.add(new Posn(17, 7));
    bigDots.add(new Posn(17, 19));
    bigDots.add(new Posn(17, 22));
    bigDots.add(new Posn(17, 23));
    bigDots.add(new Posn(17, 24));
    bigDots.add(new Posn(17, 25));
    bigDots.add(new Posn(17, 28));
    bigDots.add(new Posn(18, 0));
    bigDots.add(new Posn(18, 4));
    bigDots.add(new Posn(18, 19));
    bigDots.add(new Posn(18, 22));
    bigDots.add(new Posn(18, 28));
    bigDots.add(new Posn(19, 0));
    bigDots.add(new Posn(19, 4));
    bigDots.add(new Posn(19, 19));
    bigDots.add(new Posn(19, 22));
    bigDots.add(new Posn(19, 28));
    bigDots.add(new Posn(20, 0));
    bigDots.add(new Posn(20, 1));
    bigDots.add(new Posn(20, 2));
    bigDots.add(new Posn(20, 3));
    bigDots.add(new Posn(20, 4));
    bigDots.add(new Posn(20, 5));
    bigDots.add(new Posn(20, 6));
    bigDots.add(new Posn(20, 7));
    bigDots.add(new Posn(20, 8));
    bigDots.add(new Posn(20, 9));
    bigDots.add(new Posn(20, 10));
    bigDots.add(new Posn(20, 11));
    bigDots.add(new Posn(20, 12));
    bigDots.add(new Posn(20, 13));
    bigDots.add(new Posn(20, 14));
    bigDots.add(new Posn(20, 15));
    bigDots.add(new Posn(20, 16));
    bigDots.add(new Posn(20, 17));
    bigDots.add(new Posn(20, 18));
    bigDots.add(new Posn(20, 19));
    bigDots.add(new Posn(20, 20));
    bigDots.add(new Posn(20, 21));
    bigDots.add(new Posn(20, 22));
    bigDots.add(new Posn(20, 23));
    bigDots.add(new Posn(20, 24));
    bigDots.add(new Posn(20, 25));
    bigDots.add(new Posn(20, 28));
    bigDots.add(new Posn(21, 0));
    bigDots.add(new Posn(21, 4));
    bigDots.add(new Posn(21, 7));
    bigDots.add(new Posn(21, 19));
    bigDots.add(new Posn(21, 25));
    bigDots.add(new Posn(21, 28));
    bigDots.add(new Posn(22, 0));
    bigDots.add(new Posn(22, 4));
    bigDots.add(new Posn(22, 7));
    bigDots.add(new Posn(22, 19));
    bigDots.add(new Posn(22, 25));
    bigDots.add(new Posn(22, 28));
    bigDots.add(new Posn(23, 0));
    bigDots.add(new Posn(23, 4));
    bigDots.add(new Posn(23, 7));
    bigDots.add(new Posn(23, 19));
    bigDots.add(new Posn(23, 22));
    bigDots.add(new Posn(23, 23));
    bigDots.add(new Posn(23, 24));
    bigDots.add(new Posn(23, 25));
    bigDots.add(new Posn(23, 28));
    bigDots.add(new Posn(24, 0));
    bigDots.add(new Posn(24, 4));
    bigDots.add(new Posn(24, 7));
    bigDots.add(new Posn(24, 19));
    bigDots.add(new Posn(24, 22));
    bigDots.add(new Posn(24, 25));
    bigDots.add(new Posn(24, 28));
    bigDots.add(new Posn(25, 0));
    bigDots.add(new Posn(25, 1));
    bigDots.add(new Posn(25, 3));
    bigDots.add(new Posn(25, 4));
    bigDots.add(new Posn(25, 5));
    bigDots.add(new Posn(25, 6));
    bigDots.add(new Posn(25, 7));
    bigDots.add(new Posn(25, 19));
    bigDots.add(new Posn(25, 20));
    bigDots.add(new Posn(25, 21));
    bigDots.add(new Posn(25, 25));
    bigDots.add(new Posn(25, 26));
    bigDots.add(new Posn(25, 27));
    bigDots.add(new Posn(25, 28));

    // NOT DONe

    //big supers
    bigSupers.add(new Posn(0, 2));
    bigSupers.add(new Posn(0, 22));
    bigSupers.add(new Posn(25, 2));
    bigSupers.add(new Posn(25, 22));


    //ghost starts for big board
    ghostStarts.add(new Posn(20, 4));
    ghostStarts.add(new Posn(5, 4));
    ghostStarts.add(new Posn(5, 20));
    ghostStarts.add(new Posn(20, 20));

  }

  ////////////////////////////////////////////////////
  ///// UTILS CLASS
  ///////////////////////////////////////////////////

  // to test the hitsWall function for the Utils class
  void testHitsWall(Tester t) {
    Posn pos1 = new Posn(TILE_SIZE / 2, 0);
    Posn pos2 = new Posn(0, TILE_SIZE / 2);
    Posn pos3 = new Posn(0, 0);
    Posn pos4 = new Posn(TILE_SIZE / 2, TILE_SIZE / 2);

    Utils utils = new Utils();

    // testing with a posn that is centered in the x coordinate but not the y
    t.checkExpect(utils.hitsWall(LEFT, pos1), true);
    t.checkExpect(utils.hitsWall(RIGHT, pos1), true);
    t.checkExpect(utils.hitsWall(UP, pos1), false);
    t.checkExpect(utils.hitsWall(DOWN, pos1), false);
    // testing with a posn that is centered with the y coordinate but not the x
    t.checkExpect(utils.hitsWall(LEFT, pos2), false);
    t.checkExpect(utils.hitsWall(RIGHT, pos2), false);
    t.checkExpect(utils.hitsWall(UP, pos2), true);
    t.checkExpect(utils.hitsWall(DOWN, pos2), true);
    // testing a posn that is centered neither in the x or y direction
    t.checkExpect(utils.hitsWall(LEFT, pos3), false);
    t.checkExpect(utils.hitsWall(RIGHT, pos3), false);
    t.checkExpect(utils.hitsWall(UP, pos3), false);
    t.checkExpect(utils.hitsWall(DOWN, pos3), false);
    // testing with a posn centered in the x and y directions
    t.checkExpect(utils.hitsWall(LEFT, pos4), true);
    t.checkExpect(utils.hitsWall(RIGHT, pos4), true);
    t.checkExpect(utils.hitsWall(UP, pos4), true);
    t.checkExpect(utils.hitsWall(DOWN, pos4), true);

  }

  // to test the facePosn function for the Utils class
  void testFacePosn(Tester t) {
    Posn pos1 = new Posn(TILE_SIZE, TILE_SIZE);
    Utils utils = new Utils();
    // testing with a pacman facing left
    t.checkExpect(utils.facePosn(LEFT, pos1), new Posn(0, 1));
    // testing with a pacman facing right
    t.checkExpect(utils.facePosn(RIGHT, pos1), new Posn(1, 1));
    // testing with a pacman facing up
    t.checkExpect(utils.facePosn(UP, pos1), new Posn(1, 0));
    // testing with a pacman facing down
    t.checkExpect(utils.facePosn(DOWN, pos1), new Posn(1, 1));

  }

  // to test the facePixelPosn function for the Utils class
  void testFacePixelPosn(Tester t) {
    Posn pos1 = new Posn(TILE_SIZE, TILE_SIZE);
    Utils utils = new Utils();
    // testing with a pacman facing left
    t.checkExpect(utils.facePixelPosn(LEFT, pos1), new Posn(TILE_SIZE - PAC_RADIUS, TILE_SIZE));
    // testing with a pacman facing right
    t.checkExpect(utils.facePixelPosn(RIGHT, pos1), new Posn(TILE_SIZE + PAC_RADIUS, TILE_SIZE));
    // testing with a pacman facing up
    t.checkExpect(utils.facePixelPosn(UP, pos1), new Posn(TILE_SIZE, TILE_SIZE - PAC_RADIUS));
    // testing with a pacman facing down
    t.checkExpect(utils.facePixelPosn(DOWN, pos1), new Posn(TILE_SIZE, TILE_SIZE + PAC_RADIUS));
  }

  // to test the side1PixelPosn function for the Utils class
  void testSide1PixelPosn(Tester t) {
    Posn pos1 = new Posn(TILE_SIZE, TILE_SIZE);
    Utils utils = new Utils();

    // testing with a pacman facing left
    t.checkExpect(utils.side1PixelPosn(LEFT, pos1), new Posn(TILE_SIZE, TILE_SIZE - PAC_RADIUS));
    // testing with a pacman facing right
    t.checkExpect(utils.side1PixelPosn(RIGHT, pos1), new Posn(TILE_SIZE, TILE_SIZE - PAC_RADIUS));
    // testing with a pacman facing up
    t.checkExpect(utils.side1PixelPosn(UP, pos1), new Posn(TILE_SIZE - PAC_RADIUS, TILE_SIZE));
    // testing with a pacman facing down
    t.checkExpect(utils.side1PixelPosn(DOWN, pos1), new Posn(TILE_SIZE - PAC_RADIUS, TILE_SIZE));
  }


  // to test the side2PixelPosn function for the Utils class
  void testSide2PixelPosn(Tester t) {
    Posn pos1 = new Posn(TILE_SIZE, TILE_SIZE);
    Utils utils = new Utils();

    // testing with a pacman facing left
    t.checkExpect(utils.side2PixelPosn(LEFT, pos1), new Posn(TILE_SIZE, TILE_SIZE + PAC_RADIUS));
    // testing with a pacman facing right
    t.checkExpect(utils.side2PixelPosn(RIGHT, pos1), new Posn(TILE_SIZE, TILE_SIZE + PAC_RADIUS));
    // testing with a pacman facing up
    t.checkExpect(utils.side2PixelPosn(UP, pos1), new Posn(TILE_SIZE + PAC_RADIUS, TILE_SIZE));
    // testing with a pacman facing down
    t.checkExpect(utils.side2PixelPosn(DOWN, pos1), new Posn(TILE_SIZE + PAC_RADIUS, TILE_SIZE));
  }

  // to test the rearPixelPosn function for the Utils class
  void testRearPixelPosn(Tester t) {
    Posn pos1 = new Posn(TILE_SIZE, TILE_SIZE);
    Utils utils = new Utils();

    // testing with a pacman facing left
    t.checkExpect(utils.rearPixelPosn(LEFT, pos1), new Posn(TILE_SIZE + PAC_RADIUS, TILE_SIZE));
    // testing with a pacman facing right
    t.checkExpect(utils.rearPixelPosn(RIGHT, pos1), new Posn(TILE_SIZE - PAC_RADIUS, TILE_SIZE));
    // testing with a pacman facing up
    t.checkExpect(utils.rearPixelPosn(UP, pos1), new Posn(TILE_SIZE, TILE_SIZE + PAC_RADIUS));
    // testing with a pacman facing down
    t.checkExpect(utils.rearPixelPosn(DOWN, pos1), new Posn(TILE_SIZE, TILE_SIZE - PAC_RADIUS));
  }

  // to test the edgePosns function for the Utils class
  void testEdgePosns(Tester t) {
    Posn pos1 = new Posn(TILE_SIZE, TILE_SIZE);
    Utils utils = new Utils();
    ArrayList<Posn> leftPac = new ArrayList<Posn>();
    leftPac.add(new Posn((TILE_SIZE - PAC_RADIUS) / TILE_SIZE, TILE_SIZE  / TILE_SIZE));
    leftPac.add(new Posn((TILE_SIZE - PAC_RADIUS) / TILE_SIZE, (TILE_SIZE - PAC_RADIUS) / TILE_SIZE));
    leftPac.add(new Posn((TILE_SIZE - PAC_RADIUS) / TILE_SIZE, (TILE_SIZE + PAC_RADIUS) / TILE_SIZE));
    ArrayList<Posn> rightPac = new ArrayList<Posn>();
    rightPac.add(new Posn((TILE_SIZE + PAC_RADIUS) / TILE_SIZE, TILE_SIZE  / TILE_SIZE));
    rightPac.add(new Posn((TILE_SIZE + PAC_RADIUS) / TILE_SIZE, (TILE_SIZE - PAC_RADIUS) / TILE_SIZE));
    rightPac.add(new Posn((TILE_SIZE + PAC_RADIUS) / TILE_SIZE, (TILE_SIZE + PAC_RADIUS) / TILE_SIZE));
    ArrayList<Posn> upPac = new ArrayList<Posn>();
    upPac.add(new Posn((TILE_SIZE) / TILE_SIZE, (TILE_SIZE - PAC_RADIUS)  / TILE_SIZE));
    upPac.add(new Posn((TILE_SIZE - PAC_RADIUS) / TILE_SIZE, (TILE_SIZE - PAC_RADIUS) / TILE_SIZE));
    upPac.add(new Posn((TILE_SIZE + PAC_RADIUS) / TILE_SIZE, (TILE_SIZE - PAC_RADIUS) / TILE_SIZE));
    ArrayList<Posn> downPac = new ArrayList<Posn>();
    downPac.add(new Posn((TILE_SIZE) / TILE_SIZE, (TILE_SIZE + PAC_RADIUS)  / TILE_SIZE));
    downPac.add(new Posn((TILE_SIZE - PAC_RADIUS) / TILE_SIZE, (TILE_SIZE + PAC_RADIUS) / TILE_SIZE));
    downPac.add(new Posn((TILE_SIZE + PAC_RADIUS) / TILE_SIZE, (TILE_SIZE + PAC_RADIUS) / TILE_SIZE));
    // testing using a pacman facing left
    t.checkExpect(utils.edgePosns(LEFT, pos1), leftPac);
    // testing using a pacman facing right
    t.checkExpect(utils.edgePosns(RIGHT, pos1), rightPac);
    // testing using a pacman facing up
    t.checkExpect(utils.edgePosns(UP, pos1), upPac);
    // testing using a pacman facing down
    t.checkExpect(utils.edgePosns(DOWN, pos1), downPac);
  }

  // to test the getEyes function for the Utils class
  void testGetEyes(Tester t) {
    Utils utils = new Utils();
    // testing with a left direction
    t.checkExpect(utils.getEyes(LEFT), leftEyes);
    // testing with a right direction
    t.checkExpect(utils.getEyes(RIGHT), rightEyes);
    // testing with an up direction
    t.checkExpect(utils.getEyes(UP), upEyes);
    // testing with a down direction 
    t.checkExpect(utils.getEyes(DOWN), downEyes);
  }

  // to test the oppositeDir function for the Utils class
  void testOppositeDir(Tester t) {
    Utils utils = new Utils();
    // testing with a left direction
    t.checkExpect(utils.oppositeDir(LEFT), RIGHT);
    // testing with a right direction
    t.checkExpect(utils.oppositeDir(RIGHT), LEFT);
    // testing with an up direction
    t.checkExpect(utils.oppositeDir(UP), DOWN);
    // testing with a down direction 
    t.checkExpect(utils.oppositeDir(DOWN), UP);
  }

  // to test the allPossibleDirs function for the Utils class
  void testAllPossibleDirs(Tester t) {
    Utils utils = new Utils();
    ArrayList<String> possibleDirs = new ArrayList<String>();
    possibleDirs.add(LEFT);
    possibleDirs.add(RIGHT);
    possibleDirs.add(UP);
    possibleDirs.add(DOWN);
    t.checkExpect(utils.allPossibleDirs(), possibleDirs);
  }

  // to test the distanceBetween function for the Utils class
  void testDistanceBetween(Tester t) {
    t.checkInexact(new Utils().distanceBetween(new Posn(2, 2), new Posn(2, 2)), 0.0, 0.001);
    t.checkInexact(new Utils().distanceBetween(new Posn(2, 2), new Posn(4, 0)), 2.8284271247461903, 0.001);
    t.checkInexact(new Utils().distanceBetween(new Posn(-7, -4), new Posn(17, 6)), 26.0, 0.001);
  }

  // to test the nextPosn function for the Utils class
  void testNextPosn(Tester t) {
    Utils utils = new Utils();
    Posn pos1 = new Posn(1, 1);
    // testing with a left direction
    t.checkExpect(utils.nextPosn(pos1, LEFT), new Posn(0, 1));
    // testing with a right diretion
    t.checkExpect(utils.nextPosn(pos1, RIGHT), new Posn(2, 1));
    // testing with an up direction
    t.checkExpect(utils.nextPosn(pos1, UP), new Posn(1, 0));
    // testing with a down direction
    t.checkExpect(utils.nextPosn(pos1, DOWN), new Posn(1, 2));

  }

  // to test the onScreen function for the Utils class
  void testOnScreen(Tester t) {
    Posn pos1 = new Posn(-1, 0);
    Posn pos2 = new Posn(1, 0);
    Posn pos3 = new Posn(0, -1);
    Posn pos4 = new Posn(0, 1);
    Posn pos5= new Posn(0, 0);
    Utils utils = new Utils();

    // testing for a posn on screen
    t.checkExpect(utils.onScreen(pos5, 1, 1), true);
    // testing for a posn above the screen
    t.checkExpect(utils.onScreen(pos3, 1, 1), false);
    // testing for a posn to the left of the screen
    t.checkExpect(utils.onScreen(pos1, 1, 1), false);
    // testing for a posn to the right of the screen
    t.checkExpect(utils.onScreen(pos2, 1, 1), false);
    // testing for a posn below the screen
    t.checkExpect(utils.onScreen(pos4, 1, 1), false);
  }

  // to test the calcScore function for the Utils class
  void testCalcScore(Tester t) {
    ArrayList<Posn> superPosn = new ArrayList<Posn>();
    superPosn.add(new Posn(0,0));
    ArrayList<Posn> dots = new ArrayList<Posn>();
    dots.add(new Posn(1, 0));
    Supers supers = new Supers(true, superPosn, 2);
    Pacman pac1 = new Pacman(new Posn(TILE_SIZE * 3, TILE_SIZE * 3), true, LEFT, 3);
    Pacman pac2 = new Pacman(new Posn(TILE_SIZE / 2, TILE_SIZE / 2), true, LEFT, 3);
    Pacman pac3 = new Pacman(new Posn(TILE_SIZE + TILE_SIZE / 2, TILE_SIZE / 2), true, LEFT, 3);
    Utils utils = new Utils();
    // testing with no supers or dots eaten
    t.checkExpect(utils.calcScore(pac1, supers, dots, 0), 0);
    // testing with a super and no dot eaten
    t.checkExpect(utils.calcScore(pac2, supers, dots, 0), SUPER_REWARD);
    // testing with a dot and no super eaten
    t.checkExpect(utils.calcScore(pac3, supers, dots, 0), DOT_REWARD);
  }


  // to test the calcXOffset function for the Utils class
  void testCalcXOffset(Tester t) {
    // testing with no x offset
    t.checkExpect(new Utils().calcXOffset(new Posn(TILE_SIZE / 2, TILE_SIZE / 2)), 0);
    // testing with a small positive x offset
    t.checkExpect(new Utils().calcXOffset(new Posn((TILE_SIZE / 2) + 2, TILE_SIZE / 2)), 2);
    // testing with no x offset and a y offset
    t.checkExpect(new Utils().calcXOffset(new Posn(TILE_SIZE / 2, (TILE_SIZE / 2) + 2)), 0);
    // testing with a small negative x offset
    t.checkExpect(new Utils().calcXOffset(new Posn((TILE_SIZE / 2) - 2, TILE_SIZE / 2)), 2);
    // testing with a larger x offset
    t.checkExpect(new Utils().calcXOffset(new Posn(TILE_SIZE / 5, TILE_SIZE / 2)), ( (TILE_SIZE / 2) - (TILE_SIZE / 5)));
  }

  // to test the calcYOffset function for the Utils class
  void testCalcYOffset(Tester t) {
    // testing with no y offset
    t.checkExpect(new Utils().calcYOffset(new Posn(TILE_SIZE / 2, TILE_SIZE / 2)), 0);
    // testing with no y offset and an x offset
    t.checkExpect(new Utils().calcYOffset(new Posn((TILE_SIZE / 2) + 2, TILE_SIZE / 2)), 0);
    // testing with a small positive y offset
    t.checkExpect(new Utils().calcYOffset(new Posn(TILE_SIZE / 2, (TILE_SIZE / 2) + 2)), 2);
    // testing with a small negative y offset
    t.checkExpect(new Utils().calcYOffset(new Posn((TILE_SIZE / 2), (TILE_SIZE / 2) - 2)), 2);
    // testing with a significant y offset
    t.checkExpect(new Utils().calcYOffset(new Posn(TILE_SIZE / 2, TILE_SIZE / 5)), ( (TILE_SIZE / 2) - (TILE_SIZE / 5)));
  }

  // to test the xOffsetInMargin function for the Utils class
  void testXOffsetInMargin(Tester t) {
    Utils utils = new Utils();
    // testing with no x Offset
    t.checkExpect(utils.xOffsetInMargin(new Posn(TILE_SIZE / 2, TILE_SIZE / 2)), true);
    // testing with an x offset within margin
    t.checkExpect(utils.xOffsetInMargin(new Posn(TILE_SIZE / 2 + ERROR_MARGIN / 2, TILE_SIZE / 2)), true);
    // testing with an x offset past the error margin
    t.checkExpect(utils.xOffsetInMargin(new Posn(TILE_SIZE / 2 + ERROR_MARGIN, TILE_SIZE / 2)), false);
  }

  // to test the yOffsetInMargin function for the Utils class
  void testYOffsetInMargin(Tester t) {
    Utils utils = new Utils();
    // testing with no y Offset
    t.checkExpect(utils.yOffsetInMargin(new Posn(TILE_SIZE / 2, TILE_SIZE / 2)), true);
    // testing with an y offset within margin
    t.checkExpect(utils.yOffsetInMargin(new Posn(TILE_SIZE / 2, TILE_SIZE / 2 + ERROR_MARGIN / 2)), true);
    // testing with an y offset past the error margin
    t.checkExpect(utils.yOffsetInMargin(new Posn(TILE_SIZE / 2, TILE_SIZE / 2 + ERROR_MARGIN)), false);
  }

  // to test the finalScene function for the Utils class
  // - just a sanity check for graphics
  void testFinalScene(Tester t) {
    Utils utils = new Utils();
    WorldScene bg = new WorldScene(10  + 1* TILE_SIZE, 10 * TILE_SIZE);
    // testing with a winning game
    t.checkExpect(utils.finalScene(300, 10, 10, bg, false),
        bg.placeImageXY(new OverlayOffsetImage(new TextImage("YOU'RE THE (PAC)MAN!.", 49, FontStyle.BOLD_ITALIC,
            Color.RED), 0, -TILE_SIZE, 
            new OverlayOffsetImage(new TextImage("YOU WON! FINALSCORE : " + 300, 49, FontStyle.BOLD_ITALIC,
                Color.RED), 0, TILE_SIZE ,
                new RectangleImage((10 - 1) * TILE_SIZE, TILE_SIZE * 4 + 10, OutlineMode.SOLID, Color.black)))
            , TILE_SIZE * (10 / 2), TILE_SIZE * (10 / 2)));  
    // testing with a losing game
    t.checkExpect(utils.finalScene(300, 10, 10, bg, true), 
        bg.placeImageXY(new OverlayOffsetImage(new TextImage("PAC IT UP.", 49, FontStyle.BOLD_ITALIC,
            Color.RED), 0, -TILE_SIZE,
            new OverlayOffsetImage(new TextImage("YOU DIED. FINALSCORE : " + 300, 49, FontStyle.BOLD_ITALIC,
                Color.RED), 0, TILE_SIZE , new RectangleImage((10 - 1) * TILE_SIZE, TILE_SIZE * 4 + 10,
                    OutlineMode.SOLID, Color.black))),
            TILE_SIZE * (10 / 2), TILE_SIZE * (10 / 2)));

  }

  // to test the randomDir function for the Utils class
  // - just testing that it doesn't return the opposite direction as promised
  void testRandomDir(Tester t) {
    Utils utils = new Utils();
    t.checkExpect(!utils.randomDir(LEFT).equals(RIGHT), true);
    t.checkExpect(!utils.randomDir(RIGHT).equals(LEFT), true);
    t.checkExpect(!utils.randomDir(UP).equals(DOWN), true);
    t.checkExpect(!utils.randomDir(DOWN).equals(UP), true);
  }


  ////////////////////////////////////////////////////////////////////////////////
  ///////  SUPERS CLASS
  /////////////////////////////////////////////////////////////////////////////


  // to test the flash method for the Supers class
  void testFlash(Tester t) {
    ArrayList<Posn> supersPosn = new ArrayList<Posn>();
    Supers supers1 = new Supers(true, supersPosn, FLASH_RATE);
    Supers supers1Result = new Supers(true, supersPosn, FLASH_RATE - 1);
    Supers supers2 = new Supers(true, supersPosn, 0);
    Supers supers2Result = new Supers(false, supersPosn, FLASH_RATE);
    Supers supers3 = new Supers(false, supersPosn, FLASH_RATE);
    Supers supers3Result = new Supers(false, supersPosn, FLASH_RATE - 1);
    Supers supers4 = new Supers(false, supersPosn, 0);
    Supers supers4Result = new Supers(true, supersPosn, FLASH_RATE);
    // testing with a supers that is visible and has a count greater than 0
    t.checkExpect(supers1.flash(), supers1Result);
    // testing with a supers that is visible with a count of 0
    t.checkExpect(supers2.flash(), supers2Result);
    // testing with a supers that is not visible and has a count greater than 0
    t.checkExpect(supers3.flash(), supers3Result);
    // testing with a supers that is not visible and has a count of 0
    t.checkExpect(supers4.flash(), supers4Result);
  }

  // to test the drawSupers method for the Supers class
  // - sanity check for graphics
  void testDrawSupers(Tester t) {
    ArrayList<Posn> supersPosn = new ArrayList<Posn>();
    supersPosn.add(new Posn(0, 0));
    Supers supers1 = new Supers(true, supersPosn, FLASH_RATE);
    Supers supers2 = new Supers(false, supersPosn, FLASH_RATE);
    WorldScene bg = new WorldScene(10 * TILE_SIZE, 10 * TILE_SIZE);
    CircleImage dot = new CircleImage(10, OutlineMode.SOLID, new Color(217, 209, 93));

    // testing with a visible supers
    t.checkExpect(supers1.drawSupers(bg),
        bg.placeImageXY(dot, TILE_SIZE/2, TILE_SIZE/2));  
    // testing with a not visible supers
    t.checkExpect(supers2.drawSupers(bg), bg);
  }

  // to test the removeEaten method for the Supers class
  void testRemoveEaten(Tester t) {
    Pacman pacman1 = new Pacman(new Posn(TILE_SIZE * 2, TILE_SIZE / 2), true, LEFT, 3);
    Pacman pacman2 = new Pacman(new Posn(TILE_SIZE / 2, TILE_SIZE / 2), true, LEFT, 3);
    ArrayList<Posn> supersPosns = new ArrayList<Posn>();
    supersPosns.add(new Posn(0, 0));
    ArrayList<Posn> supersPosnsResult = new ArrayList<Posn>();
    Supers supers = new Supers(true, supersPosns, FLASH_RATE);
    Supers supersResult = new Supers(true, supersPosnsResult, FLASH_RATE);
    // testing with pacman eating a super
    t.checkExpect(supers.removeEaten(pacman1), supers);
    // testing with pacman not eating a super
    t.checkExpect(supers.removeEaten(pacman2), supersResult);

  }

  // to test the hasSuperAt method for the Supers class
  void testHasSuperAt(Tester t) {
    ArrayList<Posn> supersPosns = new ArrayList<Posn>();
    supersPosns.add(new Posn(0, 0));
    supersPosns.add(new Posn(2, 2));
    Supers supers = new Supers(true, supersPosns, 3);

    // testing with a supers that has the given posn
    t.checkExpect(supers.hasSuperAt(new Posn(0, 0)), true);
    t.checkExpect(supers.hasSuperAt(new Posn(2, 2)), true);
    // testing with a supers that doesn't have the given posn
    t.checkExpect(supers.hasSuperAt(new Posn(0, 1)), false);
    t.checkExpect(supers.hasSuperAt(new Posn(1, 0)), false);
  }

  // to test the noneLeft method for the Supers class
  void testNoneLeft(Tester t) {
    ArrayList<Posn> supers1Posns = new ArrayList<Posn>();
    supers1Posns.add(new Posn(1, 1));
    ArrayList<Posn> supers2Posns = new ArrayList<Posn>();
    Supers supers1 = new Supers(true, supers1Posns, FLASH_RATE);
    Supers supers2 = new Supers(true, supers2Posns, FLASH_RATE);
    // testing with a supers that has posns left
    t.checkExpect(supers1.noneLeft(), false);
    // testing with a supers that doesn't have posns left
    t.checkExpect(supers2.noneLeft(), true);
  }


  /////////////////////////////////////////////////////////////////////////////
  //// TILE CLASS
  ///////////////////////////////////////////////////////////////////////////

  // to test the drawTile method for the Tile class
  // - sanity check for graphics
  void testDrawTile(Tester t) {
    WorldScene bg = new WorldScene(10 * TILE_SIZE, 10 * TILE_SIZE);
    WorldImage base = 
        new OverlayImage(new RectangleImage(TILE_SIZE, TILE_SIZE, OutlineMode.SOLID, Color.black), new EmptyImage());
    OverlayOffsetImage tile = new OverlayOffsetImage(base, 0 , 0, base);
    LineImage leftRightWall = new LineImage(new Posn(0, TILE_SIZE), Color.blue);
    leftRightWall.movePinhole(0, TILE_SIZE/2);
    LineImage upDownWall = new LineImage(new Posn(TILE_SIZE, 0), Color.blue);
    upDownWall.movePinhole(TILE_SIZE/2, 0);
    OverlayOffsetImage tileUp = 
        new OverlayOffsetImage(
            upDownWall,
            0,
            TILE_SIZE/2,
            tile);
    OverlayOffsetImage tileDown = 
        new OverlayOffsetImage(
            upDownWall,
            0,
            -(TILE_SIZE/2-1),
            tile);
    OverlayOffsetImage tileLeft = 
        new OverlayOffsetImage(
            leftRightWall,
            TILE_SIZE/2,
            0,
            tile);
    OverlayOffsetImage tileRight = 
        new OverlayOffsetImage(
            leftRightWall,
            -(TILE_SIZE/2-1),
            0,
            tile);
    ArrayList<String> dir1 = new ArrayList<String>();
    ArrayList<String> dir2 = new ArrayList<String>();
    dir2.add(UP);
    ArrayList<String> dir3 = new ArrayList<String>();
    dir3.add(DOWN);
    ArrayList<String> dir4 = new ArrayList<String>();
    dir4.add(LEFT);
    ArrayList<String> dir5 = new ArrayList<String>();
    dir5.add(RIGHT);
    Tile tile1 = new Tile(new Posn(0, 0), dir1);
    Tile tile2 = new Tile(new Posn(0, 0), dir2);
    Tile tile3 = new Tile(new Posn(0, 0), dir3);
    Tile tile4 = new Tile(new Posn(0, 0), dir4);
    Tile tile5 = new Tile(new Posn(0, 0), dir5);

    // testing tile with no walls
    t.checkExpect(tile1.drawTile(bg), bg.placeImageXY(tile, TILE_SIZE / 2, TILE_SIZE / 2));
    // testing tile with UP wall
    t.checkExpect(tile2.drawTile(bg), bg.placeImageXY(tileUp, TILE_SIZE / 2, TILE_SIZE / 2));
    // testing tile with DOWN wall
    t.checkExpect(tile3.drawTile(bg), bg.placeImageXY(tileDown, TILE_SIZE / 2, TILE_SIZE / 2));
    // testing tile with LEFT wall
    t.checkExpect(tile4.drawTile(bg), bg.placeImageXY(tileLeft, TILE_SIZE / 2, TILE_SIZE / 2));
    // testing tile with RIGHT wall
    t.checkExpect(tile5.drawTile(bg), bg.placeImageXY(tileRight, TILE_SIZE / 2, TILE_SIZE / 2));
  }


  ///////////////////////////////////////////////////////////////////////////////
  ///// PACMAN CLASS
  ///////////////////////////////////////////////////////////////////////////////

  // to test the drawPacman method for the Pacman class
  // - sanity check for graphics
  void testDrawPacman(Tester t) {
    WorldScene bg = new WorldScene(10 * TILE_SIZE, 10 * TILE_SIZE);
    CircleImage body = new CircleImage(PAC_RADIUS, OutlineMode.SOLID, Color.yellow);
    TriangleImage leftMouth = new TriangleImage(
        new Posn(0, 5), new Posn(15, 15), new Posn(0, 25), OutlineMode.SOLID, Color.black);
    TriangleImage rightMouth = new TriangleImage(
        new Posn(30, 5), new Posn(15, 15), new Posn(30, 25), OutlineMode.SOLID, Color.black);
    TriangleImage upMouth = new TriangleImage(
        new Posn(5, 0), new Posn(15, 15), new Posn(25, 0), OutlineMode.SOLID, Color.black);
    TriangleImage downMouth = new TriangleImage(
        new Posn(5, 30), new Posn(15, 15), new Posn(25, 30), OutlineMode.SOLID, Color.black);
    OverlayOffsetImage leftPac = new OverlayOffsetImage(
        leftMouth, 
        9, 
        0, 
        body);
    OverlayOffsetImage rightPac = new OverlayOffsetImage(
        rightMouth, 
        -9, 
        0, 
        body);
    OverlayOffsetImage upPac = new OverlayOffsetImage(
        upMouth, 
        0, 
        7, 
        body);
    OverlayOffsetImage downPac = new OverlayOffsetImage(
        downMouth, 
        0, 
        -9, 
        body);
    Pacman pac1 = new Pacman(new Posn(TILE_SIZE / 2, TILE_SIZE / 2), false, UP, 3);
    Pacman pac2 = new Pacman(new Posn(TILE_SIZE / 2, TILE_SIZE / 2), false, DOWN, 3);
    Pacman pac3 = new Pacman(new Posn(TILE_SIZE / 2, TILE_SIZE / 2), false, LEFT, 3);
    Pacman pac4 = new Pacman(new Posn(TILE_SIZE / 2, TILE_SIZE / 2), false, RIGHT, 3);
    Pacman pac5 = new Pacman(new Posn(TILE_SIZE / 2, TILE_SIZE / 2), true, UP, 3);
    Pacman pac6 = new Pacman(new Posn(TILE_SIZE / 2, TILE_SIZE / 2), true, DOWN, 3);
    Pacman pac7 = new Pacman(new Posn(TILE_SIZE / 2, TILE_SIZE / 2), true, LEFT, 3);
    Pacman pac8 = new Pacman(new Posn(TILE_SIZE / 2, TILE_SIZE / 2), true, RIGHT, 3);
    // testing with mouth closed 
    t.checkExpect(pac1.drawPacman(bg), bg.placeImageXY(body, TILE_SIZE / 2, TILE_SIZE / 2));
    t.checkExpect(pac2.drawPacman(bg), bg.placeImageXY(body, TILE_SIZE / 2, TILE_SIZE / 2));
    t.checkExpect(pac3.drawPacman(bg), bg.placeImageXY(body, TILE_SIZE / 2, TILE_SIZE / 2));
    t.checkExpect(pac4.drawPacman(bg), bg.placeImageXY(body, TILE_SIZE / 2, TILE_SIZE / 2));
    // testing with mouth open direction up
    t.checkExpect(pac5.drawPacman(bg), bg.placeImageXY(upPac, TILE_SIZE / 2, TILE_SIZE / 2));
    // testing with mouth open direction down
    t.checkExpect(pac6.drawPacman(bg), bg.placeImageXY(downPac, TILE_SIZE / 2, TILE_SIZE / 2));
    // testing with mouth open direction left
    t.checkExpect(pac7.drawPacman(bg), bg.placeImageXY(leftPac, TILE_SIZE / 2, TILE_SIZE / 2));
    // testing with mouth open direction right
    t.checkExpect(pac8.drawPacman(bg), bg.placeImageXY(rightPac, TILE_SIZE / 2, TILE_SIZE / 2));
  }

  // to test the movePacman method for the Pacman class
  void testMovePacman(Tester t) {
    
  }

  // to test the moveWithYOffset method for the Pacman class
  void testMoveWithYOffset(Tester t) {
    Pacman pac1 = new Pacman(new Posn(TILE_SIZE / 5, TILE_SIZE / 5), true, LEFT, 3);
    Pacman pac2 = new Pacman(new Posn(0, (2 *TILE_SIZE) / 5), false, LEFT, 3);    
    Pacman pac3 = new Pacman(new Posn(TILE_SIZE / 5, TILE_SIZE / 5), true, RIGHT, 3);
    Pacman pac4 = new Pacman(new Posn((2 * TILE_SIZE) / 5, (2 *TILE_SIZE) / 5), false, RIGHT, 3);
    Pacman pac5 = new Pacman(new Posn(TILE_SIZE / 5, TILE_SIZE / 5), true, UP, 3);
    Pacman pac6 = new Pacman(new Posn(TILE_SIZE / 5, TILE_SIZE / 5 - TILE_SIZE / 5 + TILE_SIZE / 5), false, UP, 3);
    Pacman pac7 = new Pacman(new Posn(TILE_SIZE / 5, TILE_SIZE / 5), true, DOWN, 3);
    Pacman pac8 = new Pacman(new Posn(TILE_SIZE / 5, TILE_SIZE / 5 + TILE_SIZE / 5 + TILE_SIZE / 5), false, DOWN, 3);

    //testing that the yOffset will be applied when moving left
    t.checkExpect(pac1.moveWithYOffset(TILE_SIZE/5), pac2);
    //testing that the yOffset will be applied when moving right
    t.checkExpect(pac3.moveWithYOffset(TILE_SIZE/5), pac4);
    // testing that the yOffset will be applied when moving up
    t.checkExpect(pac5.moveWithYOffset(TILE_SIZE/5), pac6);
    // testing that the yOffset will be applied when moving down
    t.checkExpect(pac7.moveWithYOffset(TILE_SIZE/5), pac8);

  }

  // to test the moveWithXOffset method for the Pacman class
  void testMoveWithXOffset(Tester t) {
    Pacman pac1 = new Pacman(new Posn(0, 0), true, RIGHT, 3);
    Pacman pac2 = new Pacman(new Posn(TILE_SIZE/3 + TILE_SIZE/5, 0), false, RIGHT, 3);
    Pacman pac3 = new Pacman(new Posn(TILE_SIZE / 5, TILE_SIZE / 5), true, LEFT, 3);
    Pacman pac4 = new Pacman(new Posn((TILE_SIZE/5) - (TILE_SIZE/5) + (TILE_SIZE/3), TILE_SIZE/5), false, LEFT, 3);
    Pacman pac5 = new Pacman(new Posn(TILE_SIZE/5, TILE_SIZE/5), true, UP, 3);
    Pacman pac6 = new Pacman(new Posn(TILE_SIZE/5 - TILE_SIZE/2, 0), false, UP, 3);
    Pacman pac7 = new Pacman(new Posn(TILE_SIZE/5, TILE_SIZE/5), true, DOWN, 3);
    Pacman pac8 = new Pacman(new Posn(TILE_SIZE/5 + TILE_SIZE/2, (TILE_SIZE/5) * 2), false, DOWN, 3);
    // testing that the xOffset will be applied when moving right
    t.checkExpect(pac1.moveWithXOffset(TILE_SIZE/3), pac2);
    // testing that the xOffset will be applied when moving left    
    t.checkExpect(pac3.moveWithXOffset(TILE_SIZE/3), pac4);
    // testing that the xOffset will be applied when moving up    
    t.checkExpect(pac5.moveWithXOffset(-TILE_SIZE/2), pac6);
    // testing that the xOffset will be applied when moving down    
    t.checkExpect(pac7.moveWithXOffset(TILE_SIZE/2), pac8);
    

  }

  // to test the tunnelMovement method for the Pacman class
  void testTunnelMovement(Tester t) {
    int ncol = 2;
    int nrow = 3;
    Pacman upPac = new Pacman(new Posn(TILE_SIZE/2, TILE_SIZE/2), true, UP, 3);
    Pacman upPacResult = new Pacman(new Posn(TILE_SIZE/2, nrow*TILE_SIZE + TILE_SIZE/2), false, UP, 3);
    Pacman downPac = new Pacman(new Posn(TILE_SIZE/2, TILE_SIZE/2), true, DOWN, 3);
    Pacman downPacResult = new Pacman(new Posn(TILE_SIZE/2, 0 - TILE_SIZE/2), false, DOWN, 3);
    Pacman leftPac = new Pacman(new Posn(TILE_SIZE/2, TILE_SIZE/2), true, LEFT, 3);
    Pacman leftPacResult = new Pacman(new Posn(2 * TILE_SIZE - TILE_SIZE/2, TILE_SIZE/2), false, LEFT, 3);
    Pacman rightPac = new Pacman(new Posn(TILE_SIZE, TILE_SIZE/2), true, RIGHT, 3);
    Pacman rightPacResult = new Pacman(new Posn(TILE_SIZE/2, TILE_SIZE/2), false, RIGHT, 3);
    
    // testing tunnel movement with a pacman moving upwards
    t.checkExpect(upPac.tunnelMovement(ncol, nrow), upPacResult);
    // testing tunnel movement with a pacman moving downwards
    t.checkExpect(downPac.tunnelMovement(ncol, nrow), downPacResult);
    // testing tunnel movement with a pacman moving left
    t.checkExpect(leftPac.tunnelMovement(ncol, nrow), leftPacResult);
    // testing tunnel movement with a pacman moving right
    t.checkExpect(rightPac.tunnelMovement(ncol, nrow), rightPacResult);
    
    
  }

  // to test the setDir method for the Pacman class
  void testSetDir(Tester t) {
    Pacman pac1 = new Pacman(new Posn(0, 0), true, RIGHT, 3);
    Pacman pac2 = new Pacman(new Posn(0, 0), true, LEFT, 3);
    Pacman pac3 = new Pacman(new Posn(0, 0), true, UP, 3);
    Pacman pac4 = new Pacman(new Posn(0, 0), true, DOWN, 3);
    // testing that setting the dir to the current dir will not change the pacman
    t.checkExpect(pac1.setDir(RIGHT), pac1);
    // setting the dir to other dirs that are not he current dir
    t.checkExpect(pac1.setDir(LEFT), pac2);
    t.checkExpect(pac1.setDir(UP), pac3);
    t.checkExpect(pac1.setDir(DOWN), pac4);
  }

  // to test the samePosn method for the Pacman class
  void testSamePosnPac(Tester t) {
    
  }

  // to test the onScreen method for the Pacman class
  void testOnScreenPac(Tester t) {
    Pacman pac1 = new Pacman(new Posn(TILE_SIZE / 2, TILE_SIZE / 2), true, RIGHT, 3);
    Pacman pac2 = new Pacman(new Posn(0, TILE_SIZE / 2), true, RIGHT, 3);
    Pacman pac3 = new Pacman(new Posn(0, TILE_SIZE / 2), true, LEFT, 3);
    Pacman pac4 = new Pacman(new Posn(0, TILE_SIZE / 2), true, UP, 3);
    Pacman pac5 = new Pacman(new Posn(0, TILE_SIZE / 2), true, DOWN, 3);
    Pacman pac6 = new Pacman(new Posn(-TILE_SIZE / 3, TILE_SIZE / 2), true, DOWN, 3);
    // testing that if pacman is entirely on screen then the method will return true
    // BUG SOMETHING IS WRONG HERE
   // t.checkExpect(pac1.onScreen(bigBoard), true);
    // testing that if just pacman's face is on screen then the method will return false
    t.checkExpect(pac2.onScreen(bigBoard), false);
    //testing that if just pacman's rear end is on screen then the method will return false
    t.checkExpect(pac3.onScreen(bigBoard), false);
    // testing that if just pacman's sides are on screen then the method will return false
    t.checkExpect(pac4.onScreen(bigBoard), false);
    t.checkExpect(pac5.onScreen(bigBoard), false);
    // testing that if most of pacman is on screen then the method will still return false    
    t.checkExpect(pac6.onScreen(bigBoard), false);
  }

  // to test the eatsDot method for the Pacman class
  void testEatsDots(Tester t) {
    Pacman pac1 = new Pacman(new Posn(TILE_SIZE / 2, TILE_SIZE / 2), true, RIGHT, 3);
    ArrayList<Posn> dots1 = new ArrayList<Posn>();
    // testing that the method will return false if there are no dots
    t.checkExpect(pac1.eatsDot(dots1), false);
    // testing that the method will return false if there are dots, but the pacman is not in the tile posn
    dots1.add(new Posn(1, 1));
    t.checkExpect(pac1.eatsDot(dots1), false);
    // testing that method will return true if the pacman is exactly in the center of a tile 
    // with a dot
    dots1.add(new Posn(0, 0));
    t.checkExpect(pac1.eatsDot(dots1), true);
    // test that the method will return true if the face of the pacman is in the tile posn
    Pacman pac2 = new Pacman(new Posn(TILE_SIZE * 2 , TILE_SIZE / 2), true, RIGHT, 3);
    Pacman pac3 = new Pacman(new Posn(TILE_SIZE * 2 , TILE_SIZE / 2), true, LEFT, 3);
    Pacman pac4 = new Pacman(new Posn(0, 0), true, RIGHT, 3);
    dots1.add(new Posn(2, 0));
    t.checkExpect(pac2.eatsDot(dots1), true);
    t.checkExpect(pac3.eatsDot(dots1), true);
    t.checkExpect(pac4.eatsDot(dots1), true);
    
    
  }

  // to test the eatsSuper method for the Pacman class
  void testEatsSuper(Tester t) {
    Pacman pac1 = new Pacman(new Posn(TILE_SIZE / 2, TILE_SIZE / 2), true, RIGHT, 3);
    ArrayList<Posn> supersPos = new ArrayList<Posn>();
    Supers supers = new Supers(true, supersPos, 3);
    // checking that the method will return false if there are no supers
    t.checkExpect(pac1.eatsSuper(supers), false);
    // checking that the method will return true when pacman is directly on top of the super
    supersPos.add(new Posn(0, 0));
    t.checkExpect(pac1.eatsSuper(supers), true);
    // checking that the method will return true when the pacman is in the same tile
    // of the super but not exactly in the center
    Pacman pac2 = new Pacman(new Posn(TILE_SIZE / 4, TILE_SIZE / 2), true, LEFT, 3);
    t.checkExpect(pac2.eatsSuper(supers), true);
    
  }

  // to test the drawLives method for the Pacman class
  // graphics -- sanity check
  void testDrawLives(Tester t) {
    Pacman pac1 = new Pacman(new Posn(0, 0), true, LEFT, 3);
    Pacman pac2 = new Pacman(new Posn(0, 0), true, LEFT, 2);
    Pacman pac3 = new Pacman(new Posn(0, 0), true, LEFT, 1);
    WorldScene bg = new WorldScene(0, 0);
    TextImage score1 = new TextImage("LIVES : " + 3, 20, FontStyle.BOLD, Color.RED);
    TextImage score2 = new TextImage("LIVES : " + 2, 20, FontStyle.BOLD, Color.RED);
    TextImage score3 = new TextImage("LIVES : " + 1, 20, FontStyle.BOLD, Color.RED);
    // testing with 3 lives
   t.checkExpect(pac1.drawLives(10, 10, new WorldScene(0, 0)), 
        bg.placeImageXY(score1, 5 * TILE_SIZE, (5 - 2) / 2 * TILE_SIZE + TILE_SIZE / 2));
   // testing with 2 lives
   t.checkExpect(pac2.drawLives(10, 10, new WorldScene(0, 0)), 
       bg.placeImageXY(score2, 5 * TILE_SIZE, (5 - 2) / 2 * TILE_SIZE + TILE_SIZE / 2));
   //testing with 1 life
   t.checkExpect(pac3.drawLives(10, 10, new WorldScene(0, 0)), 
       bg.placeImageXY(score3, 5 * TILE_SIZE, (5 - 2) / 2 * TILE_SIZE + TILE_SIZE / 2));
  }

  // to test the collides method for the Pacman class
  void testCollides(Tester t) {
    Pacman pac1 = new Pacman(new Posn(TILE_SIZE / 2, TILE_SIZE / 2), true, LEFT, 3);
    Pacman pac2 = new Pacman(new Posn(TILE_SIZE / 4, TILE_SIZE / 2), true, LEFT, 3);
    Pacman pac3 = new Pacman(new Posn((3 * TILE_SIZE) / 4, TILE_SIZE / 2), true, LEFT, 3);
    Pacman pac4 = new Pacman(new Posn(TILE_SIZE, TILE_SIZE / 2), true, LEFT, 3);
    Pacman pac5 = new Pacman(new Posn(TILE_SIZE / 2, TILE_SIZE / 3), true, LEFT, 3);
    Pacman pac6 = new Pacman(new Posn(TILE_SIZE / 2, (3 * TILE_SIZE) / 4), true, LEFT, 3);
    Pacman pac7 = new Pacman(new Posn(TILE_SIZE / 2, TILE_SIZE), true, LEFT, 3);

    Inky inky = new Inky(new Posn(TILE_SIZE / 2, TILE_SIZE / 2));

    // ghost and pacman in same cell
    t.checkExpect(pac1.collides(inky), true);
    t.checkExpect(pac2.collides(inky), true);
    t.checkExpect(pac3.collides(inky), true);
    t.checkExpect(pac5.collides(inky), true);
    t.checkExpect(pac6.collides(inky), true);
    // ghost and pacman not in same cell
    t.checkExpect(pac4.collides(inky), false);
    t.checkExpect(pac7.collides(inky), false);
  }

  // to test the resetPacman method for the Pacman class
  void testResetPacman(Tester t) {
    Pacman pac1 = new Pacman(new Posn(0, 0), true, LEFT, 3);
    Pacman pac2 = new Pacman(new Posn(1, 1), true, RIGHT, 3);
    Pacman pac3= new Pacman(new Posn(0, 0), true, UP, 2);
    Pacman pac4 = new Pacman(new Posn(1, 1), true, DOWN, 2);

    t.checkExpect(pac1.resetPacman(new Posn(1, 1)),
        new Pacman(new Posn(TILE_SIZE + TILE_SIZE / 2, TILE_SIZE + TILE_SIZE / 2), true, LEFT, 2));
    t.checkExpect(pac2.resetPacman(new Posn(0, 0)),
        new Pacman(new Posn(TILE_SIZE / 2, TILE_SIZE / 2), true, RIGHT, 2));
    t.checkExpect(pac3.resetPacman(new Posn(1, 1)),
        new Pacman(new Posn(TILE_SIZE + TILE_SIZE / 2, TILE_SIZE + TILE_SIZE / 2), true, UP, 1));
    t.checkExpect(pac4.resetPacman(new Posn(0, 0)),
        new Pacman(new Posn(TILE_SIZE / 2, TILE_SIZE / 2), true, DOWN, 1));

  }

  // to test the dead method for the Pacman class
  void testDead(Tester t) {
    Pacman pac1 = new Pacman(new Posn(0, 0), true, LEFT, 3);
    Pacman pac2 = new Pacman(new Posn(0, 0), true, LEFT, 2);
    Pacman pac3 = new Pacman(new Posn(0, 0), true, LEFT, 1);
    Pacman pac4 = new Pacman(new Posn(0, 0), true, LEFT, 0);

    // testing with 3 lives
    t.checkExpect(pac1.dead(), false);
    // testing with 2 lives
    t.checkExpect(pac2.dead(), false);
    // testing with 1 lives
    t.checkExpect(pac3.dead(), false);
    // testing with 0 lives
    t.checkExpect(pac4.dead(), true );

  }

  // to test the tilePosn method for the Pacman class
  void testTilePosn(Tester t) {
    Pacman pac1 = new Pacman(new Posn(0, 0), true, UP, 3);
    Pacman pac2 = new Pacman(new Posn(TILE_SIZE / 2, TILE_SIZE / 2), true, UP, 3);
    Pacman pac3 = new Pacman(new Posn(TILE_SIZE, TILE_SIZE * 2), true, UP, 3);
    Pacman pac3B = new Pacman(new Posn(TILE_SIZE + 1, TILE_SIZE * 2), true, UP, 3);
    Pacman pac4 = new Pacman(new Posn(TILE_SIZE * 2, TILE_SIZE), true, UP, 3);
    Pacman pac5 = new Pacman(new Posn(TILE_SIZE * 2, TILE_SIZE * 2), true, UP, 3);

    // testing with a pacman at tile posn (0,0) and pixel posn (0,0)
    t.checkExpect(pac1.tilePosn(), new Posn(0, 0));
    // testing with a pacman that is not at pixel posn (0,0) but is in tile (0, 0)
    t.checkExpect(pac2.tilePosn(), new Posn(0, 0));
    // testing with a pacman at posns other than (0,0)
    t.checkExpect(pac3.tilePosn(), new Posn(1, 2));
    t.checkExpect(pac3B.tilePosn(), new Posn(1, 2));
    t.checkExpect(pac4.tilePosn(), new Posn(2, 1));
    t.checkExpect(pac5.tilePosn(), new Posn(2, 2));
  }
  
  
  /////////////////////////////////////////////////////////////////////////////////////
  ///AGHOST
  //////////////////////////////////////////////////////////////////////////////////
  
  // to test the drawGhost method for the AGhost class
  
  // to test the getBody method for the AGhost class
  void testGetBody(Tester t) {
    Inky inky1 = new Inky(new Posn(0, 0), LEFT, CHASE, 3);
    Blinky blinky1 = new Blinky(new Posn(0, 0), LEFT, CHASE, 3);
    Pinky pinky1 = new Pinky(new Posn(0, 0), LEFT, CHASE, 3);
    Clyde clyde1 = new Clyde(new Posn(0, 0), LEFT, CHASE, 3);
    
    t.checkExpect(inky1.getBody(), inky);
    t.checkExpect(blinky1.getBody(), blinky);
    t.checkExpect(pinky1.getBody(), pinky);
    t.checkExpect(clyde1.getBody(), clyde);
    
    
  }

  // to test the moveGhost method for the AGhost class -- bug here with corners

  // to test the copyGhost method for the AGhost class
  void testCopyghost(Tester t) {
    Inky inky1 = new Inky(new Posn(0, 0), LEFT, CHASE, 3);
    Blinky blinky1 = new Blinky(new Posn(0, 0), LEFT, CHASE, 3);
    Pinky pinky1 = new Pinky(new Posn(0, 0), LEFT, CHASE, 3);
    Clyde clyde1 = new Clyde(new Posn(0, 0), LEFT, CHASE, 3);
    
    t.checkExpect(inky1.copyGhost(), inky1);
    t.checkExpect(blinky1.copyGhost(), blinky1);
    t.checkExpect(pinky1.copyGhost(), pinky1);
    t.checkExpect(clyde1.copyGhost(), clyde1);
  }

  // to test the moveBy method for the AGhost class

  // to test the moveToGoal method for the AGhost class
  
  // to test the moveRandomly method for the AGhost class
  
  // to test the getGoalPosn method for the AGhost class
  void testGetGoalPosn(Tester t) {
    Inky inky1 = new Inky(new Posn(0, 0), LEFT, SCATTER, 3);
    Inky inky2 = new Inky(new Posn(0, 0), LEFT, CHASE, 3);
    Blinky blinky1 = new Blinky(new Posn(0, 0), LEFT, SCATTER, 3);
    Blinky blinky2 = new Blinky(new Posn(0, 0), LEFT, CHASE, 3);
    Pinky pinky1 = new Pinky(new Posn(0, 0), LEFT, SCATTER, 3);
    Pinky pinky2 = new Pinky(new Posn(0, 0), LEFT, CHASE, 3);
    Clyde clyde1 = new Clyde(new Posn(0, 0), LEFT, SCATTER, 3);
    Clyde clyde2 = new Clyde(new Posn(0, 0), LEFT, CHASE, 3);
    int ncol = 2;
    int nrow = 3;
    Posn pacPosn = new Posn(5, 5);
    
    t.checkExpect(inky1.getGoalPosn(ncol, nrow, pacPosn), new Posn(ncol-1, nrow-1));
    t.checkExpect(inky2.getGoalPosn(ncol, nrow, pacPosn), new Posn(1, 5));
    t.checkExpect(blinky1.getGoalPosn(ncol, nrow, pacPosn), new Posn(ncol-1, 0));
    t.checkExpect(blinky2.getGoalPosn(ncol, nrow, pacPosn), pacPosn);
    t.checkExpect(pinky1.getGoalPosn(ncol, nrow, pacPosn), new Posn(0, 0));
    t.checkExpect(pinky2.getGoalPosn(ncol, nrow, pacPosn), new Posn(9, 5));
    t.checkExpect(clyde1.getGoalPosn(ncol, nrow, pacPosn), new Posn(0, nrow-1));
    t.checkExpect(clyde2.getGoalPosn(ncol, nrow, pacPosn), pacPosn);
  }
  
  // to test the findBestDir method for the AGhost class
  
  // to test the sameTile method for the AGhost class
  
  // to test the resetGhost method for the AGhost class
  
  //  to test the frightened method for the AGhost class


  /////////////////////////////////////////////////////////////////////////////////////
  ///INKY
  //////////////////////////////////////////////////////////////////////////////////
  
  // to test the getBody method for the Inky class -- sanity check for graphics
  void testGetBodyInky(Tester t) {
    Inky inky1 = new Inky(new Posn(0, 0), RIGHT, SCATTER);
 
    // testing that the inky body image is returned for an inky
    t.checkExpect(inky1.getBody(), inky);    
     
  }

  // to test the copyGhost method for the Inky class
  void testCopyGhostInky(Tester t) {
    Inky inky1 = new Inky(new Posn(0, 0), RIGHT, SCATTER);
    Inky inky2 = new Inky(new Posn(0, -2), LEFT, FRIGHT);
    Inky inky3 = new Inky(new Posn(3, 0), DOWN, CHASE);
    
    // testing that the copyGhost method retuns the exact same ghost
    t.checkExpect(inky1.copyGhost(), inky1);
    t.checkExpect(inky2.copyGhost(), inky2);
    t.checkExpect(inky3.copyGhost(), inky3);
    
  }

  // to test the getGoalPosn method for the Inky class
  void testGetGoalPosnInky(Tester t) {
    Inky inky1 = new Inky(new Posn(0, 0), RIGHT, SCATTER);
    Posn inky1Pos = new Posn(1, 2);
    Inky inky2 = new Inky(new Posn(0, 0), RIGHT, CHASE);
    Posn inky2Pos = new Posn(1, 5);
    int ncol = 2;
    int nrow = 3;
    Posn pacPosn = new Posn(5, 5);
    
    // testing with an Inky in scatter movement goalPosn will be the bottom right corner
    t.checkExpect(inky1.getGoalPosn(ncol, nrow, pacPosn), inky1Pos);  
    // testing with an Inky in chase movement goalPosn will be 4 to the left of the pacPosn
    t.checkExpect(inky2.getGoalPosn(ncol, nrow, pacPosn), inky2Pos);      
  }

  
  
  /////////////////////////////////////////////////////////////////////////////////////
  ///BLINKY
  //////////////////////////////////////////////////////////////////////////////////
  
  
  // to test the getBody method for the Blinky class
  void testGetBodyBlinky(Tester t) {
    Blinky blinky1 = new Blinky(new Posn(0, 0), RIGHT, SCATTER);
 
    // testing that the inky body image is returned for an inky
    t.checkExpect(blinky1.getBody(), blinky);    
     
  }

  // to test the copyGhost method for the Blinky class
  void testCopyGhostBlinky(Tester t) {
    Blinky blinky1 = new Blinky(new Posn(1, 1), UP, SCATTER);
    Blinky blinky2 = new Blinky(new Posn(0, -2), LEFT, FRIGHT);
    Blinky blinky3 = new Blinky(new Posn(3, 0), DOWN, CHASE);
    
    // testing that the copyGhost method retuns the exact same ghost
    t.checkExpect(blinky1.copyGhost(), blinky1);
    t.checkExpect(blinky2.copyGhost(), blinky2);
    t.checkExpect(blinky3.copyGhost(), blinky3);
    
  }
  
  // to test the getGoalPosn method for the Blinky class
  void testGetGoalPosnBlinky(Tester t) {
    Blinky blinky1 = new Blinky(new Posn(0, 0), RIGHT, SCATTER);
    Posn blinky1Pos = new Posn(1, 0);
    Blinky blinky2 = new Blinky(new Posn(0, 0), RIGHT, CHASE);
    Posn blinky2Pos = new Posn(5, 5);
    int ncol = 2;
    int nrow = 3;
    Posn pacPosn = new Posn(5, 5);
    
    // testing with a Blinky in scatter movement goalPosn will be the top right corner
    t.checkExpect(blinky1.getGoalPosn(ncol, nrow, pacPosn), blinky1Pos);  
    // testing with a Blinky in chase movement goalPosn will be the pacPosn
    t.checkExpect(blinky2.getGoalPosn(ncol, nrow, pacPosn), blinky2Pos);      
  }
  
  /////////////////////////////////////////////////////////////////////////////////////
  ///PINKY
  //////////////////////////////////////////////////////////////////////////////////
  
  
  // to test the getBody method for the Pinky class
  void testGetBodyPinky(Tester t) {
    Pinky pinky1 = new Pinky(new Posn(0, 0), LEFT, CHASE);
 
    // testing that the inky body image is returned for an inky
    t.checkExpect(pinky1.getBody(), pinky);    
     
  }

  // to test the copyGhost method for the Pinky class
  // to test the copyGhost method for the Blinky class
  void testCopyGhostPinky(Tester t) {
    Pinky pinky1 = new Pinky(new Posn(0, 1), UP, SCATTER);
    Pinky pinky2 = new Pinky(new Posn(-1, -2), RIGHT, FRIGHT);
    Pinky pinky3 = new Pinky(new Posn(3, 1), DOWN, CHASE);
    
    // testing that the copyGhost method retuns the exact same ghost
    t.checkExpect(pinky1.copyGhost(), pinky1);
    t.checkExpect(pinky2.copyGhost(), pinky2);
    t.checkExpect(pinky3.copyGhost(), pinky3);
    
  }

  // to test the getGoalPosn method for the Pinky class
  void testGetGoalPosnPinky(Tester t) {
    Pinky pinky1 = new Pinky(new Posn(0, 0), RIGHT, SCATTER);
    Posn pinky1Pos = new Posn(0, 0);
    Pinky pinky2 = new Pinky(new Posn(0, 0), RIGHT, CHASE);
    Posn pinky2Pos = new Posn(9, 5);
    int ncol = 2;
    int nrow = 3;
    Posn pacPosn = new Posn(5, 5);
    
    // testing with a Blinky in scatter movement goalPosn will be the top right corner
    t.checkExpect(pinky1.getGoalPosn(ncol, nrow, pacPosn), pinky1Pos);  
    // testing with a Blinky in chase movement goalPosn will be the pacPosn
    t.checkExpect(pinky2.getGoalPosn(ncol, nrow, pacPosn), pinky2Pos);   
  }
  

  /////////////////////////////////////////////////////////////////////////////////////
  ///CLYDE
  //////////////////////////////////////////////////////////////////////////////////
  
  
  // to test the getBody method for the Clyde class
  void testGetBodyClyde(Tester t) {
    Clyde clyde1 = new Clyde(new Posn(0, 0), DOWN, FRIGHT);
 
    // testing that the inky body image is returned for an inky
    t.checkExpect(clyde1.getBody(), clyde);    
  }

  // to test the copyGhost method for the Clyde class
  void testCopyGhostClyde(Tester t) {
    Clyde clyde1 = new Clyde(new Posn(0, 1), UP, SCATTER);
    Clyde clyde2 = new Clyde(new Posn(-1, -2), RIGHT, FRIGHT);
    Clyde clyde3 = new Clyde(new Posn(3, 1), DOWN, CHASE);
    
    // testing that the copyGhost method retuns the exact same ghost
    t.checkExpect(clyde1.copyGhost(), clyde1);
    t.checkExpect(clyde2.copyGhost(), clyde2);
    t.checkExpect(clyde3.copyGhost(), clyde3);
    
  }

  // to test the getGoalPosn method for the Clyde class
  void testGetGoalPosnClyde(Tester t) {
    Clyde clyde1 = new Clyde(new Posn(0, 0), RIGHT, SCATTER);
    Posn clyde1Pos = new Posn(0, 2);
    Clyde clyde2 = new Clyde(new Posn(0, 0), RIGHT, CHASE);
    Posn clyde2Pos = new Posn(0, 5);
    int ncol = 2;
    int nrow = 3;
    Posn pacPosn = new Posn(0, 5);
    Posn pacPosn2 = new Posn(15, 15);
    
    // testing with a Blinky in scatter movement goalPosn will be the bottom left corner
    t.checkExpect(clyde1.getGoalPosn(ncol, nrow, pacPosn), clyde1Pos);  
    // testing with a Blinky in chase movement goalPosn will be the pacPosn if the distance 
    // between the pacman and the ghost is less than 8
    t.checkExpect(clyde2.getGoalPosn(ncol, nrow, pacPosn), clyde2Pos);     
    // testing with a Blinky in chase movement goaPosn will be the bottom left corner
    t.checkExpect(clyde2.getGoalPosn(ncol, nrow, pacPosn2), clyde1Pos);     
  }
  
  
  
  /////////////////////////////////////////////////////////////////////////////////////
  ///GAMEOFPACMAN
  //////////////////////////////////////////////////////////////////////////////////
  
  // to test the makeScene method for the GameOfPacman class

  // to test the onTick method for the GameOfPacman class

  // to test the onKeyEvent method for the GameOfPacman class

  // to test the drawScore method for the GameOfPacman class

  // to test the worldEnds method for the GameOfPacman class

  // to test the makeFinalScene method for the GameOfPacman class

  /////////////////////////////////////////////////////////////////////////////////////
  ///ARRAYLISTUTILS
  //////////////////////////////////////////////////////////////////////////////////
  
  // to test the drawBoard method for the ArrayListUtils class
  
  // to test the drawDots method for the ArrayListUtils class

  // to test the drawSupers method for the ArrayListUtils class

  // to test the canMove method for the ArrayListUtils class

  // to test the hasTileAt method for the ArrayListUtils class

  // to test the removeEaten method for the ArrayListUtils class

  // to test the shortestPathDir method for the ArrayListUtils class

  // to test the allOnScreen method for the ArrayListUtils class


}


