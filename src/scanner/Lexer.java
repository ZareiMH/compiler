/* The following code was generated by JFlex 1.6.1 */

package scanner;

import java_cup.runtime.*;
import parser.sym;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>Scanner.flex</tt>
 */
public class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;
  public static final int CHAR = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\14\1\5\1\7\1\10\1\6\22\0\1\14\1\45\1\70"+
    "\1\0\1\0\1\55\1\51\1\71\1\60\1\61\1\54\1\4\1\63"+
    "\1\3\1\62\1\13\1\73\11\2\1\64\1\65\1\46\1\44\1\47"+
    "\2\0\4\1\1\12\6\1\1\43\1\1\1\41\6\1\1\42\5\1"+
    "\1\66\1\72\1\67\1\53\1\1\1\0\1\25\1\15\1\20\1\30"+
    "\1\11\1\32\1\33\1\35\1\31\1\1\1\26\1\17\1\1\1\21"+
    "\1\16\2\1\1\24\1\22\1\23\1\27\1\36\1\34\1\40\1\1"+
    "\1\37\1\56\1\52\1\57\1\50\6\0\1\7\u1fa2\0\1\7\1\7"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\0\1\2\1\3\1\4\1\5\1\6"+
    "\2\7\1\3\1\10\16\3\1\11\1\2\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\1\1\36\1\37\1\2\1\40\1\2"+
    "\2\0\1\41\1\42\1\43\1\44\3\3\1\45\3\3"+
    "\1\46\20\3\1\47\6\3\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63"+
    "\1\64\1\65\1\40\1\0\1\66\2\0\1\3\1\67"+
    "\10\3\1\70\7\3\1\71\3\3\1\72\1\73\5\3"+
    "\2\0\1\74\2\3\1\75\1\3\1\76\2\3\1\77"+
    "\1\100\1\101\3\3\1\102\2\3\1\103\4\3\1\104"+
    "\1\66\1\0\1\3\1\105\1\106\1\107\10\3\1\110"+
    "\1\3\1\111\1\3\1\112\1\113\1\114\1\115\1\116"+
    "\1\3\1\117\2\3\1\120\1\3\1\121\1\122";

  private static int [] zzUnpackAction() {
    int [] result = new int[195];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\74\0\170\0\264\0\360\0\u012c\0\u0168\0\u01a4"+
    "\0\264\0\u01e0\0\u021c\0\u0258\0\u0294\0\u02d0\0\u030c\0\u0348"+
    "\0\u0384\0\u03c0\0\u03fc\0\u0438\0\u0474\0\u04b0\0\u04ec\0\u0528"+
    "\0\u0564\0\u05a0\0\u05dc\0\u0618\0\u0654\0\u0690\0\264\0\264"+
    "\0\264\0\264\0\u06cc\0\264\0\264\0\264\0\264\0\264"+
    "\0\264\0\264\0\264\0\264\0\264\0\264\0\264\0\264"+
    "\0\u0708\0\264\0\u0744\0\u0780\0\u0780\0\u07bc\0\u07f8\0\u0834"+
    "\0\264\0\264\0\264\0\264\0\u0870\0\u08ac\0\u08e8\0\264"+
    "\0\u0924\0\u0960\0\u099c\0\360\0\u09d8\0\u0a14\0\u0a50\0\u0a8c"+
    "\0\u0ac8\0\u0b04\0\u0b40\0\u0b7c\0\u0bb8\0\u0bf4\0\u0c30\0\u0c6c"+
    "\0\u0ca8\0\u0ce4\0\u0d20\0\u0d5c\0\360\0\u0d98\0\u0dd4\0\u0e10"+
    "\0\u0e4c\0\u0e88\0\u0ec4\0\264\0\264\0\264\0\264\0\264"+
    "\0\264\0\264\0\264\0\264\0\264\0\264\0\264\0\264"+
    "\0\264\0\264\0\u0780\0\u0f00\0\u0f3c\0\u0f78\0\u0fb4\0\360"+
    "\0\u0ff0\0\u102c\0\u1068\0\u10a4\0\u10e0\0\u111c\0\u1158\0\u1194"+
    "\0\360\0\u11d0\0\u120c\0\u1248\0\u1284\0\u12c0\0\u12fc\0\u1338"+
    "\0\360\0\u1374\0\u13b0\0\u13ec\0\360\0\360\0\u1428\0\u1464"+
    "\0\u14a0\0\u14dc\0\u1518\0\u1554\0\u1590\0\360\0\u15cc\0\u1608"+
    "\0\360\0\u1644\0\360\0\u1680\0\u16bc\0\360\0\360\0\360"+
    "\0\u16f8\0\u1734\0\u1770\0\360\0\u17ac\0\u17e8\0\360\0\u1824"+
    "\0\u1860\0\u189c\0\u18d8\0\360\0\u1590\0\u1914\0\u1950\0\360"+
    "\0\360\0\360\0\u198c\0\u19c8\0\u1a04\0\u1a40\0\u1a7c\0\u1ab8"+
    "\0\u1af4\0\u1b30\0\360\0\u1b6c\0\360\0\u1ba8\0\360\0\360"+
    "\0\360\0\360\0\360\0\u1be4\0\360\0\u1c20\0\u1c5c\0\360"+
    "\0\u1c98\0\360\0\360";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[195];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\4"+
    "\1\11\1\13\1\5\1\14\1\11\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\2\5\1\26"+
    "\1\27\1\30\3\5\1\31\2\5\1\32\2\5\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\57\1\60\1\4\1\6\5\61"+
    "\2\4\61\61\1\62\1\61\1\63\1\61\71\64\1\65"+
    "\1\66\1\64\75\0\2\5\6\0\2\5\2\0\27\5"+
    "\27\0\1\5\2\67\1\6\2\67\4\0\2\70\60\67"+
    "\1\6\2\0\1\6\1\71\40\0\1\72\26\0\1\6"+
    "\2\0\1\6\1\0\1\73\37\0\1\74\26\0\1\6"+
    "\5\0\1\11\67\0\2\5\6\0\2\5\2\0\2\5"+
    "\1\75\1\5\1\76\16\5\1\77\3\5\27\0\1\5"+
    "\44\0\1\100\30\0\2\5\6\0\1\101\1\5\2\0"+
    "\1\5\1\102\5\5\1\103\17\5\27\0\1\5\1\0"+
    "\2\5\6\0\2\5\2\0\7\5\1\104\17\5\27\0"+
    "\1\5\1\0\2\5\6\0\2\5\2\0\1\5\1\105"+
    "\25\5\27\0\1\5\1\0\2\5\6\0\2\5\2\0"+
    "\1\5\1\106\6\5\1\107\7\5\1\110\6\5\27\0"+
    "\1\5\1\0\2\5\6\0\2\5\2\0\1\5\1\111"+
    "\10\5\1\112\14\5\27\0\1\5\1\0\2\5\6\0"+
    "\2\5\2\0\6\5\1\113\5\5\1\114\2\5\1\115"+
    "\7\5\27\0\1\5\1\0\2\5\6\0\2\5\2\0"+
    "\7\5\1\116\17\5\27\0\1\5\1\0\2\5\6\0"+
    "\1\117\1\5\2\0\27\5\27\0\1\5\1\0\2\5"+
    "\6\0\2\5\2\0\4\5\1\120\5\5\1\121\14\5"+
    "\27\0\1\5\1\0\2\5\6\0\1\122\1\5\2\0"+
    "\1\5\1\123\25\5\27\0\1\5\1\0\2\5\6\0"+
    "\2\5\2\0\4\5\1\124\10\5\1\125\11\5\27\0"+
    "\1\5\1\0\2\5\6\0\2\5\2\0\1\5\1\126"+
    "\1\127\5\5\1\130\1\5\1\131\14\5\27\0\1\5"+
    "\1\0\2\5\6\0\2\5\2\0\1\5\1\132\25\5"+
    "\27\0\1\5\1\0\2\5\6\0\2\5\2\0\25\5"+
    "\1\133\1\5\27\0\1\5\44\0\1\134\73\0\1\135"+
    "\73\0\1\136\73\0\1\137\73\0\1\140\27\0\5\61"+
    "\2\0\61\61\1\0\1\61\1\0\1\61\15\0\1\141"+
    "\3\0\1\142\1\0\1\143\1\144\5\0\1\145\3\0"+
    "\1\146\31\0\1\147\1\150\1\0\1\151\71\0\1\152"+
    "\17\0\1\153\3\0\1\153\1\0\2\153\5\0\1\153"+
    "\3\0\1\153\31\0\1\153\1\65\2\153\2\0\1\154"+
    "\2\155\66\0\1\154\2\0\1\154\2\156\66\0\1\154"+
    "\1\0\2\5\6\0\2\5\2\0\5\5\1\157\21\5"+
    "\27\0\1\5\1\0\2\5\6\0\2\5\2\0\13\5"+
    "\1\160\13\5\27\0\1\5\1\0\2\5\6\0\2\5"+
    "\2\0\6\5\1\161\20\5\27\0\1\5\1\0\2\5"+
    "\6\0\2\5\2\0\16\5\1\162\10\5\27\0\1\5"+
    "\1\0\2\5\6\0\2\5\2\0\1\5\1\163\25\5"+
    "\27\0\1\5\1\0\2\5\6\0\1\164\1\5\2\0"+
    "\27\5\27\0\1\5\1\0\2\5\6\0\2\5\2\0"+
    "\4\5\1\165\22\5\27\0\1\5\1\0\2\5\6\0"+
    "\2\5\2\0\4\5\1\166\22\5\27\0\1\5\1\0"+
    "\2\5\6\0\2\5\2\0\5\5\1\167\21\5\27\0"+
    "\1\5\1\0\2\5\6\0\2\5\2\0\10\5\1\170"+
    "\16\5\27\0\1\5\1\0\2\5\6\0\2\5\2\0"+
    "\6\5\1\171\20\5\27\0\1\5\1\0\2\5\6\0"+
    "\2\5\2\0\2\5\1\172\24\5\27\0\1\5\1\0"+
    "\2\5\6\0\2\5\2\0\7\5\1\173\17\5\27\0"+
    "\1\5\1\0\2\5\6\0\2\5\2\0\22\5\1\174"+
    "\4\5\27\0\1\5\1\0\2\5\6\0\2\5\2\0"+
    "\14\5\1\175\12\5\27\0\1\5\1\0\2\5\6\0"+
    "\2\5\2\0\12\5\1\176\14\5\27\0\1\5\1\0"+
    "\2\5\6\0\2\5\2\0\3\5\1\177\2\5\1\200"+
    "\20\5\27\0\1\5\1\0\2\5\6\0\2\5\2\0"+
    "\13\5\1\201\13\5\27\0\1\5\1\0\2\5\6\0"+
    "\2\5\2\0\6\5\1\202\20\5\27\0\1\5\1\0"+
    "\2\5\6\0\2\5\2\0\15\5\1\203\11\5\27\0"+
    "\1\5\1\0\2\5\6\0\2\5\2\0\12\5\1\204"+
    "\14\5\27\0\1\5\1\0\2\5\6\0\2\5\2\0"+
    "\6\5\1\205\20\5\27\0\1\5\1\0\2\5\6\0"+
    "\2\5\2\0\7\5\1\206\17\5\27\0\1\5\1\0"+
    "\2\5\6\0\2\5\2\0\1\5\1\207\25\5\27\0"+
    "\1\5\1\0\2\5\6\0\2\5\2\0\2\5\1\210"+
    "\24\5\27\0\1\5\1\0\2\5\6\0\2\5\2\0"+
    "\4\5\1\211\22\5\27\0\1\5\1\0\2\5\6\0"+
    "\2\5\2\0\14\5\1\212\12\5\27\0\1\5\1\0"+
    "\2\5\6\0\2\5\2\0\26\5\1\213\27\0\1\5"+
    "\2\0\1\154\6\0\2\214\60\0\1\154\2\0\1\154"+
    "\70\0\1\154\2\0\1\154\2\215\66\0\1\154\1\0"+
    "\2\5\6\0\1\216\1\5\2\0\27\5\27\0\1\5"+
    "\1\0\2\5\6\0\1\217\1\5\2\0\27\5\27\0"+
    "\1\5\1\0\2\5\6\0\2\5\2\0\14\5\1\220"+
    "\12\5\27\0\1\5\1\0\2\5\6\0\2\5\2\0"+
    "\2\5\1\221\24\5\27\0\1\5\1\0\2\5\6\0"+
    "\2\5\2\0\10\5\1\222\16\5\27\0\1\5\1\0"+
    "\2\5\6\0\2\5\2\0\16\5\1\223\10\5\27\0"+
    "\1\5\1\0\2\5\6\0\2\5\2\0\5\5\1\224"+
    "\1\225\20\5\27\0\1\5\1\0\2\5\6\0\1\226"+
    "\1\5\2\0\27\5\27\0\1\5\1\0\2\5\6\0"+
    "\2\5\2\0\7\5\1\227\17\5\27\0\1\5\1\0"+
    "\2\5\6\0\2\5\2\0\2\5\1\230\24\5\27\0"+
    "\1\5\1\0\2\5\6\0\2\5\2\0\14\5\1\231"+
    "\12\5\27\0\1\5\1\0\2\5\6\0\1\232\1\5"+
    "\2\0\27\5\27\0\1\5\1\0\2\5\6\0\2\5"+
    "\2\0\6\5\1\233\20\5\27\0\1\5\1\0\2\5"+
    "\6\0\1\234\1\5\2\0\27\5\27\0\1\5\1\0"+
    "\2\5\6\0\2\5\2\0\1\5\1\235\25\5\27\0"+
    "\1\5\1\0\2\5\6\0\2\5\2\0\12\5\1\236"+
    "\14\5\27\0\1\5\1\0\2\5\6\0\2\5\2\0"+
    "\1\5\1\237\25\5\27\0\1\5\1\0\2\5\6\0"+
    "\2\5\2\0\10\5\1\240\16\5\27\0\1\5\1\0"+
    "\2\5\6\0\2\5\2\0\1\241\26\5\27\0\1\5"+
    "\1\0\2\5\6\0\2\5\2\0\10\5\1\242\16\5"+
    "\27\0\1\5\1\0\2\5\6\0\2\5\2\0\5\5"+
    "\1\176\21\5\27\0\1\5\1\0\2\5\6\0\2\5"+
    "\2\0\3\5\1\243\23\5\27\0\1\5\1\0\2\5"+
    "\6\0\2\5\2\0\13\5\1\244\13\5\27\0\1\5"+
    "\1\0\2\5\6\0\2\5\2\0\26\5\1\230\27\0"+
    "\1\5\2\0\1\245\2\246\66\0\1\245\2\0\1\245"+
    "\70\0\1\245\1\0\2\5\6\0\2\5\2\0\7\5"+
    "\1\247\17\5\27\0\1\5\1\0\2\5\6\0\2\5"+
    "\2\0\4\5\1\250\22\5\27\0\1\5\1\0\2\5"+
    "\6\0\2\5\2\0\11\5\1\251\15\5\27\0\1\5"+
    "\1\0\2\5\6\0\2\5\2\0\6\5\1\252\20\5"+
    "\27\0\1\5\1\0\2\5\6\0\2\5\2\0\14\5"+
    "\1\253\12\5\27\0\1\5\1\0\2\5\6\0\2\5"+
    "\2\0\4\5\1\254\22\5\27\0\1\5\1\0\2\5"+
    "\6\0\2\5\2\0\1\5\1\255\25\5\27\0\1\5"+
    "\1\0\2\5\6\0\2\5\2\0\3\5\1\256\23\5"+
    "\27\0\1\5\1\0\2\5\6\0\2\5\2\0\7\5"+
    "\1\257\17\5\27\0\1\5\1\0\2\5\6\0\2\5"+
    "\2\0\7\5\1\260\17\5\27\0\1\5\1\0\2\5"+
    "\6\0\2\5\2\0\12\5\1\261\14\5\27\0\1\5"+
    "\1\0\2\5\6\0\2\5\2\0\2\5\1\262\24\5"+
    "\27\0\1\5\1\0\2\5\6\0\2\5\2\0\6\5"+
    "\1\263\20\5\27\0\1\5\1\0\2\5\6\0\2\5"+
    "\2\0\6\5\1\264\20\5\27\0\1\5\2\0\1\245"+
    "\2\215\66\0\1\245\1\0\2\5\6\0\2\5\2\0"+
    "\4\5\1\265\22\5\27\0\1\5\1\0\2\5\6\0"+
    "\2\5\2\0\4\5\1\266\22\5\27\0\1\5\1\0"+
    "\2\5\6\0\2\5\2\0\16\5\1\267\10\5\27\0"+
    "\1\5\1\0\2\5\6\0\2\5\2\0\15\5\1\270"+
    "\11\5\27\0\1\5\1\0\2\5\6\0\2\5\2\0"+
    "\20\5\1\271\6\5\27\0\1\5\1\0\2\5\6\0"+
    "\2\5\2\0\13\5\1\272\13\5\27\0\1\5\1\0"+
    "\2\5\6\0\2\5\2\0\4\5\1\273\22\5\27\0"+
    "\1\5\1\0\2\5\6\0\2\5\2\0\2\5\1\274"+
    "\24\5\27\0\1\5\1\0\2\5\6\0\1\275\1\5"+
    "\2\0\27\5\27\0\1\5\1\0\2\5\6\0\2\5"+
    "\2\0\14\5\1\276\12\5\27\0\1\5\1\0\2\5"+
    "\6\0\2\5\2\0\12\5\1\277\14\5\27\0\1\5"+
    "\1\0\2\5\6\0\2\5\2\0\6\5\1\300\20\5"+
    "\27\0\1\5\1\0\2\5\6\0\2\5\2\0\1\5"+
    "\1\301\25\5\27\0\1\5\1\0\2\5\6\0\1\302"+
    "\1\5\2\0\27\5\27\0\1\5\1\0\2\5\6\0"+
    "\2\5\2\0\4\5\1\303\22\5\27\0\1\5";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7380];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\1\1\0\1\11\4\1\1\11\25\1\4\11"+
    "\1\1\15\11\1\1\1\11\4\1\2\0\4\11\3\1"+
    "\1\11\33\1\17\11\1\0\1\1\2\0\35\1\2\0"+
    "\30\1\1\0\35\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[195];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    StringBuilder string;
    StringBuilder character;

    private Symbol symbol(int type) {
		return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symbol(int type, Object value) {
    	return new Symbol(type, yyline, yycolumn, value);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 194) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Symbol scanFunction() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            switch (zzLexicalState) {
            case YYINITIAL: {
              return symbol(sym.EOF);
            }
            case 196: break;
            default:
        return null;
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { string.append( yytext() );
            }
          case 83: break;
          case 2: 
            { throw new Error("Illegal character <" + yytext() + ">");
            }
          case 84: break;
          case 3: 
            { return symbol(sym.ID, new String(yytext()));
            }
          case 85: break;
          case 4: 
            { return symbol(sym.INTCONST, new Integer(yytext()));
            }
          case 86: break;
          case 5: 
            { return symbol(sym.MINUS);
            }
          case 87: break;
          case 6: 
            { return symbol(sym.ADD);
            }
          case 88: break;
          case 7: 
            { 
            }
          case 89: break;
          case 8: 
            { return symbol(sym.DIV);
            }
          case 90: break;
          case 9: 
            { return symbol(sym.ASSIGN);
            }
          case 91: break;
          case 10: 
            { return symbol(sym.LESS);
            }
          case 92: break;
          case 11: 
            { return symbol(sym.GR);
            }
          case 93: break;
          case 12: 
            { return symbol(sym.BITNEG);
            }
          case 94: break;
          case 13: 
            { return symbol(sym.ARITHAND);
            }
          case 95: break;
          case 14: 
            { return symbol(sym.ARITHOR);
            }
          case 96: break;
          case 15: 
            { return symbol(sym.XOR);
            }
          case 97: break;
          case 16: 
            { return symbol(sym.PROD);
            }
          case 98: break;
          case 17: 
            { return symbol(sym.MOD);
            }
          case 99: break;
          case 18: 
            { return symbol(sym.LCURLY);
            }
          case 100: break;
          case 19: 
            { return symbol(sym.RCURLY);
            }
          case 101: break;
          case 20: 
            { return symbol(sym.LPAREN);
            }
          case 102: break;
          case 21: 
            { return symbol(sym.RPAREN);
            }
          case 103: break;
          case 22: 
            { return symbol(sym.DOT);
            }
          case 104: break;
          case 23: 
            { return symbol(sym.COMMA);
            }
          case 105: break;
          case 24: 
            { return symbol(sym.COLON);
            }
          case 106: break;
          case 25: 
            { return symbol(sym.SEMICOLON);
            }
          case 107: break;
          case 26: 
            { return symbol(sym.LBRACK);
            }
          case 108: break;
          case 27: 
            { return symbol(sym.RBRACK);
            }
          case 109: break;
          case 28: 
            { string = new StringBuilder("\""); yybegin(STRING);
            }
          case 110: break;
          case 29: 
            { character = new StringBuilder("\'"); yybegin(CHAR);
            }
          case 111: break;
          case 30: 
            { string.append("\"");
	    yybegin(YYINITIAL);
	    return symbol(sym.STRINGCONST, new String(string.toString()));
            }
          case 112: break;
          case 31: 
            { string.append("\\");
            }
          case 113: break;
          case 32: 
            { character.append(yytext());
	    yybegin(YYINITIAL);
	    return symbol(sym.CHARCONST, new String(character.toString()));
            }
          case 114: break;
          case 33: 
            { return symbol(sym.DEC);
            }
          case 115: break;
          case 34: 
            { return symbol(sym.SUBASS);
            }
          case 116: break;
          case 35: 
            { return symbol(sym.INC);
            }
          case 117: break;
          case 36: 
            { return symbol(sym.ADDASS);
            }
          case 118: break;
          case 37: 
            { return symbol(sym.DIVASS);
            }
          case 119: break;
          case 38: 
            { return symbol(sym.LOGICOR);
            }
          case 120: break;
          case 39: 
            { return symbol(sym.IF);
            }
          case 121: break;
          case 40: 
            { return symbol(sym.EQ);
            }
          case 122: break;
          case 41: 
            { return symbol(sym.NOTEQ);
            }
          case 123: break;
          case 42: 
            { return symbol(sym.LESSEQ);
            }
          case 124: break;
          case 43: 
            { return symbol(sym.GREQ);
            }
          case 125: break;
          case 44: 
            { return symbol(sym.MULTASS);
            }
          case 126: break;
          case 45: 
            { string.append("\\b");
            }
          case 127: break;
          case 46: 
            { string.append("\\n");
            }
          case 128: break;
          case 47: 
            { string.append("\\t");
            }
          case 129: break;
          case 48: 
            { string.append("\\r");
            }
          case 130: break;
          case 49: 
            { string.append("\\f");
            }
          case 131: break;
          case 50: 
            { string.append("\\v");
            }
          case 132: break;
          case 51: 
            { string.append("\\\"");
            }
          case 133: break;
          case 52: 
            { string.append("\\\'");
            }
          case 134: break;
          case 53: 
            { string.append("\\0");
            }
          case 135: break;
          case 54: 
            { return symbol(sym.REALCONST, new Double(yytext()));
            }
          case 136: break;
          case 55: 
            { return symbol(sym.END);
            }
          case 137: break;
          case 56: 
            { return symbol(sym.NOT);
            }
          case 138: break;
          case 57: 
            { return symbol(sym.LOGICAND);
            }
          case 139: break;
          case 58: 
            { return symbol(sym.INT);
            }
          case 140: break;
          case 59: 
            { return symbol(sym.FOR);
            }
          case 141: break;
          case 60: 
            { return symbol(sym.ELSE);
            }
          case 142: break;
          case 61: 
            { return symbol(sym.BOOL);
            }
          case 143: break;
          case 62: 
            { return symbol(sym.LONG);
            }
          case 144: break;
          case 63: 
            { return symbol(sym.CASE);
            }
          case 145: break;
          case 64: 
            { return symbol(sym.CHAR);
            }
          case 146: break;
          case 65: 
            { return symbol(sym.NULL);
            }
          case 147: break;
          case 66: 
            { return symbol(sym.BOOLCONST);
            }
          case 148: break;
          case 67: 
            { return symbol(sym.AUTO);
            }
          case 149: break;
          case 68: 
            { return symbol(sym.VOID);
            }
          case 150: break;
          case 69: 
            { return symbol(sym.BEGIN);
            }
          case 151: break;
          case 70: 
            { return symbol(sym.BREAK);
            }
          case 152: break;
          case 71: 
            { return symbol(sym.CONST);
            }
          case 153: break;
          case 72: 
            { return symbol(sym.FLOAT);
            }
          case 154: break;
          case 73: 
            { return symbol(sym.EXTERN);
            }
          case 155: break;
          case 74: 
            { return symbol(sym.STRING);
            }
          case 156: break;
          case 75: 
            { return symbol(sym.SIZEOF);
            }
          case 157: break;
          case 76: 
            { return symbol(sym.SWITCH);
            }
          case 158: break;
          case 77: 
            { return symbol(sym.RECORD);
            }
          case 159: break;
          case 78: 
            { return symbol(sym.RETURN);
            }
          case 160: break;
          case 79: 
            { return symbol(sym.DOUBLE);
            }
          case 161: break;
          case 80: 
            { return symbol(sym.DEFAULT);
            }
          case 162: break;
          case 81: 
            { return symbol(sym.CONTINUE);
            }
          case 163: break;
          case 82: 
            { return symbol(sym.FUNCTION);
            }
          case 164: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}