
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.mycompany.sumamultiplicacion.gramatica;

import java_cup.runtime.*;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return ParserSym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\017\000\002\002\003\000\002\002\004\000\002\003" +
    "\004\000\002\010\002\000\002\011\002\000\002\004\007" +
    "\000\002\004\002\000\002\005\004\000\002\012\002\000" +
    "\002\013\002\000\002\006\007\000\002\006\002\000\002" +
    "\007\003\000\002\014\002\000\002\007\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\027\000\006\004\004\007\005\001\002\000\012\002" +
    "\ufff5\005\ufff5\006\ufff5\010\ufff5\001\002\000\006\004\ufff4" +
    "\007\ufff4\001\002\000\010\002\ufffb\005\022\010\ufffb\001" +
    "\002\000\012\002\ufff6\005\ufff6\006\013\010\ufff6\001\002" +
    "\000\004\002\001\001\002\000\004\002\012\001\002\000" +
    "\004\002\000\001\002\000\006\004\ufff9\007\ufff9\001\002" +
    "\000\010\002\ufffa\005\ufffa\010\ufffa\001\002\000\006\004" +
    "\004\007\005\001\002\000\012\002\ufff8\005\ufff8\006\ufff8" +
    "\010\ufff8\001\002\000\012\002\ufff6\005\ufff6\006\013\010" +
    "\ufff6\001\002\000\010\002\ufff7\005\ufff7\010\ufff7\001\002" +
    "\000\006\002\uffff\010\uffff\001\002\000\006\004\ufffe\007" +
    "\ufffe\001\002\000\006\004\004\007\005\001\002\000\010" +
    "\002\ufffd\005\ufffd\010\ufffd\001\002\000\010\002\ufffb\005" +
    "\022\010\ufffb\001\002\000\006\002\ufffc\010\ufffc\001\002" +
    "\000\006\004\004\007\005\001\002\000\004\010\031\001" +
    "\002\000\012\002\ufff3\005\ufff3\006\ufff3\010\ufff3\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\027\000\012\002\010\003\007\005\005\007\006\001" +
    "\001\000\002\001\001\000\004\014\026\001\001\000\004" +
    "\004\020\001\001\000\004\006\013\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\012\014" +
    "\001\001\000\002\001\001\000\004\007\015\001\001\000" +
    "\004\013\016\001\001\000\004\006\017\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\010\022\001\001\000" +
    "\006\005\023\007\006\001\001\000\004\011\024\001\001" +
    "\000\004\004\025\001\001\000\002\001\001\000\010\003" +
    "\027\005\005\007\006\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




        private ArrayList<String> pila = new ArrayList<>();
	private int resultado;
        private int id = 0;
        private int idRank = 0;
        private String[] nodoEP;
        private String nodoAux;
        private String codigoImg = "graph g {\n";
        private String postfijo = "";

        public int getResultado(){
            return this.resultado;
        }

        public String getCodigoImg(){
            return this.codigoImg;
        }

        private int getNum(Object num){
            return Integer.valueOf(String.valueOf(num));
        }

        private String getNodo(int i, String lbl){
            return "    nodo"+String.valueOf(i)+"[label=\""+lbl+"\"];\n";
        }

        private void pilaPop(){
            if(pila.size()>0){
                pila.remove(pila.size()-1);
            }
        }

        private String conectar(String n1, String[] n2){
            String codigo ="";

            if(n2.length>1){
                codigo += "    rank"+idRank+" [style=invisible];\n";
                idRank++;
                codigo += "    rank"+idRank+" [style=invisible];\n";
                idRank++;
                codigo += "rank"+(idRank-2)+" -- rank"+(idRank-1)+" [color=white];";
            }

            for(int i=0; i<n2.length; i++){
                codigo += "    "+n1+"--"+n2[i]+";\n";
            }

            if(n2.length>1){
                codigo += "     {\n         rank=same;\n        rank"+(idRank-1);
                for(int i=0; i<n2.length; i++){
                    codigo += " -- "+n2[i];
                }
                codigo += " [ style=invis ]; rankdir = LR;     \n}\n";
            }

            return codigo;
        }

        private String ultimoPila(){
            return pila.get(pila.size()-1);
        }

        public String getPostfijo(){
            return this.postfijo;
        }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // inicial ::= e 
            {
              Object RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int numright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object num = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 
                    resultado = getNum(num); 
                    codigoImg += "\n}";
                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("inicial",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= inicial EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // e ::= t ep 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int epleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int epright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object ep = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
            if(ep == null){
                RESULT = t;
            }else{
                RESULT = getNum(t) + getNum(ep);
            }
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("e",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // NT$0 ::= 
            {
              Object RESULT =null;

            codigoImg += getNodo(id,"+");
            pila.add("nodo"+id);
            codigoImg += conectar(ultimoPila(),nodoEP);
            id++;
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("NT$0",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // NT$1 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

            codigoImg += conectar(ultimoPila(),nodoEP);
            String[] arreglo = {ultimoPila()};
            nodoEP = arreglo;
            pilaPop();
            postfijo += "+ ";
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("NT$1",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // ep ::= MAS NT$0 t NT$1 ep 
            {
              Object RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int epleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int epright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object ep = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		            
            if(ep == null){
                RESULT = t;
            }else{
                RESULT = getNum(t) + getNum(ep);
            }
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ep",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // ep ::= 
            {
              Object RESULT =null;
		
            RESULT = null;
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ep",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // t ::= f tp 
            {
              Object RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object f = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int tpleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int tpright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object tp = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
            if(tp == null){
                RESULT = f;
            }else{
                RESULT = getNum(f) * getNum(tp);
            }
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("t",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // NT$2 ::= 
            {
              Object RESULT =null;

            codigoImg += getNodo(id,"*");
            pila.add("nodo"+id);
            codigoImg += conectar(ultimoPila(),nodoEP);
            id++;
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("NT$2",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // NT$3 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object f = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;

            codigoImg += conectar(ultimoPila(),nodoEP);
            String[] arreglo = {ultimoPila()};
            nodoEP = arreglo;
            pilaPop();
            postfijo += "* ";
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("NT$3",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // tp ::= POR NT$2 f NT$3 tp 
            {
              Object RESULT =null;
              // propagate RESULT from NT$3
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object f = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int tpleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int tpright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object tp = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
            if(tp == null){
                RESULT = f;
            }else{
                RESULT = getNum(f) * getNum(tp);
            }
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tp",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // tp ::= 
            {
              Object RESULT =null;
		
            RESULT = null;
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("tp",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // f ::= NUMERO 
            {
              Object RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int numright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object num = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
            postfijo += String.valueOf(num)+" ";
            codigoImg += getNodo(id,String.valueOf(num));
            String[] arreglo = {"nodo"+id};
            nodoEP = arreglo;
            id++;
            RESULT =  num; 
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("f",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // NT$4 ::= 
            {
              Object RESULT =null;

            postfijo += "( ";
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("NT$4",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // f ::= PAR_A NT$4 e PAR_C 
            {
              Object RESULT =null;
              // propagate RESULT from NT$4
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
            int id1 = id;
            id++;
            int id2 = id;
            id++;
            codigoImg += getNodo(id1,"(");
            codigoImg += getNodo(id2,")");
            
            String[] arreglo4 = new String[nodoEP.length+2];
            arreglo4[0] = "nodo"+id1;
            for(int i=1; i<nodoEP.length+1; i++){
                arreglo4[i] = nodoEP[i-1];
            }
            arreglo4[nodoEP.length+1] = "nodo"+id2;
            nodoEP = arreglo4;

            RESULT = e;
        
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("f",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
