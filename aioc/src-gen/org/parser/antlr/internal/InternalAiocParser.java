package org.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.services.AiocGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAiocParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LCURLY", "RULE_RCURLY", "RULE_LRND", "RULE_RRND", "RULE_AND", "RULE_OR", "RULE_ID", "RULE_TRUE", "RULE_FALSE", "RULE_STRING", "RULE_COMMA", "RULE_AT", "RULE_COLON", "RULE_PIPE", "RULE_SEMICOLON", "RULE_ARROW", "RULE_ASSIGN", "RULE_PLUS", "RULE_MINUS", "RULE_NOT", "RULE_INT", "RULE_LT", "RULE_LEQ", "RULE_EQUAL", "RULE_GT", "RULE_GEQ", "RULE_NOT_EQUAL", "RULE_DOT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'preamble'", "'aioc'", "'rule'", "'on'", "'do'", "'N.'", "'E.'", "'starter:'", "'include'", "'from'", "'with'", "'location'", "'skip'", "'getInput'", "'show'", "'if'", "'else'", "'while'", "'scope'", "'prop'", "'roles'"
    };
    public static final int T__50=50;
    public static final int RULE_GT=28;
    public static final int RULE_LEQ=26;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int RULE_LCURLY=4;
    public static final int RULE_ARROW=19;
    public static final int RULE_NOT_EQUAL=30;
    public static final int T__51=51;
    public static final int RULE_OR=9;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=10;
    public static final int RULE_EQUAL=27;
    public static final int RULE_COMMA=14;
    public static final int RULE_COLON=16;
    public static final int RULE_ASSIGN=20;
    public static final int RULE_LT=25;
    public static final int RULE_PIPE=17;
    public static final int RULE_INT=24;
    public static final int RULE_ML_COMMENT=32;
    public static final int RULE_LRND=6;
    public static final int RULE_FALSE=12;
    public static final int RULE_SEMICOLON=18;
    public static final int RULE_STRING=13;
    public static final int RULE_GEQ=29;
    public static final int RULE_NOT=23;
    public static final int RULE_AT=15;
    public static final int RULE_AND=8;
    public static final int RULE_SL_COMMENT=33;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_TRUE=11;
    public static final int RULE_PLUS=21;
    public static final int T__36=36;
    public static final int RULE_DOT=31;
    public static final int EOF=-1;
    public static final int RULE_RCURLY=5;
    public static final int RULE_WS=34;
    public static final int RULE_ANY_OTHER=35;
    public static final int RULE_MINUS=22;
    public static final int RULE_RRND=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAiocParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAiocParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAiocParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAioc.g"; }



     	private AiocGrammarAccess grammarAccess;
     	
        public InternalAiocParser(TokenStream input, AiocGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AiocJ";	
       	}
       	
       	@Override
       	protected AiocGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAiocJ"
    // InternalAioc.g:67:1: entryRuleAiocJ returns [EObject current=null] : iv_ruleAiocJ= ruleAiocJ EOF ;
    public final EObject entryRuleAiocJ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAiocJ = null;


        try {
            // InternalAioc.g:68:2: (iv_ruleAiocJ= ruleAiocJ EOF )
            // InternalAioc.g:69:2: iv_ruleAiocJ= ruleAiocJ EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAiocJRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAiocJ=ruleAiocJ();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAiocJ; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAiocJ"


    // $ANTLR start "ruleAiocJ"
    // InternalAioc.g:76:1: ruleAiocJ returns [EObject current=null] : ( ( (lv_aioc_0_0= ruleAioc ) ) | ( (lv_ruleSet_1_0= ruleRule ) )* ) ;
    public final EObject ruleAiocJ() throws RecognitionException {
        EObject current = null;

        EObject lv_aioc_0_0 = null;

        EObject lv_ruleSet_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:79:28: ( ( ( (lv_aioc_0_0= ruleAioc ) ) | ( (lv_ruleSet_1_0= ruleRule ) )* ) )
            // InternalAioc.g:80:1: ( ( (lv_aioc_0_0= ruleAioc ) ) | ( (lv_ruleSet_1_0= ruleRule ) )* )
            {
            // InternalAioc.g:80:1: ( ( (lv_aioc_0_0= ruleAioc ) ) | ( (lv_ruleSet_1_0= ruleRule ) )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==36||LA2_0==44) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF||LA2_0==38) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAioc.g:80:2: ( (lv_aioc_0_0= ruleAioc ) )
                    {
                    // InternalAioc.g:80:2: ( (lv_aioc_0_0= ruleAioc ) )
                    // InternalAioc.g:81:1: (lv_aioc_0_0= ruleAioc )
                    {
                    // InternalAioc.g:81:1: (lv_aioc_0_0= ruleAioc )
                    // InternalAioc.g:82:3: lv_aioc_0_0= ruleAioc
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAiocJAccess().getAiocAiocParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aioc_0_0=ruleAioc();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAiocJRule());
                      	        }
                             		set(
                             			current, 
                             			"aioc",
                              		lv_aioc_0_0, 
                              		"org.Aioc.Aioc");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAioc.g:99:6: ( (lv_ruleSet_1_0= ruleRule ) )*
                    {
                    // InternalAioc.g:99:6: ( (lv_ruleSet_1_0= ruleRule ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==38) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalAioc.g:100:1: (lv_ruleSet_1_0= ruleRule )
                    	    {
                    	    // InternalAioc.g:100:1: (lv_ruleSet_1_0= ruleRule )
                    	    // InternalAioc.g:101:3: lv_ruleSet_1_0= ruleRule
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAiocJAccess().getRuleSetRuleParserRuleCall_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_3);
                    	    lv_ruleSet_1_0=ruleRule();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAiocJRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ruleSet",
                    	              		lv_ruleSet_1_0, 
                    	              		"org.Aioc.Rule");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAiocJ"


    // $ANTLR start "entryRuleAioc"
    // InternalAioc.g:125:1: entryRuleAioc returns [EObject current=null] : iv_ruleAioc= ruleAioc EOF ;
    public final EObject entryRuleAioc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAioc = null;


        try {
            // InternalAioc.g:126:2: (iv_ruleAioc= ruleAioc EOF )
            // InternalAioc.g:127:2: iv_ruleAioc= ruleAioc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAiocRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAioc=ruleAioc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAioc; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAioc"


    // $ANTLR start "ruleAioc"
    // InternalAioc.g:134:1: ruleAioc returns [EObject current=null] : ( ( (lv_functionLocation_0_0= ruleFunctionLocation ) )* otherlv_1= 'preamble' this_LCURLY_2= RULE_LCURLY ( (lv_preamble_3_0= rulePreamble ) ) this_RCURLY_4= RULE_RCURLY otherlv_5= 'aioc' this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY ) ;
    public final EObject ruleAioc() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_LCURLY_2=null;
        Token this_RCURLY_4=null;
        Token otherlv_5=null;
        Token this_LCURLY_6=null;
        Token this_RCURLY_8=null;
        EObject lv_functionLocation_0_0 = null;

        EObject lv_preamble_3_0 = null;

        EObject lv_choreography_7_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:137:28: ( ( ( (lv_functionLocation_0_0= ruleFunctionLocation ) )* otherlv_1= 'preamble' this_LCURLY_2= RULE_LCURLY ( (lv_preamble_3_0= rulePreamble ) ) this_RCURLY_4= RULE_RCURLY otherlv_5= 'aioc' this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY ) )
            // InternalAioc.g:138:1: ( ( (lv_functionLocation_0_0= ruleFunctionLocation ) )* otherlv_1= 'preamble' this_LCURLY_2= RULE_LCURLY ( (lv_preamble_3_0= rulePreamble ) ) this_RCURLY_4= RULE_RCURLY otherlv_5= 'aioc' this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY )
            {
            // InternalAioc.g:138:1: ( ( (lv_functionLocation_0_0= ruleFunctionLocation ) )* otherlv_1= 'preamble' this_LCURLY_2= RULE_LCURLY ( (lv_preamble_3_0= rulePreamble ) ) this_RCURLY_4= RULE_RCURLY otherlv_5= 'aioc' this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY )
            // InternalAioc.g:138:2: ( (lv_functionLocation_0_0= ruleFunctionLocation ) )* otherlv_1= 'preamble' this_LCURLY_2= RULE_LCURLY ( (lv_preamble_3_0= rulePreamble ) ) this_RCURLY_4= RULE_RCURLY otherlv_5= 'aioc' this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY
            {
            // InternalAioc.g:138:2: ( (lv_functionLocation_0_0= ruleFunctionLocation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==44) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAioc.g:139:1: (lv_functionLocation_0_0= ruleFunctionLocation )
            	    {
            	    // InternalAioc.g:139:1: (lv_functionLocation_0_0= ruleFunctionLocation )
            	    // InternalAioc.g:140:3: lv_functionLocation_0_0= ruleFunctionLocation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAiocAccess().getFunctionLocationFunctionLocationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_functionLocation_0_0=ruleFunctionLocation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAiocRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"functionLocation",
            	              		lv_functionLocation_0_0, 
            	              		"org.Aioc.FunctionLocation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_1=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAiocAccess().getPreambleKeyword_1());
                  
            }
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCURLY_2, grammarAccess.getAiocAccess().getLCURLYTerminalRuleCall_2()); 
                  
            }
            // InternalAioc.g:164:1: ( (lv_preamble_3_0= rulePreamble ) )
            // InternalAioc.g:165:1: (lv_preamble_3_0= rulePreamble )
            {
            // InternalAioc.g:165:1: (lv_preamble_3_0= rulePreamble )
            // InternalAioc.g:166:3: lv_preamble_3_0= rulePreamble
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAiocAccess().getPreamblePreambleParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_preamble_3_0=rulePreamble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAiocRule());
              	        }
                     		set(
                     			current, 
                     			"preamble",
                      		lv_preamble_3_0, 
                      		"org.Aioc.Preamble");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RCURLY_4=(Token)match(input,RULE_RCURLY,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCURLY_4, grammarAccess.getAiocAccess().getRCURLYTerminalRuleCall_4()); 
                  
            }
            otherlv_5=(Token)match(input,37,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAiocAccess().getAiocKeyword_5());
                  
            }
            this_LCURLY_6=(Token)match(input,RULE_LCURLY,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCURLY_6, grammarAccess.getAiocAccess().getLCURLYTerminalRuleCall_6()); 
                  
            }
            // InternalAioc.g:194:1: ( (lv_choreography_7_0= ruleChoreography ) )
            // InternalAioc.g:195:1: (lv_choreography_7_0= ruleChoreography )
            {
            // InternalAioc.g:195:1: (lv_choreography_7_0= ruleChoreography )
            // InternalAioc.g:196:3: lv_choreography_7_0= ruleChoreography
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAiocAccess().getChoreographyChoreographyParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_choreography_7_0=ruleChoreography();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAiocRule());
              	        }
                     		set(
                     			current, 
                     			"choreography",
                      		lv_choreography_7_0, 
                      		"org.Aioc.Choreography");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RCURLY_8=(Token)match(input,RULE_RCURLY,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCURLY_8, grammarAccess.getAiocAccess().getRCURLYTerminalRuleCall_8()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAioc"


    // $ANTLR start "entryRuleRule"
    // InternalAioc.g:224:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalAioc.g:225:2: (iv_ruleRule= ruleRule EOF )
            // InternalAioc.g:226:2: iv_ruleRule= ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalAioc.g:233:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' this_LCURLY_1= RULE_LCURLY ( (lv_functionLocation_2_0= ruleFunctionLocation ) )* otherlv_3= 'on' this_LCURLY_4= RULE_LCURLY ( (lv_where_5_0= ruleWhere ) ) this_RCURLY_6= RULE_RCURLY otherlv_7= 'do' this_LCURLY_8= RULE_LCURLY ( (lv_choreography_9_0= ruleChoreography ) ) this_RCURLY_10= RULE_RCURLY this_RCURLY_11= RULE_RCURLY ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_3=null;
        Token this_LCURLY_4=null;
        Token this_RCURLY_6=null;
        Token otherlv_7=null;
        Token this_LCURLY_8=null;
        Token this_RCURLY_10=null;
        Token this_RCURLY_11=null;
        EObject lv_functionLocation_2_0 = null;

        EObject lv_where_5_0 = null;

        EObject lv_choreography_9_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:236:28: ( (otherlv_0= 'rule' this_LCURLY_1= RULE_LCURLY ( (lv_functionLocation_2_0= ruleFunctionLocation ) )* otherlv_3= 'on' this_LCURLY_4= RULE_LCURLY ( (lv_where_5_0= ruleWhere ) ) this_RCURLY_6= RULE_RCURLY otherlv_7= 'do' this_LCURLY_8= RULE_LCURLY ( (lv_choreography_9_0= ruleChoreography ) ) this_RCURLY_10= RULE_RCURLY this_RCURLY_11= RULE_RCURLY ) )
            // InternalAioc.g:237:1: (otherlv_0= 'rule' this_LCURLY_1= RULE_LCURLY ( (lv_functionLocation_2_0= ruleFunctionLocation ) )* otherlv_3= 'on' this_LCURLY_4= RULE_LCURLY ( (lv_where_5_0= ruleWhere ) ) this_RCURLY_6= RULE_RCURLY otherlv_7= 'do' this_LCURLY_8= RULE_LCURLY ( (lv_choreography_9_0= ruleChoreography ) ) this_RCURLY_10= RULE_RCURLY this_RCURLY_11= RULE_RCURLY )
            {
            // InternalAioc.g:237:1: (otherlv_0= 'rule' this_LCURLY_1= RULE_LCURLY ( (lv_functionLocation_2_0= ruleFunctionLocation ) )* otherlv_3= 'on' this_LCURLY_4= RULE_LCURLY ( (lv_where_5_0= ruleWhere ) ) this_RCURLY_6= RULE_RCURLY otherlv_7= 'do' this_LCURLY_8= RULE_LCURLY ( (lv_choreography_9_0= ruleChoreography ) ) this_RCURLY_10= RULE_RCURLY this_RCURLY_11= RULE_RCURLY )
            // InternalAioc.g:237:3: otherlv_0= 'rule' this_LCURLY_1= RULE_LCURLY ( (lv_functionLocation_2_0= ruleFunctionLocation ) )* otherlv_3= 'on' this_LCURLY_4= RULE_LCURLY ( (lv_where_5_0= ruleWhere ) ) this_RCURLY_6= RULE_RCURLY otherlv_7= 'do' this_LCURLY_8= RULE_LCURLY ( (lv_choreography_9_0= ruleChoreography ) ) this_RCURLY_10= RULE_RCURLY this_RCURLY_11= RULE_RCURLY
            {
            otherlv_0=(Token)match(input,38,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
                  
            }
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCURLY_1, grammarAccess.getRuleAccess().getLCURLYTerminalRuleCall_1()); 
                  
            }
            // InternalAioc.g:245:1: ( (lv_functionLocation_2_0= ruleFunctionLocation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==44) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAioc.g:246:1: (lv_functionLocation_2_0= ruleFunctionLocation )
            	    {
            	    // InternalAioc.g:246:1: (lv_functionLocation_2_0= ruleFunctionLocation )
            	    // InternalAioc.g:247:3: lv_functionLocation_2_0= ruleFunctionLocation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRuleAccess().getFunctionLocationFunctionLocationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_functionLocation_2_0=ruleFunctionLocation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"functionLocation",
            	              		lv_functionLocation_2_0, 
            	              		"org.Aioc.FunctionLocation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getOnKeyword_3());
                  
            }
            this_LCURLY_4=(Token)match(input,RULE_LCURLY,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCURLY_4, grammarAccess.getRuleAccess().getLCURLYTerminalRuleCall_4()); 
                  
            }
            // InternalAioc.g:271:1: ( (lv_where_5_0= ruleWhere ) )
            // InternalAioc.g:272:1: (lv_where_5_0= ruleWhere )
            {
            // InternalAioc.g:272:1: (lv_where_5_0= ruleWhere )
            // InternalAioc.g:273:3: lv_where_5_0= ruleWhere
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRuleAccess().getWhereWhereParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_where_5_0=ruleWhere();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRuleRule());
              	        }
                     		set(
                     			current, 
                     			"where",
                      		lv_where_5_0, 
                      		"org.Aioc.Where");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RCURLY_6=(Token)match(input,RULE_RCURLY,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCURLY_6, grammarAccess.getRuleAccess().getRCURLYTerminalRuleCall_6()); 
                  
            }
            otherlv_7=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getDoKeyword_7());
                  
            }
            this_LCURLY_8=(Token)match(input,RULE_LCURLY,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCURLY_8, grammarAccess.getRuleAccess().getLCURLYTerminalRuleCall_8()); 
                  
            }
            // InternalAioc.g:301:1: ( (lv_choreography_9_0= ruleChoreography ) )
            // InternalAioc.g:302:1: (lv_choreography_9_0= ruleChoreography )
            {
            // InternalAioc.g:302:1: (lv_choreography_9_0= ruleChoreography )
            // InternalAioc.g:303:3: lv_choreography_9_0= ruleChoreography
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRuleAccess().getChoreographyChoreographyParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_choreography_9_0=ruleChoreography();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRuleRule());
              	        }
                     		set(
                     			current, 
                     			"choreography",
                      		lv_choreography_9_0, 
                      		"org.Aioc.Choreography");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RCURLY_10=(Token)match(input,RULE_RCURLY,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCURLY_10, grammarAccess.getRuleAccess().getRCURLYTerminalRuleCall_10()); 
                  
            }
            this_RCURLY_11=(Token)match(input,RULE_RCURLY,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCURLY_11, grammarAccess.getRuleAccess().getRCURLYTerminalRuleCall_11()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleWhere"
    // InternalAioc.g:335:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // InternalAioc.g:336:2: (iv_ruleWhere= ruleWhere EOF )
            // InternalAioc.g:337:2: iv_ruleWhere= ruleWhere EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhere=ruleWhere();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhere; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhere"


    // $ANTLR start "ruleWhere"
    // InternalAioc.g:344:1: ruleWhere returns [EObject current=null] : ( ( (lv_whereCondition_0_0= ruleWhereCompareCondition ) ) | ( ( ( ( RULE_LRND ) )=> (lv_paren_1_0= RULE_LRND ) ) ( (lv_whereCondition_2_0= ruleWhereCompareCondition ) ) this_RRND_3= RULE_RRND ) ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token lv_paren_1_0=null;
        Token this_RRND_3=null;
        EObject lv_whereCondition_0_0 = null;

        EObject lv_whereCondition_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:347:28: ( ( ( (lv_whereCondition_0_0= ruleWhereCompareCondition ) ) | ( ( ( ( RULE_LRND ) )=> (lv_paren_1_0= RULE_LRND ) ) ( (lv_whereCondition_2_0= ruleWhereCompareCondition ) ) this_RRND_3= RULE_RRND ) ) )
            // InternalAioc.g:348:1: ( ( (lv_whereCondition_0_0= ruleWhereCompareCondition ) ) | ( ( ( ( RULE_LRND ) )=> (lv_paren_1_0= RULE_LRND ) ) ( (lv_whereCondition_2_0= ruleWhereCompareCondition ) ) this_RRND_3= RULE_RRND ) )
            {
            // InternalAioc.g:348:1: ( ( (lv_whereCondition_0_0= ruleWhereCompareCondition ) ) | ( ( ( ( RULE_LRND ) )=> (lv_paren_1_0= RULE_LRND ) ) ( (lv_whereCondition_2_0= ruleWhereCompareCondition ) ) this_RRND_3= RULE_RRND ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_FALSE)||(LA5_0>=41 && LA5_0<=42)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_LRND) && (synpred1_InternalAioc())) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAioc.g:348:2: ( (lv_whereCondition_0_0= ruleWhereCompareCondition ) )
                    {
                    // InternalAioc.g:348:2: ( (lv_whereCondition_0_0= ruleWhereCompareCondition ) )
                    // InternalAioc.g:349:1: (lv_whereCondition_0_0= ruleWhereCompareCondition )
                    {
                    // InternalAioc.g:349:1: (lv_whereCondition_0_0= ruleWhereCompareCondition )
                    // InternalAioc.g:350:3: lv_whereCondition_0_0= ruleWhereCompareCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWhereAccess().getWhereConditionWhereCompareConditionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_whereCondition_0_0=ruleWhereCompareCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWhereRule());
                      	        }
                             		set(
                             			current, 
                             			"whereCondition",
                              		lv_whereCondition_0_0, 
                              		"org.Aioc.WhereCompareCondition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAioc.g:367:6: ( ( ( ( RULE_LRND ) )=> (lv_paren_1_0= RULE_LRND ) ) ( (lv_whereCondition_2_0= ruleWhereCompareCondition ) ) this_RRND_3= RULE_RRND )
                    {
                    // InternalAioc.g:367:6: ( ( ( ( RULE_LRND ) )=> (lv_paren_1_0= RULE_LRND ) ) ( (lv_whereCondition_2_0= ruleWhereCompareCondition ) ) this_RRND_3= RULE_RRND )
                    // InternalAioc.g:367:7: ( ( ( RULE_LRND ) )=> (lv_paren_1_0= RULE_LRND ) ) ( (lv_whereCondition_2_0= ruleWhereCompareCondition ) ) this_RRND_3= RULE_RRND
                    {
                    // InternalAioc.g:367:7: ( ( ( RULE_LRND ) )=> (lv_paren_1_0= RULE_LRND ) )
                    // InternalAioc.g:367:8: ( ( RULE_LRND ) )=> (lv_paren_1_0= RULE_LRND )
                    {
                    // InternalAioc.g:373:1: (lv_paren_1_0= RULE_LRND )
                    // InternalAioc.g:374:3: lv_paren_1_0= RULE_LRND
                    {
                    lv_paren_1_0=(Token)match(input,RULE_LRND,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_paren_1_0, grammarAccess.getWhereAccess().getParenLRNDTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getWhereRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"paren",
                              		true, 
                              		"org.Aioc.LRND");
                      	    
                    }

                    }


                    }

                    // InternalAioc.g:390:2: ( (lv_whereCondition_2_0= ruleWhereCompareCondition ) )
                    // InternalAioc.g:391:1: (lv_whereCondition_2_0= ruleWhereCompareCondition )
                    {
                    // InternalAioc.g:391:1: (lv_whereCondition_2_0= ruleWhereCompareCondition )
                    // InternalAioc.g:392:3: lv_whereCondition_2_0= ruleWhereCompareCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWhereAccess().getWhereConditionWhereCompareConditionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_14);
                    lv_whereCondition_2_0=ruleWhereCompareCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWhereRule());
                      	        }
                             		set(
                             			current, 
                             			"whereCondition",
                              		lv_whereCondition_2_0, 
                              		"org.Aioc.WhereCompareCondition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RRND_3=(Token)match(input,RULE_RRND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RRND_3, grammarAccess.getWhereAccess().getRRNDTerminalRuleCall_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhere"


    // $ANTLR start "entryRuleWhereCompareCondition"
    // InternalAioc.g:420:1: entryRuleWhereCompareCondition returns [EObject current=null] : iv_ruleWhereCompareCondition= ruleWhereCompareCondition EOF ;
    public final EObject entryRuleWhereCompareCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereCompareCondition = null;


        try {
            // InternalAioc.g:421:2: (iv_ruleWhereCompareCondition= ruleWhereCompareCondition EOF )
            // InternalAioc.g:422:2: iv_ruleWhereCompareCondition= ruleWhereCompareCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereCompareConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhereCompareCondition=ruleWhereCompareCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereCompareCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhereCompareCondition"


    // $ANTLR start "ruleWhereCompareCondition"
    // InternalAioc.g:429:1: ruleWhereCompareCondition returns [EObject current=null] : ( ( (lv_left_0_0= ruleWhereExpressionBasicTerm ) ) ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleExpression ) ) ( ( ( (lv_and_3_0= RULE_AND ) ) | ( (lv_or_4_0= RULE_OR ) ) ) ( (lv_next_5_0= ruleWhere ) ) )? ) ;
    public final EObject ruleWhereCompareCondition() throws RecognitionException {
        EObject current = null;

        Token lv_and_3_0=null;
        Token lv_or_4_0=null;
        EObject lv_left_0_0 = null;

        EObject lv_operator_1_0 = null;

        EObject lv_right_2_0 = null;

        EObject lv_next_5_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:432:28: ( ( ( (lv_left_0_0= ruleWhereExpressionBasicTerm ) ) ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleExpression ) ) ( ( ( (lv_and_3_0= RULE_AND ) ) | ( (lv_or_4_0= RULE_OR ) ) ) ( (lv_next_5_0= ruleWhere ) ) )? ) )
            // InternalAioc.g:433:1: ( ( (lv_left_0_0= ruleWhereExpressionBasicTerm ) ) ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleExpression ) ) ( ( ( (lv_and_3_0= RULE_AND ) ) | ( (lv_or_4_0= RULE_OR ) ) ) ( (lv_next_5_0= ruleWhere ) ) )? )
            {
            // InternalAioc.g:433:1: ( ( (lv_left_0_0= ruleWhereExpressionBasicTerm ) ) ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleExpression ) ) ( ( ( (lv_and_3_0= RULE_AND ) ) | ( (lv_or_4_0= RULE_OR ) ) ) ( (lv_next_5_0= ruleWhere ) ) )? )
            // InternalAioc.g:433:2: ( (lv_left_0_0= ruleWhereExpressionBasicTerm ) ) ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleExpression ) ) ( ( ( (lv_and_3_0= RULE_AND ) ) | ( (lv_or_4_0= RULE_OR ) ) ) ( (lv_next_5_0= ruleWhere ) ) )?
            {
            // InternalAioc.g:433:2: ( (lv_left_0_0= ruleWhereExpressionBasicTerm ) )
            // InternalAioc.g:434:1: (lv_left_0_0= ruleWhereExpressionBasicTerm )
            {
            // InternalAioc.g:434:1: (lv_left_0_0= ruleWhereExpressionBasicTerm )
            // InternalAioc.g:435:3: lv_left_0_0= ruleWhereExpressionBasicTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereCompareConditionAccess().getLeftWhereExpressionBasicTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_15);
            lv_left_0_0=ruleWhereExpressionBasicTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhereCompareConditionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"org.Aioc.WhereExpressionBasicTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAioc.g:451:2: ( (lv_operator_1_0= ruleConditionOperator ) )
            // InternalAioc.g:452:1: (lv_operator_1_0= ruleConditionOperator )
            {
            // InternalAioc.g:452:1: (lv_operator_1_0= ruleConditionOperator )
            // InternalAioc.g:453:3: lv_operator_1_0= ruleConditionOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereCompareConditionAccess().getOperatorConditionOperatorParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_16);
            lv_operator_1_0=ruleConditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhereCompareConditionRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_1_0, 
                      		"org.Aioc.ConditionOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAioc.g:469:2: ( (lv_right_2_0= ruleExpression ) )
            // InternalAioc.g:470:1: (lv_right_2_0= ruleExpression )
            {
            // InternalAioc.g:470:1: (lv_right_2_0= ruleExpression )
            // InternalAioc.g:471:3: lv_right_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereCompareConditionAccess().getRightExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_17);
            lv_right_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhereCompareConditionRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_2_0, 
                      		"org.Aioc.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAioc.g:487:2: ( ( ( (lv_and_3_0= RULE_AND ) ) | ( (lv_or_4_0= RULE_OR ) ) ) ( (lv_next_5_0= ruleWhere ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_AND && LA7_0<=RULE_OR)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAioc.g:487:3: ( ( (lv_and_3_0= RULE_AND ) ) | ( (lv_or_4_0= RULE_OR ) ) ) ( (lv_next_5_0= ruleWhere ) )
                    {
                    // InternalAioc.g:487:3: ( ( (lv_and_3_0= RULE_AND ) ) | ( (lv_or_4_0= RULE_OR ) ) )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_AND) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==RULE_OR) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalAioc.g:487:4: ( (lv_and_3_0= RULE_AND ) )
                            {
                            // InternalAioc.g:487:4: ( (lv_and_3_0= RULE_AND ) )
                            // InternalAioc.g:488:1: (lv_and_3_0= RULE_AND )
                            {
                            // InternalAioc.g:488:1: (lv_and_3_0= RULE_AND )
                            // InternalAioc.g:489:3: lv_and_3_0= RULE_AND
                            {
                            lv_and_3_0=(Token)match(input,RULE_AND,FOLLOW_11); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_and_3_0, grammarAccess.getWhereCompareConditionAccess().getAndANDTerminalRuleCall_3_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getWhereCompareConditionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"and",
                                      		true, 
                                      		"org.Aioc.AND");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAioc.g:506:6: ( (lv_or_4_0= RULE_OR ) )
                            {
                            // InternalAioc.g:506:6: ( (lv_or_4_0= RULE_OR ) )
                            // InternalAioc.g:507:1: (lv_or_4_0= RULE_OR )
                            {
                            // InternalAioc.g:507:1: (lv_or_4_0= RULE_OR )
                            // InternalAioc.g:508:3: lv_or_4_0= RULE_OR
                            {
                            lv_or_4_0=(Token)match(input,RULE_OR,FOLLOW_11); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_or_4_0, grammarAccess.getWhereCompareConditionAccess().getOrORTerminalRuleCall_3_0_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getWhereCompareConditionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"or",
                                      		true, 
                                      		"org.Aioc.OR");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalAioc.g:524:3: ( (lv_next_5_0= ruleWhere ) )
                    // InternalAioc.g:525:1: (lv_next_5_0= ruleWhere )
                    {
                    // InternalAioc.g:525:1: (lv_next_5_0= ruleWhere )
                    // InternalAioc.g:526:3: lv_next_5_0= ruleWhere
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWhereCompareConditionAccess().getNextWhereParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_next_5_0=ruleWhere();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWhereCompareConditionRule());
                      	        }
                             		set(
                             			current, 
                             			"next",
                              		lv_next_5_0, 
                              		"org.Aioc.Where");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhereCompareCondition"


    // $ANTLR start "entryRuleWhereExpressionBasicTerm"
    // InternalAioc.g:550:1: entryRuleWhereExpressionBasicTerm returns [EObject current=null] : iv_ruleWhereExpressionBasicTerm= ruleWhereExpressionBasicTerm EOF ;
    public final EObject entryRuleWhereExpressionBasicTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereExpressionBasicTerm = null;


        try {
            // InternalAioc.g:551:2: (iv_ruleWhereExpressionBasicTerm= ruleWhereExpressionBasicTerm EOF )
            // InternalAioc.g:552:2: iv_ruleWhereExpressionBasicTerm= ruleWhereExpressionBasicTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereExpressionBasicTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhereExpressionBasicTerm=ruleWhereExpressionBasicTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereExpressionBasicTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhereExpressionBasicTerm"


    // $ANTLR start "ruleWhereExpressionBasicTerm"
    // InternalAioc.g:559:1: ruleWhereExpressionBasicTerm returns [EObject current=null] : ( (otherlv_0= 'N.' ( (lv_nVariable_1_0= RULE_ID ) ) ) | (otherlv_2= 'E.' ( (lv_eVariable_3_0= RULE_ID ) ) ) | ( (lv_sVariable_4_0= RULE_ID ) ) | ( (lv_true_5_0= RULE_TRUE ) ) | ( (lv_false_6_0= RULE_FALSE ) ) ) ;
    public final EObject ruleWhereExpressionBasicTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nVariable_1_0=null;
        Token otherlv_2=null;
        Token lv_eVariable_3_0=null;
        Token lv_sVariable_4_0=null;
        Token lv_true_5_0=null;
        Token lv_false_6_0=null;

         enterRule(); 
            
        try {
            // InternalAioc.g:562:28: ( ( (otherlv_0= 'N.' ( (lv_nVariable_1_0= RULE_ID ) ) ) | (otherlv_2= 'E.' ( (lv_eVariable_3_0= RULE_ID ) ) ) | ( (lv_sVariable_4_0= RULE_ID ) ) | ( (lv_true_5_0= RULE_TRUE ) ) | ( (lv_false_6_0= RULE_FALSE ) ) ) )
            // InternalAioc.g:563:1: ( (otherlv_0= 'N.' ( (lv_nVariable_1_0= RULE_ID ) ) ) | (otherlv_2= 'E.' ( (lv_eVariable_3_0= RULE_ID ) ) ) | ( (lv_sVariable_4_0= RULE_ID ) ) | ( (lv_true_5_0= RULE_TRUE ) ) | ( (lv_false_6_0= RULE_FALSE ) ) )
            {
            // InternalAioc.g:563:1: ( (otherlv_0= 'N.' ( (lv_nVariable_1_0= RULE_ID ) ) ) | (otherlv_2= 'E.' ( (lv_eVariable_3_0= RULE_ID ) ) ) | ( (lv_sVariable_4_0= RULE_ID ) ) | ( (lv_true_5_0= RULE_TRUE ) ) | ( (lv_false_6_0= RULE_FALSE ) ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt8=1;
                }
                break;
            case 42:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                alt8=3;
                }
                break;
            case RULE_TRUE:
                {
                alt8=4;
                }
                break;
            case RULE_FALSE:
                {
                alt8=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalAioc.g:563:2: (otherlv_0= 'N.' ( (lv_nVariable_1_0= RULE_ID ) ) )
                    {
                    // InternalAioc.g:563:2: (otherlv_0= 'N.' ( (lv_nVariable_1_0= RULE_ID ) ) )
                    // InternalAioc.g:563:4: otherlv_0= 'N.' ( (lv_nVariable_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getWhereExpressionBasicTermAccess().getNKeyword_0_0());
                          
                    }
                    // InternalAioc.g:567:1: ( (lv_nVariable_1_0= RULE_ID ) )
                    // InternalAioc.g:568:1: (lv_nVariable_1_0= RULE_ID )
                    {
                    // InternalAioc.g:568:1: (lv_nVariable_1_0= RULE_ID )
                    // InternalAioc.g:569:3: lv_nVariable_1_0= RULE_ID
                    {
                    lv_nVariable_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_nVariable_1_0, grammarAccess.getWhereExpressionBasicTermAccess().getNVariableIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getWhereExpressionBasicTermRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"nVariable",
                              		lv_nVariable_1_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAioc.g:586:6: (otherlv_2= 'E.' ( (lv_eVariable_3_0= RULE_ID ) ) )
                    {
                    // InternalAioc.g:586:6: (otherlv_2= 'E.' ( (lv_eVariable_3_0= RULE_ID ) ) )
                    // InternalAioc.g:586:8: otherlv_2= 'E.' ( (lv_eVariable_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getWhereExpressionBasicTermAccess().getEKeyword_1_0());
                          
                    }
                    // InternalAioc.g:590:1: ( (lv_eVariable_3_0= RULE_ID ) )
                    // InternalAioc.g:591:1: (lv_eVariable_3_0= RULE_ID )
                    {
                    // InternalAioc.g:591:1: (lv_eVariable_3_0= RULE_ID )
                    // InternalAioc.g:592:3: lv_eVariable_3_0= RULE_ID
                    {
                    lv_eVariable_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_eVariable_3_0, grammarAccess.getWhereExpressionBasicTermAccess().getEVariableIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getWhereExpressionBasicTermRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"eVariable",
                              		lv_eVariable_3_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAioc.g:609:6: ( (lv_sVariable_4_0= RULE_ID ) )
                    {
                    // InternalAioc.g:609:6: ( (lv_sVariable_4_0= RULE_ID ) )
                    // InternalAioc.g:610:1: (lv_sVariable_4_0= RULE_ID )
                    {
                    // InternalAioc.g:610:1: (lv_sVariable_4_0= RULE_ID )
                    // InternalAioc.g:611:3: lv_sVariable_4_0= RULE_ID
                    {
                    lv_sVariable_4_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sVariable_4_0, grammarAccess.getWhereExpressionBasicTermAccess().getSVariableIDTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getWhereExpressionBasicTermRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sVariable",
                              		lv_sVariable_4_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAioc.g:628:6: ( (lv_true_5_0= RULE_TRUE ) )
                    {
                    // InternalAioc.g:628:6: ( (lv_true_5_0= RULE_TRUE ) )
                    // InternalAioc.g:629:1: (lv_true_5_0= RULE_TRUE )
                    {
                    // InternalAioc.g:629:1: (lv_true_5_0= RULE_TRUE )
                    // InternalAioc.g:630:3: lv_true_5_0= RULE_TRUE
                    {
                    lv_true_5_0=(Token)match(input,RULE_TRUE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_true_5_0, grammarAccess.getWhereExpressionBasicTermAccess().getTrueTRUETerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getWhereExpressionBasicTermRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"true",
                              		true, 
                              		"org.Aioc.TRUE");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAioc.g:647:6: ( (lv_false_6_0= RULE_FALSE ) )
                    {
                    // InternalAioc.g:647:6: ( (lv_false_6_0= RULE_FALSE ) )
                    // InternalAioc.g:648:1: (lv_false_6_0= RULE_FALSE )
                    {
                    // InternalAioc.g:648:1: (lv_false_6_0= RULE_FALSE )
                    // InternalAioc.g:649:3: lv_false_6_0= RULE_FALSE
                    {
                    lv_false_6_0=(Token)match(input,RULE_FALSE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_false_6_0, grammarAccess.getWhereExpressionBasicTermAccess().getFalseFALSETerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getWhereExpressionBasicTermRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"false",
                              		true, 
                              		"org.Aioc.FALSE");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhereExpressionBasicTerm"


    // $ANTLR start "entryRulePreamble"
    // InternalAioc.g:673:1: entryRulePreamble returns [EObject current=null] : iv_rulePreamble= rulePreamble EOF ;
    public final EObject entryRulePreamble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreamble = null;


        try {
            // InternalAioc.g:674:2: (iv_rulePreamble= rulePreamble EOF )
            // InternalAioc.g:675:2: iv_rulePreamble= rulePreamble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreambleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePreamble=rulePreamble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreamble; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreamble"


    // $ANTLR start "rulePreamble"
    // InternalAioc.g:682:1: rulePreamble returns [EObject current=null] : (otherlv_0= 'starter:' ( (lv_starter_1_0= RULE_ID ) ) ( (lv_locDefinition_2_0= ruleLocationDefinition ) )? ) ;
    public final EObject rulePreamble() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_starter_1_0=null;
        EObject lv_locDefinition_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:685:28: ( (otherlv_0= 'starter:' ( (lv_starter_1_0= RULE_ID ) ) ( (lv_locDefinition_2_0= ruleLocationDefinition ) )? ) )
            // InternalAioc.g:686:1: (otherlv_0= 'starter:' ( (lv_starter_1_0= RULE_ID ) ) ( (lv_locDefinition_2_0= ruleLocationDefinition ) )? )
            {
            // InternalAioc.g:686:1: (otherlv_0= 'starter:' ( (lv_starter_1_0= RULE_ID ) ) ( (lv_locDefinition_2_0= ruleLocationDefinition ) )? )
            // InternalAioc.g:686:3: otherlv_0= 'starter:' ( (lv_starter_1_0= RULE_ID ) ) ( (lv_locDefinition_2_0= ruleLocationDefinition ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPreambleAccess().getStarterKeyword_0());
                  
            }
            // InternalAioc.g:690:1: ( (lv_starter_1_0= RULE_ID ) )
            // InternalAioc.g:691:1: (lv_starter_1_0= RULE_ID )
            {
            // InternalAioc.g:691:1: (lv_starter_1_0= RULE_ID )
            // InternalAioc.g:692:3: lv_starter_1_0= RULE_ID
            {
            lv_starter_1_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_starter_1_0, grammarAccess.getPreambleAccess().getStarterIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPreambleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"starter",
                      		lv_starter_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalAioc.g:708:2: ( (lv_locDefinition_2_0= ruleLocationDefinition ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==47) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAioc.g:709:1: (lv_locDefinition_2_0= ruleLocationDefinition )
                    {
                    // InternalAioc.g:709:1: (lv_locDefinition_2_0= ruleLocationDefinition )
                    // InternalAioc.g:710:3: lv_locDefinition_2_0= ruleLocationDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPreambleAccess().getLocDefinitionLocationDefinitionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_locDefinition_2_0=ruleLocationDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPreambleRule());
                      	        }
                             		set(
                             			current, 
                             			"locDefinition",
                              		lv_locDefinition_2_0, 
                              		"org.Aioc.LocationDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreamble"


    // $ANTLR start "entryRuleFunctionLocation"
    // InternalAioc.g:734:1: entryRuleFunctionLocation returns [EObject current=null] : iv_ruleFunctionLocation= ruleFunctionLocation EOF ;
    public final EObject entryRuleFunctionLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionLocation = null;


        try {
            // InternalAioc.g:735:2: (iv_ruleFunctionLocation= ruleFunctionLocation EOF )
            // InternalAioc.g:736:2: iv_ruleFunctionLocation= ruleFunctionLocation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionLocationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionLocation=ruleFunctionLocation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionLocation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionLocation"


    // $ANTLR start "ruleFunctionLocation"
    // InternalAioc.g:743:1: ruleFunctionLocation returns [EObject current=null] : (otherlv_0= 'include' ( (lv_functions_1_0= ruleFunctionList ) ) otherlv_2= 'from' ( (lv_location_3_0= RULE_STRING ) ) (otherlv_4= 'with' ( (lv_protocol_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleFunctionLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_location_3_0=null;
        Token otherlv_4=null;
        Token lv_protocol_5_0=null;
        EObject lv_functions_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:746:28: ( (otherlv_0= 'include' ( (lv_functions_1_0= ruleFunctionList ) ) otherlv_2= 'from' ( (lv_location_3_0= RULE_STRING ) ) (otherlv_4= 'with' ( (lv_protocol_5_0= RULE_STRING ) ) )? ) )
            // InternalAioc.g:747:1: (otherlv_0= 'include' ( (lv_functions_1_0= ruleFunctionList ) ) otherlv_2= 'from' ( (lv_location_3_0= RULE_STRING ) ) (otherlv_4= 'with' ( (lv_protocol_5_0= RULE_STRING ) ) )? )
            {
            // InternalAioc.g:747:1: (otherlv_0= 'include' ( (lv_functions_1_0= ruleFunctionList ) ) otherlv_2= 'from' ( (lv_location_3_0= RULE_STRING ) ) (otherlv_4= 'with' ( (lv_protocol_5_0= RULE_STRING ) ) )? )
            // InternalAioc.g:747:3: otherlv_0= 'include' ( (lv_functions_1_0= ruleFunctionList ) ) otherlv_2= 'from' ( (lv_location_3_0= RULE_STRING ) ) (otherlv_4= 'with' ( (lv_protocol_5_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionLocationAccess().getIncludeKeyword_0());
                  
            }
            // InternalAioc.g:751:1: ( (lv_functions_1_0= ruleFunctionList ) )
            // InternalAioc.g:752:1: (lv_functions_1_0= ruleFunctionList )
            {
            // InternalAioc.g:752:1: (lv_functions_1_0= ruleFunctionList )
            // InternalAioc.g:753:3: lv_functions_1_0= ruleFunctionList
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionLocationAccess().getFunctionsFunctionListParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_20);
            lv_functions_1_0=ruleFunctionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionLocationRule());
              	        }
                     		set(
                     			current, 
                     			"functions",
                      		lv_functions_1_0, 
                      		"org.Aioc.FunctionList");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionLocationAccess().getFromKeyword_2());
                  
            }
            // InternalAioc.g:773:1: ( (lv_location_3_0= RULE_STRING ) )
            // InternalAioc.g:774:1: (lv_location_3_0= RULE_STRING )
            {
            // InternalAioc.g:774:1: (lv_location_3_0= RULE_STRING )
            // InternalAioc.g:775:3: lv_location_3_0= RULE_STRING
            {
            lv_location_3_0=(Token)match(input,RULE_STRING,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_location_3_0, grammarAccess.getFunctionLocationAccess().getLocationSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionLocationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"location",
                      		lv_location_3_0, 
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }

            // InternalAioc.g:791:2: (otherlv_4= 'with' ( (lv_protocol_5_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==46) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAioc.g:791:4: otherlv_4= 'with' ( (lv_protocol_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,46,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getFunctionLocationAccess().getWithKeyword_4_0());
                          
                    }
                    // InternalAioc.g:795:1: ( (lv_protocol_5_0= RULE_STRING ) )
                    // InternalAioc.g:796:1: (lv_protocol_5_0= RULE_STRING )
                    {
                    // InternalAioc.g:796:1: (lv_protocol_5_0= RULE_STRING )
                    // InternalAioc.g:797:3: lv_protocol_5_0= RULE_STRING
                    {
                    lv_protocol_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_protocol_5_0, grammarAccess.getFunctionLocationAccess().getProtocolSTRINGTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionLocationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"protocol",
                              		lv_protocol_5_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionLocation"


    // $ANTLR start "entryRuleFunctionList"
    // InternalAioc.g:821:1: entryRuleFunctionList returns [EObject current=null] : iv_ruleFunctionList= ruleFunctionList EOF ;
    public final EObject entryRuleFunctionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionList = null;


        try {
            // InternalAioc.g:822:2: (iv_ruleFunctionList= ruleFunctionList EOF )
            // InternalAioc.g:823:2: iv_ruleFunctionList= ruleFunctionList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionList=ruleFunctionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionList"


    // $ANTLR start "ruleFunctionList"
    // InternalAioc.g:830:1: ruleFunctionList returns [EObject current=null] : ( ( (lv_functionName_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_functionName_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleFunctionList() throws RecognitionException {
        EObject current = null;

        Token lv_functionName_0_0=null;
        Token this_COMMA_1=null;
        Token lv_functionName_2_0=null;

         enterRule(); 
            
        try {
            // InternalAioc.g:833:28: ( ( ( (lv_functionName_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_functionName_2_0= RULE_ID ) ) )* ) )
            // InternalAioc.g:834:1: ( ( (lv_functionName_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_functionName_2_0= RULE_ID ) ) )* )
            {
            // InternalAioc.g:834:1: ( ( (lv_functionName_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_functionName_2_0= RULE_ID ) ) )* )
            // InternalAioc.g:834:2: ( (lv_functionName_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_functionName_2_0= RULE_ID ) ) )*
            {
            // InternalAioc.g:834:2: ( (lv_functionName_0_0= RULE_ID ) )
            // InternalAioc.g:835:1: (lv_functionName_0_0= RULE_ID )
            {
            // InternalAioc.g:835:1: (lv_functionName_0_0= RULE_ID )
            // InternalAioc.g:836:3: lv_functionName_0_0= RULE_ID
            {
            lv_functionName_0_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_functionName_0_0, grammarAccess.getFunctionListAccess().getFunctionNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionListRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"functionName",
                      		lv_functionName_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalAioc.g:852:2: (this_COMMA_1= RULE_COMMA ( (lv_functionName_2_0= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAioc.g:852:3: this_COMMA_1= RULE_COMMA ( (lv_functionName_2_0= RULE_ID ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getFunctionListAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // InternalAioc.g:856:1: ( (lv_functionName_2_0= RULE_ID ) )
            	    // InternalAioc.g:857:1: (lv_functionName_2_0= RULE_ID )
            	    {
            	    // InternalAioc.g:857:1: (lv_functionName_2_0= RULE_ID )
            	    // InternalAioc.g:858:3: lv_functionName_2_0= RULE_ID
            	    {
            	    lv_functionName_2_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_functionName_2_0, grammarAccess.getFunctionListAccess().getFunctionNameIDTerminalRuleCall_1_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFunctionListRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"functionName",
            	              		lv_functionName_2_0, 
            	              		"org.eclipse.xtext.common.Terminals.ID");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionList"


    // $ANTLR start "entryRuleLocationDefinition"
    // InternalAioc.g:882:1: entryRuleLocationDefinition returns [EObject current=null] : iv_ruleLocationDefinition= ruleLocationDefinition EOF ;
    public final EObject entryRuleLocationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationDefinition = null;


        try {
            // InternalAioc.g:883:2: (iv_ruleLocationDefinition= ruleLocationDefinition EOF )
            // InternalAioc.g:884:2: iv_ruleLocationDefinition= ruleLocationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocationDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocationDefinition=ruleLocationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocationDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocationDefinition"


    // $ANTLR start "ruleLocationDefinition"
    // InternalAioc.g:891:1: ruleLocationDefinition returns [EObject current=null] : (otherlv_0= 'location' this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_location_4_0= RULE_STRING ) ) ( (lv_continuation_5_0= ruleLocationDefinition ) )? ) ;
    public final EObject ruleLocationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_AT_1=null;
        Token lv_role_2_0=null;
        Token this_COLON_3=null;
        Token lv_location_4_0=null;
        EObject lv_continuation_5_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:894:28: ( (otherlv_0= 'location' this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_location_4_0= RULE_STRING ) ) ( (lv_continuation_5_0= ruleLocationDefinition ) )? ) )
            // InternalAioc.g:895:1: (otherlv_0= 'location' this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_location_4_0= RULE_STRING ) ) ( (lv_continuation_5_0= ruleLocationDefinition ) )? )
            {
            // InternalAioc.g:895:1: (otherlv_0= 'location' this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_location_4_0= RULE_STRING ) ) ( (lv_continuation_5_0= ruleLocationDefinition ) )? )
            // InternalAioc.g:895:3: otherlv_0= 'location' this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_location_4_0= RULE_STRING ) ) ( (lv_continuation_5_0= ruleLocationDefinition ) )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLocationDefinitionAccess().getLocationKeyword_0());
                  
            }
            this_AT_1=(Token)match(input,RULE_AT,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_AT_1, grammarAccess.getLocationDefinitionAccess().getATTerminalRuleCall_1()); 
                  
            }
            // InternalAioc.g:903:1: ( (lv_role_2_0= RULE_ID ) )
            // InternalAioc.g:904:1: (lv_role_2_0= RULE_ID )
            {
            // InternalAioc.g:904:1: (lv_role_2_0= RULE_ID )
            // InternalAioc.g:905:3: lv_role_2_0= RULE_ID
            {
            lv_role_2_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_role_2_0, grammarAccess.getLocationDefinitionAccess().getRoleIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLocationDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"role",
                      		lv_role_2_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_3, grammarAccess.getLocationDefinitionAccess().getCOLONTerminalRuleCall_3()); 
                  
            }
            // InternalAioc.g:925:1: ( (lv_location_4_0= RULE_STRING ) )
            // InternalAioc.g:926:1: (lv_location_4_0= RULE_STRING )
            {
            // InternalAioc.g:926:1: (lv_location_4_0= RULE_STRING )
            // InternalAioc.g:927:3: lv_location_4_0= RULE_STRING
            {
            lv_location_4_0=(Token)match(input,RULE_STRING,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_location_4_0, grammarAccess.getLocationDefinitionAccess().getLocationSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLocationDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"location",
                      		lv_location_4_0, 
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }

            // InternalAioc.g:943:2: ( (lv_continuation_5_0= ruleLocationDefinition ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==47) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAioc.g:944:1: (lv_continuation_5_0= ruleLocationDefinition )
                    {
                    // InternalAioc.g:944:1: (lv_continuation_5_0= ruleLocationDefinition )
                    // InternalAioc.g:945:3: lv_continuation_5_0= ruleLocationDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocationDefinitionAccess().getContinuationLocationDefinitionParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_continuation_5_0=ruleLocationDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocationDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"continuation",
                              		lv_continuation_5_0, 
                              		"org.Aioc.LocationDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocationDefinition"


    // $ANTLR start "entryRuleChoreography"
    // InternalAioc.g:969:1: entryRuleChoreography returns [EObject current=null] : iv_ruleChoreography= ruleChoreography EOF ;
    public final EObject entryRuleChoreography() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoreography = null;


        try {
            // InternalAioc.g:970:2: (iv_ruleChoreography= ruleChoreography EOF )
            // InternalAioc.g:971:2: iv_ruleChoreography= ruleChoreography EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChoreographyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChoreography=ruleChoreography();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChoreography; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoreography"


    // $ANTLR start "ruleChoreography"
    // InternalAioc.g:978:1: ruleChoreography returns [EObject current=null] : ( ( (lv_seqBlock_0_0= ruleSeqBlock ) ) (this_PIPE_1= RULE_PIPE ( (lv_next_2_0= ruleChoreography ) ) )? ) ;
    public final EObject ruleChoreography() throws RecognitionException {
        EObject current = null;

        Token this_PIPE_1=null;
        EObject lv_seqBlock_0_0 = null;

        EObject lv_next_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:981:28: ( ( ( (lv_seqBlock_0_0= ruleSeqBlock ) ) (this_PIPE_1= RULE_PIPE ( (lv_next_2_0= ruleChoreography ) ) )? ) )
            // InternalAioc.g:982:1: ( ( (lv_seqBlock_0_0= ruleSeqBlock ) ) (this_PIPE_1= RULE_PIPE ( (lv_next_2_0= ruleChoreography ) ) )? )
            {
            // InternalAioc.g:982:1: ( ( (lv_seqBlock_0_0= ruleSeqBlock ) ) (this_PIPE_1= RULE_PIPE ( (lv_next_2_0= ruleChoreography ) ) )? )
            // InternalAioc.g:982:2: ( (lv_seqBlock_0_0= ruleSeqBlock ) ) (this_PIPE_1= RULE_PIPE ( (lv_next_2_0= ruleChoreography ) ) )?
            {
            // InternalAioc.g:982:2: ( (lv_seqBlock_0_0= ruleSeqBlock ) )
            // InternalAioc.g:983:1: (lv_seqBlock_0_0= ruleSeqBlock )
            {
            // InternalAioc.g:983:1: (lv_seqBlock_0_0= ruleSeqBlock )
            // InternalAioc.g:984:3: lv_seqBlock_0_0= ruleSeqBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getChoreographyAccess().getSeqBlockSeqBlockParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_26);
            lv_seqBlock_0_0=ruleSeqBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getChoreographyRule());
              	        }
                     		set(
                     			current, 
                     			"seqBlock",
                      		lv_seqBlock_0_0, 
                      		"org.Aioc.SeqBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAioc.g:1000:2: (this_PIPE_1= RULE_PIPE ( (lv_next_2_0= ruleChoreography ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_PIPE) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAioc.g:1000:3: this_PIPE_1= RULE_PIPE ( (lv_next_2_0= ruleChoreography ) )
                    {
                    this_PIPE_1=(Token)match(input,RULE_PIPE,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PIPE_1, grammarAccess.getChoreographyAccess().getPIPETerminalRuleCall_1_0()); 
                          
                    }
                    // InternalAioc.g:1004:1: ( (lv_next_2_0= ruleChoreography ) )
                    // InternalAioc.g:1005:1: (lv_next_2_0= ruleChoreography )
                    {
                    // InternalAioc.g:1005:1: (lv_next_2_0= ruleChoreography )
                    // InternalAioc.g:1006:3: lv_next_2_0= ruleChoreography
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getChoreographyAccess().getNextChoreographyParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_next_2_0=ruleChoreography();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getChoreographyRule());
                      	        }
                             		set(
                             			current, 
                             			"next",
                              		lv_next_2_0, 
                              		"org.Aioc.Choreography");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoreography"


    // $ANTLR start "entryRuleSeqBlock"
    // InternalAioc.g:1030:1: entryRuleSeqBlock returns [EObject current=null] : iv_ruleSeqBlock= ruleSeqBlock EOF ;
    public final EObject entryRuleSeqBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeqBlock = null;


        try {
            // InternalAioc.g:1031:2: (iv_ruleSeqBlock= ruleSeqBlock EOF )
            // InternalAioc.g:1032:2: iv_ruleSeqBlock= ruleSeqBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSeqBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSeqBlock=ruleSeqBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSeqBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSeqBlock"


    // $ANTLR start "ruleSeqBlock"
    // InternalAioc.g:1039:1: ruleSeqBlock returns [EObject current=null] : ( ( ( (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography ) ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_next_2_0= ruleSeqBlock ) ) )? ) ;
    public final EObject ruleSeqBlock() throws RecognitionException {
        EObject current = null;

        Token this_SEMICOLON_1=null;
        EObject lv_event_0_1 = null;

        EObject lv_event_0_2 = null;

        EObject lv_event_0_3 = null;

        EObject lv_event_0_4 = null;

        EObject lv_event_0_5 = null;

        EObject lv_event_0_6 = null;

        EObject lv_event_0_7 = null;

        EObject lv_next_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:1042:28: ( ( ( ( (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography ) ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_next_2_0= ruleSeqBlock ) ) )? ) )
            // InternalAioc.g:1043:1: ( ( ( (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography ) ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_next_2_0= ruleSeqBlock ) ) )? )
            {
            // InternalAioc.g:1043:1: ( ( ( (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography ) ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_next_2_0= ruleSeqBlock ) ) )? )
            // InternalAioc.g:1043:2: ( ( (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography ) ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_next_2_0= ruleSeqBlock ) ) )?
            {
            // InternalAioc.g:1043:2: ( ( (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography ) ) )
            // InternalAioc.g:1044:1: ( (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography ) )
            {
            // InternalAioc.g:1044:1: ( (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography ) )
            // InternalAioc.g:1045:1: (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography )
            {
            // InternalAioc.g:1045:1: (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography )
            int alt14=7;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalAioc.g:1046:3: lv_event_0_1= ruleSkip
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSeqBlockAccess().getEventSkipParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_27);
                    lv_event_0_1=ruleSkip();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSeqBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"event",
                              		lv_event_0_1, 
                              		"org.Aioc.Skip");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalAioc.g:1061:8: lv_event_0_2= ruleInteraction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSeqBlockAccess().getEventInteractionParserRuleCall_0_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_27);
                    lv_event_0_2=ruleInteraction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSeqBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"event",
                              		lv_event_0_2, 
                              		"org.Aioc.Interaction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 3 :
                    // InternalAioc.g:1076:8: lv_event_0_3= ruleLocalCode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSeqBlockAccess().getEventLocalCodeParserRuleCall_0_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_27);
                    lv_event_0_3=ruleLocalCode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSeqBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"event",
                              		lv_event_0_3, 
                              		"org.Aioc.LocalCode");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 4 :
                    // InternalAioc.g:1091:8: lv_event_0_4= ruleIfThenElse
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSeqBlockAccess().getEventIfThenElseParserRuleCall_0_0_3()); 
                      	    
                    }
                    pushFollow(FOLLOW_27);
                    lv_event_0_4=ruleIfThenElse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSeqBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"event",
                              		lv_event_0_4, 
                              		"org.Aioc.IfThenElse");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 5 :
                    // InternalAioc.g:1106:8: lv_event_0_5= ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSeqBlockAccess().getEventWhileParserRuleCall_0_0_4()); 
                      	    
                    }
                    pushFollow(FOLLOW_27);
                    lv_event_0_5=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSeqBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"event",
                              		lv_event_0_5, 
                              		"org.Aioc.While");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 6 :
                    // InternalAioc.g:1121:8: lv_event_0_6= ruleScope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSeqBlockAccess().getEventScopeParserRuleCall_0_0_5()); 
                      	    
                    }
                    pushFollow(FOLLOW_27);
                    lv_event_0_6=ruleScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSeqBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"event",
                              		lv_event_0_6, 
                              		"org.Aioc.Scope");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 7 :
                    // InternalAioc.g:1136:8: lv_event_0_7= ruleNestedChoreography
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSeqBlockAccess().getEventNestedChoreographyParserRuleCall_0_0_6()); 
                      	    
                    }
                    pushFollow(FOLLOW_27);
                    lv_event_0_7=ruleNestedChoreography();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSeqBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"event",
                              		lv_event_0_7, 
                              		"org.Aioc.NestedChoreography");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // InternalAioc.g:1154:2: (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_next_2_0= ruleSeqBlock ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_SEMICOLON) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAioc.g:1154:3: this_SEMICOLON_1= RULE_SEMICOLON ( (lv_next_2_0= ruleSeqBlock ) )
                    {
                    this_SEMICOLON_1=(Token)match(input,RULE_SEMICOLON,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_1, grammarAccess.getSeqBlockAccess().getSEMICOLONTerminalRuleCall_1_0()); 
                          
                    }
                    // InternalAioc.g:1158:1: ( (lv_next_2_0= ruleSeqBlock ) )
                    // InternalAioc.g:1159:1: (lv_next_2_0= ruleSeqBlock )
                    {
                    // InternalAioc.g:1159:1: (lv_next_2_0= ruleSeqBlock )
                    // InternalAioc.g:1160:3: lv_next_2_0= ruleSeqBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSeqBlockAccess().getNextSeqBlockParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_next_2_0=ruleSeqBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSeqBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"next",
                              		lv_next_2_0, 
                              		"org.Aioc.SeqBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSeqBlock"


    // $ANTLR start "entryRuleSkip"
    // InternalAioc.g:1184:1: entryRuleSkip returns [EObject current=null] : iv_ruleSkip= ruleSkip EOF ;
    public final EObject entryRuleSkip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkip = null;


        try {
            // InternalAioc.g:1185:2: (iv_ruleSkip= ruleSkip EOF )
            // InternalAioc.g:1186:2: iv_ruleSkip= ruleSkip EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSkipRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSkip=ruleSkip();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSkip; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSkip"


    // $ANTLR start "ruleSkip"
    // InternalAioc.g:1193:1: ruleSkip returns [EObject current=null] : ( (lv_skip_0_0= 'skip' ) ) ;
    public final EObject ruleSkip() throws RecognitionException {
        EObject current = null;

        Token lv_skip_0_0=null;

         enterRule(); 
            
        try {
            // InternalAioc.g:1196:28: ( ( (lv_skip_0_0= 'skip' ) ) )
            // InternalAioc.g:1197:1: ( (lv_skip_0_0= 'skip' ) )
            {
            // InternalAioc.g:1197:1: ( (lv_skip_0_0= 'skip' ) )
            // InternalAioc.g:1198:1: (lv_skip_0_0= 'skip' )
            {
            // InternalAioc.g:1198:1: (lv_skip_0_0= 'skip' )
            // InternalAioc.g:1199:3: lv_skip_0_0= 'skip'
            {
            lv_skip_0_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_skip_0_0, grammarAccess.getSkipAccess().getSkipSkipKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSkipRule());
              	        }
                     		setWithLastConsumed(current, "skip", true, "skip");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSkip"


    // $ANTLR start "entryRuleInteraction"
    // InternalAioc.g:1220:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalAioc.g:1221:2: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalAioc.g:1222:2: iv_ruleInteraction= ruleInteraction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteraction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalAioc.g:1229:1: ruleInteraction returns [EObject current=null] : ( ( (lv_operation_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_sender_2_0= RULE_ID ) ) this_LRND_3= RULE_LRND ( (lv_senderExpression_4_0= ruleExpressionBasicTerm ) )? this_RRND_5= RULE_RRND this_ARROW_6= RULE_ARROW ( (lv_receiver_7_0= RULE_ID ) ) this_LRND_8= RULE_LRND ( (lv_receiverVariable_9_0= RULE_ID ) )? this_RRND_10= RULE_RRND ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token lv_operation_0_0=null;
        Token this_COLON_1=null;
        Token lv_sender_2_0=null;
        Token this_LRND_3=null;
        Token this_RRND_5=null;
        Token this_ARROW_6=null;
        Token lv_receiver_7_0=null;
        Token this_LRND_8=null;
        Token lv_receiverVariable_9_0=null;
        Token this_RRND_10=null;
        EObject lv_senderExpression_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:1232:28: ( ( ( (lv_operation_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_sender_2_0= RULE_ID ) ) this_LRND_3= RULE_LRND ( (lv_senderExpression_4_0= ruleExpressionBasicTerm ) )? this_RRND_5= RULE_RRND this_ARROW_6= RULE_ARROW ( (lv_receiver_7_0= RULE_ID ) ) this_LRND_8= RULE_LRND ( (lv_receiverVariable_9_0= RULE_ID ) )? this_RRND_10= RULE_RRND ) )
            // InternalAioc.g:1233:1: ( ( (lv_operation_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_sender_2_0= RULE_ID ) ) this_LRND_3= RULE_LRND ( (lv_senderExpression_4_0= ruleExpressionBasicTerm ) )? this_RRND_5= RULE_RRND this_ARROW_6= RULE_ARROW ( (lv_receiver_7_0= RULE_ID ) ) this_LRND_8= RULE_LRND ( (lv_receiverVariable_9_0= RULE_ID ) )? this_RRND_10= RULE_RRND )
            {
            // InternalAioc.g:1233:1: ( ( (lv_operation_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_sender_2_0= RULE_ID ) ) this_LRND_3= RULE_LRND ( (lv_senderExpression_4_0= ruleExpressionBasicTerm ) )? this_RRND_5= RULE_RRND this_ARROW_6= RULE_ARROW ( (lv_receiver_7_0= RULE_ID ) ) this_LRND_8= RULE_LRND ( (lv_receiverVariable_9_0= RULE_ID ) )? this_RRND_10= RULE_RRND )
            // InternalAioc.g:1233:2: ( (lv_operation_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_sender_2_0= RULE_ID ) ) this_LRND_3= RULE_LRND ( (lv_senderExpression_4_0= ruleExpressionBasicTerm ) )? this_RRND_5= RULE_RRND this_ARROW_6= RULE_ARROW ( (lv_receiver_7_0= RULE_ID ) ) this_LRND_8= RULE_LRND ( (lv_receiverVariable_9_0= RULE_ID ) )? this_RRND_10= RULE_RRND
            {
            // InternalAioc.g:1233:2: ( (lv_operation_0_0= RULE_ID ) )
            // InternalAioc.g:1234:1: (lv_operation_0_0= RULE_ID )
            {
            // InternalAioc.g:1234:1: (lv_operation_0_0= RULE_ID )
            // InternalAioc.g:1235:3: lv_operation_0_0= RULE_ID
            {
            lv_operation_0_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_operation_0_0, grammarAccess.getInteractionAccess().getOperationIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"operation",
                      		lv_operation_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_1, grammarAccess.getInteractionAccess().getCOLONTerminalRuleCall_1()); 
                  
            }
            // InternalAioc.g:1255:1: ( (lv_sender_2_0= RULE_ID ) )
            // InternalAioc.g:1256:1: (lv_sender_2_0= RULE_ID )
            {
            // InternalAioc.g:1256:1: (lv_sender_2_0= RULE_ID )
            // InternalAioc.g:1257:3: lv_sender_2_0= RULE_ID
            {
            lv_sender_2_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_sender_2_0, grammarAccess.getInteractionAccess().getSenderIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"sender",
                      		lv_sender_2_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            this_LRND_3=(Token)match(input,RULE_LRND,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LRND_3, grammarAccess.getInteractionAccess().getLRNDTerminalRuleCall_3()); 
                  
            }
            // InternalAioc.g:1277:1: ( (lv_senderExpression_4_0= ruleExpressionBasicTerm ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_LRND||(LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||(LA16_0>=RULE_NOT && LA16_0<=RULE_INT)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAioc.g:1278:1: (lv_senderExpression_4_0= ruleExpressionBasicTerm )
                    {
                    // InternalAioc.g:1278:1: (lv_senderExpression_4_0= ruleExpressionBasicTerm )
                    // InternalAioc.g:1279:3: lv_senderExpression_4_0= ruleExpressionBasicTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractionAccess().getSenderExpressionExpressionBasicTermParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_14);
                    lv_senderExpression_4_0=ruleExpressionBasicTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractionRule());
                      	        }
                             		set(
                             			current, 
                             			"senderExpression",
                              		lv_senderExpression_4_0, 
                              		"org.Aioc.ExpressionBasicTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            this_RRND_5=(Token)match(input,RULE_RRND,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RRND_5, grammarAccess.getInteractionAccess().getRRNDTerminalRuleCall_5()); 
                  
            }
            this_ARROW_6=(Token)match(input,RULE_ARROW,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ARROW_6, grammarAccess.getInteractionAccess().getARROWTerminalRuleCall_6()); 
                  
            }
            // InternalAioc.g:1303:1: ( (lv_receiver_7_0= RULE_ID ) )
            // InternalAioc.g:1304:1: (lv_receiver_7_0= RULE_ID )
            {
            // InternalAioc.g:1304:1: (lv_receiver_7_0= RULE_ID )
            // InternalAioc.g:1305:3: lv_receiver_7_0= RULE_ID
            {
            lv_receiver_7_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_receiver_7_0, grammarAccess.getInteractionAccess().getReceiverIDTerminalRuleCall_7_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"receiver",
                      		lv_receiver_7_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            this_LRND_8=(Token)match(input,RULE_LRND,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LRND_8, grammarAccess.getInteractionAccess().getLRNDTerminalRuleCall_8()); 
                  
            }
            // InternalAioc.g:1325:1: ( (lv_receiverVariable_9_0= RULE_ID ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAioc.g:1326:1: (lv_receiverVariable_9_0= RULE_ID )
                    {
                    // InternalAioc.g:1326:1: (lv_receiverVariable_9_0= RULE_ID )
                    // InternalAioc.g:1327:3: lv_receiverVariable_9_0= RULE_ID
                    {
                    lv_receiverVariable_9_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_receiverVariable_9_0, grammarAccess.getInteractionAccess().getReceiverVariableIDTerminalRuleCall_9_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInteractionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"receiverVariable",
                              		lv_receiverVariable_9_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            this_RRND_10=(Token)match(input,RULE_RRND,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RRND_10, grammarAccess.getInteractionAccess().getRRNDTerminalRuleCall_10()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleLocalCode"
    // InternalAioc.g:1355:1: entryRuleLocalCode returns [EObject current=null] : iv_ruleLocalCode= ruleLocalCode EOF ;
    public final EObject entryRuleLocalCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalCode = null;


        try {
            // InternalAioc.g:1356:2: (iv_ruleLocalCode= ruleLocalCode EOF )
            // InternalAioc.g:1357:2: iv_ruleLocalCode= ruleLocalCode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalCodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocalCode=ruleLocalCode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalCode; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalCode"


    // $ANTLR start "ruleLocalCode"
    // InternalAioc.g:1364:1: ruleLocalCode returns [EObject current=null] : ( ( () ( (lv_resultVariable_1_0= RULE_ID ) ) this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_ASSIGN_4= RULE_ASSIGN otherlv_5= 'getInput' this_LRND_6= RULE_LRND ( (lv_question_7_0= ruleExpression ) ) this_RRND_8= RULE_RRND ) | ( () ( (lv_variable_10_0= RULE_ID ) ) this_AT_11= RULE_AT ( (lv_thread_12_0= RULE_ID ) ) this_ASSIGN_13= RULE_ASSIGN otherlv_14= 'show' this_LRND_15= RULE_LRND ( (lv_expression_16_0= ruleExpression ) ) this_RRND_17= RULE_RRND ) | ( () ( (lv_variable_19_0= RULE_ID ) ) this_AT_20= RULE_AT ( (lv_thread_21_0= RULE_ID ) ) this_ASSIGN_22= RULE_ASSIGN ( ( (lv_expression_23_0= ruleExpression ) ) | ( (lv_function_24_0= ruleFunction ) ) ) ) ) ;
    public final EObject ruleLocalCode() throws RecognitionException {
        EObject current = null;

        Token lv_resultVariable_1_0=null;
        Token this_AT_2=null;
        Token lv_thread_3_0=null;
        Token this_ASSIGN_4=null;
        Token otherlv_5=null;
        Token this_LRND_6=null;
        Token this_RRND_8=null;
        Token lv_variable_10_0=null;
        Token this_AT_11=null;
        Token lv_thread_12_0=null;
        Token this_ASSIGN_13=null;
        Token otherlv_14=null;
        Token this_LRND_15=null;
        Token this_RRND_17=null;
        Token lv_variable_19_0=null;
        Token this_AT_20=null;
        Token lv_thread_21_0=null;
        Token this_ASSIGN_22=null;
        EObject lv_question_7_0 = null;

        EObject lv_expression_16_0 = null;

        EObject lv_expression_23_0 = null;

        EObject lv_function_24_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:1367:28: ( ( ( () ( (lv_resultVariable_1_0= RULE_ID ) ) this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_ASSIGN_4= RULE_ASSIGN otherlv_5= 'getInput' this_LRND_6= RULE_LRND ( (lv_question_7_0= ruleExpression ) ) this_RRND_8= RULE_RRND ) | ( () ( (lv_variable_10_0= RULE_ID ) ) this_AT_11= RULE_AT ( (lv_thread_12_0= RULE_ID ) ) this_ASSIGN_13= RULE_ASSIGN otherlv_14= 'show' this_LRND_15= RULE_LRND ( (lv_expression_16_0= ruleExpression ) ) this_RRND_17= RULE_RRND ) | ( () ( (lv_variable_19_0= RULE_ID ) ) this_AT_20= RULE_AT ( (lv_thread_21_0= RULE_ID ) ) this_ASSIGN_22= RULE_ASSIGN ( ( (lv_expression_23_0= ruleExpression ) ) | ( (lv_function_24_0= ruleFunction ) ) ) ) ) )
            // InternalAioc.g:1368:1: ( ( () ( (lv_resultVariable_1_0= RULE_ID ) ) this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_ASSIGN_4= RULE_ASSIGN otherlv_5= 'getInput' this_LRND_6= RULE_LRND ( (lv_question_7_0= ruleExpression ) ) this_RRND_8= RULE_RRND ) | ( () ( (lv_variable_10_0= RULE_ID ) ) this_AT_11= RULE_AT ( (lv_thread_12_0= RULE_ID ) ) this_ASSIGN_13= RULE_ASSIGN otherlv_14= 'show' this_LRND_15= RULE_LRND ( (lv_expression_16_0= ruleExpression ) ) this_RRND_17= RULE_RRND ) | ( () ( (lv_variable_19_0= RULE_ID ) ) this_AT_20= RULE_AT ( (lv_thread_21_0= RULE_ID ) ) this_ASSIGN_22= RULE_ASSIGN ( ( (lv_expression_23_0= ruleExpression ) ) | ( (lv_function_24_0= ruleFunction ) ) ) ) )
            {
            // InternalAioc.g:1368:1: ( ( () ( (lv_resultVariable_1_0= RULE_ID ) ) this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_ASSIGN_4= RULE_ASSIGN otherlv_5= 'getInput' this_LRND_6= RULE_LRND ( (lv_question_7_0= ruleExpression ) ) this_RRND_8= RULE_RRND ) | ( () ( (lv_variable_10_0= RULE_ID ) ) this_AT_11= RULE_AT ( (lv_thread_12_0= RULE_ID ) ) this_ASSIGN_13= RULE_ASSIGN otherlv_14= 'show' this_LRND_15= RULE_LRND ( (lv_expression_16_0= ruleExpression ) ) this_RRND_17= RULE_RRND ) | ( () ( (lv_variable_19_0= RULE_ID ) ) this_AT_20= RULE_AT ( (lv_thread_21_0= RULE_ID ) ) this_ASSIGN_22= RULE_ASSIGN ( ( (lv_expression_23_0= ruleExpression ) ) | ( (lv_function_24_0= ruleFunction ) ) ) ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_AT) ) {
                    int LA19_2 = input.LA(3);

                    if ( (LA19_2==RULE_ID) ) {
                        int LA19_3 = input.LA(4);

                        if ( (LA19_3==RULE_ASSIGN) ) {
                            switch ( input.LA(5) ) {
                            case 49:
                                {
                                alt19=1;
                                }
                                break;
                            case 50:
                                {
                                alt19=2;
                                }
                                break;
                            case RULE_LRND:
                            case RULE_ID:
                            case RULE_TRUE:
                            case RULE_FALSE:
                            case RULE_STRING:
                            case RULE_NOT:
                            case RULE_INT:
                                {
                                alt19=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 19, 4, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalAioc.g:1368:2: ( () ( (lv_resultVariable_1_0= RULE_ID ) ) this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_ASSIGN_4= RULE_ASSIGN otherlv_5= 'getInput' this_LRND_6= RULE_LRND ( (lv_question_7_0= ruleExpression ) ) this_RRND_8= RULE_RRND )
                    {
                    // InternalAioc.g:1368:2: ( () ( (lv_resultVariable_1_0= RULE_ID ) ) this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_ASSIGN_4= RULE_ASSIGN otherlv_5= 'getInput' this_LRND_6= RULE_LRND ( (lv_question_7_0= ruleExpression ) ) this_RRND_8= RULE_RRND )
                    // InternalAioc.g:1368:3: () ( (lv_resultVariable_1_0= RULE_ID ) ) this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_ASSIGN_4= RULE_ASSIGN otherlv_5= 'getInput' this_LRND_6= RULE_LRND ( (lv_question_7_0= ruleExpression ) ) this_RRND_8= RULE_RRND
                    {
                    // InternalAioc.g:1368:3: ()
                    // InternalAioc.g:1369:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLocalCodeAccess().getLocalAskCommandAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalAioc.g:1374:2: ( (lv_resultVariable_1_0= RULE_ID ) )
                    // InternalAioc.g:1375:1: (lv_resultVariable_1_0= RULE_ID )
                    {
                    // InternalAioc.g:1375:1: (lv_resultVariable_1_0= RULE_ID )
                    // InternalAioc.g:1376:3: lv_resultVariable_1_0= RULE_ID
                    {
                    lv_resultVariable_1_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_resultVariable_1_0, grammarAccess.getLocalCodeAccess().getResultVariableIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLocalCodeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"resultVariable",
                              		lv_resultVariable_1_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    this_AT_2=(Token)match(input,RULE_AT,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_2, grammarAccess.getLocalCodeAccess().getATTerminalRuleCall_0_2()); 
                          
                    }
                    // InternalAioc.g:1396:1: ( (lv_thread_3_0= RULE_ID ) )
                    // InternalAioc.g:1397:1: (lv_thread_3_0= RULE_ID )
                    {
                    // InternalAioc.g:1397:1: (lv_thread_3_0= RULE_ID )
                    // InternalAioc.g:1398:3: lv_thread_3_0= RULE_ID
                    {
                    lv_thread_3_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_thread_3_0, grammarAccess.getLocalCodeAccess().getThreadIDTerminalRuleCall_0_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLocalCodeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"thread",
                              		lv_thread_3_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    this_ASSIGN_4=(Token)match(input,RULE_ASSIGN,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ASSIGN_4, grammarAccess.getLocalCodeAccess().getASSIGNTerminalRuleCall_0_4()); 
                          
                    }
                    otherlv_5=(Token)match(input,49,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getLocalCodeAccess().getGetInputKeyword_0_5());
                          
                    }
                    this_LRND_6=(Token)match(input,RULE_LRND,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LRND_6, grammarAccess.getLocalCodeAccess().getLRNDTerminalRuleCall_0_6()); 
                          
                    }
                    // InternalAioc.g:1426:1: ( (lv_question_7_0= ruleExpression ) )
                    // InternalAioc.g:1427:1: (lv_question_7_0= ruleExpression )
                    {
                    // InternalAioc.g:1427:1: (lv_question_7_0= ruleExpression )
                    // InternalAioc.g:1428:3: lv_question_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalCodeAccess().getQuestionExpressionParserRuleCall_0_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_14);
                    lv_question_7_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalCodeRule());
                      	        }
                             		set(
                             			current, 
                             			"question",
                              		lv_question_7_0, 
                              		"org.Aioc.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RRND_8=(Token)match(input,RULE_RRND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RRND_8, grammarAccess.getLocalCodeAccess().getRRNDTerminalRuleCall_0_8()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAioc.g:1449:6: ( () ( (lv_variable_10_0= RULE_ID ) ) this_AT_11= RULE_AT ( (lv_thread_12_0= RULE_ID ) ) this_ASSIGN_13= RULE_ASSIGN otherlv_14= 'show' this_LRND_15= RULE_LRND ( (lv_expression_16_0= ruleExpression ) ) this_RRND_17= RULE_RRND )
                    {
                    // InternalAioc.g:1449:6: ( () ( (lv_variable_10_0= RULE_ID ) ) this_AT_11= RULE_AT ( (lv_thread_12_0= RULE_ID ) ) this_ASSIGN_13= RULE_ASSIGN otherlv_14= 'show' this_LRND_15= RULE_LRND ( (lv_expression_16_0= ruleExpression ) ) this_RRND_17= RULE_RRND )
                    // InternalAioc.g:1449:7: () ( (lv_variable_10_0= RULE_ID ) ) this_AT_11= RULE_AT ( (lv_thread_12_0= RULE_ID ) ) this_ASSIGN_13= RULE_ASSIGN otherlv_14= 'show' this_LRND_15= RULE_LRND ( (lv_expression_16_0= ruleExpression ) ) this_RRND_17= RULE_RRND
                    {
                    // InternalAioc.g:1449:7: ()
                    // InternalAioc.g:1450:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLocalCodeAccess().getLocalShowCommandAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalAioc.g:1455:2: ( (lv_variable_10_0= RULE_ID ) )
                    // InternalAioc.g:1456:1: (lv_variable_10_0= RULE_ID )
                    {
                    // InternalAioc.g:1456:1: (lv_variable_10_0= RULE_ID )
                    // InternalAioc.g:1457:3: lv_variable_10_0= RULE_ID
                    {
                    lv_variable_10_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_variable_10_0, grammarAccess.getLocalCodeAccess().getVariableIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLocalCodeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"variable",
                              		lv_variable_10_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    this_AT_11=(Token)match(input,RULE_AT,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_11, grammarAccess.getLocalCodeAccess().getATTerminalRuleCall_1_2()); 
                          
                    }
                    // InternalAioc.g:1477:1: ( (lv_thread_12_0= RULE_ID ) )
                    // InternalAioc.g:1478:1: (lv_thread_12_0= RULE_ID )
                    {
                    // InternalAioc.g:1478:1: (lv_thread_12_0= RULE_ID )
                    // InternalAioc.g:1479:3: lv_thread_12_0= RULE_ID
                    {
                    lv_thread_12_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_thread_12_0, grammarAccess.getLocalCodeAccess().getThreadIDTerminalRuleCall_1_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLocalCodeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"thread",
                              		lv_thread_12_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    this_ASSIGN_13=(Token)match(input,RULE_ASSIGN,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ASSIGN_13, grammarAccess.getLocalCodeAccess().getASSIGNTerminalRuleCall_1_4()); 
                          
                    }
                    otherlv_14=(Token)match(input,50,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getLocalCodeAccess().getShowKeyword_1_5());
                          
                    }
                    this_LRND_15=(Token)match(input,RULE_LRND,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LRND_15, grammarAccess.getLocalCodeAccess().getLRNDTerminalRuleCall_1_6()); 
                          
                    }
                    // InternalAioc.g:1507:1: ( (lv_expression_16_0= ruleExpression ) )
                    // InternalAioc.g:1508:1: (lv_expression_16_0= ruleExpression )
                    {
                    // InternalAioc.g:1508:1: (lv_expression_16_0= ruleExpression )
                    // InternalAioc.g:1509:3: lv_expression_16_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalCodeAccess().getExpressionExpressionParserRuleCall_1_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_14);
                    lv_expression_16_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalCodeRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_16_0, 
                              		"org.Aioc.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RRND_17=(Token)match(input,RULE_RRND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RRND_17, grammarAccess.getLocalCodeAccess().getRRNDTerminalRuleCall_1_8()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAioc.g:1530:6: ( () ( (lv_variable_19_0= RULE_ID ) ) this_AT_20= RULE_AT ( (lv_thread_21_0= RULE_ID ) ) this_ASSIGN_22= RULE_ASSIGN ( ( (lv_expression_23_0= ruleExpression ) ) | ( (lv_function_24_0= ruleFunction ) ) ) )
                    {
                    // InternalAioc.g:1530:6: ( () ( (lv_variable_19_0= RULE_ID ) ) this_AT_20= RULE_AT ( (lv_thread_21_0= RULE_ID ) ) this_ASSIGN_22= RULE_ASSIGN ( ( (lv_expression_23_0= ruleExpression ) ) | ( (lv_function_24_0= ruleFunction ) ) ) )
                    // InternalAioc.g:1530:7: () ( (lv_variable_19_0= RULE_ID ) ) this_AT_20= RULE_AT ( (lv_thread_21_0= RULE_ID ) ) this_ASSIGN_22= RULE_ASSIGN ( ( (lv_expression_23_0= ruleExpression ) ) | ( (lv_function_24_0= ruleFunction ) ) )
                    {
                    // InternalAioc.g:1530:7: ()
                    // InternalAioc.g:1531:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLocalCodeAccess().getLocalAssignmentCommandAction_2_0(),
                                  current);
                          
                    }

                    }

                    // InternalAioc.g:1536:2: ( (lv_variable_19_0= RULE_ID ) )
                    // InternalAioc.g:1537:1: (lv_variable_19_0= RULE_ID )
                    {
                    // InternalAioc.g:1537:1: (lv_variable_19_0= RULE_ID )
                    // InternalAioc.g:1538:3: lv_variable_19_0= RULE_ID
                    {
                    lv_variable_19_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_variable_19_0, grammarAccess.getLocalCodeAccess().getVariableIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLocalCodeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"variable",
                              		lv_variable_19_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    this_AT_20=(Token)match(input,RULE_AT,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_20, grammarAccess.getLocalCodeAccess().getATTerminalRuleCall_2_2()); 
                          
                    }
                    // InternalAioc.g:1558:1: ( (lv_thread_21_0= RULE_ID ) )
                    // InternalAioc.g:1559:1: (lv_thread_21_0= RULE_ID )
                    {
                    // InternalAioc.g:1559:1: (lv_thread_21_0= RULE_ID )
                    // InternalAioc.g:1560:3: lv_thread_21_0= RULE_ID
                    {
                    lv_thread_21_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_thread_21_0, grammarAccess.getLocalCodeAccess().getThreadIDTerminalRuleCall_2_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLocalCodeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"thread",
                              		lv_thread_21_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    this_ASSIGN_22=(Token)match(input,RULE_ASSIGN,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ASSIGN_22, grammarAccess.getLocalCodeAccess().getASSIGNTerminalRuleCall_2_4()); 
                          
                    }
                    // InternalAioc.g:1580:1: ( ( (lv_expression_23_0= ruleExpression ) ) | ( (lv_function_24_0= ruleFunction ) ) )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_LRND||(LA18_0>=RULE_TRUE && LA18_0<=RULE_STRING)||(LA18_0>=RULE_NOT && LA18_0<=RULE_INT)) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==RULE_ID) ) {
                        int LA18_2 = input.LA(2);

                        if ( (LA18_2==RULE_LRND) ) {
                            alt18=2;
                        }
                        else if ( (LA18_2==EOF||LA18_2==RULE_RCURLY||(LA18_2>=RULE_PIPE && LA18_2<=RULE_SEMICOLON)||(LA18_2>=RULE_PLUS && LA18_2<=RULE_MINUS)) ) {
                            alt18=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalAioc.g:1580:2: ( (lv_expression_23_0= ruleExpression ) )
                            {
                            // InternalAioc.g:1580:2: ( (lv_expression_23_0= ruleExpression ) )
                            // InternalAioc.g:1581:1: (lv_expression_23_0= ruleExpression )
                            {
                            // InternalAioc.g:1581:1: (lv_expression_23_0= ruleExpression )
                            // InternalAioc.g:1582:3: lv_expression_23_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalCodeAccess().getExpressionExpressionParserRuleCall_2_5_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_2);
                            lv_expression_23_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLocalCodeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"expression",
                                      		lv_expression_23_0, 
                                      		"org.Aioc.Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAioc.g:1599:6: ( (lv_function_24_0= ruleFunction ) )
                            {
                            // InternalAioc.g:1599:6: ( (lv_function_24_0= ruleFunction ) )
                            // InternalAioc.g:1600:1: (lv_function_24_0= ruleFunction )
                            {
                            // InternalAioc.g:1600:1: (lv_function_24_0= ruleFunction )
                            // InternalAioc.g:1601:3: lv_function_24_0= ruleFunction
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalCodeAccess().getFunctionFunctionParserRuleCall_2_5_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_2);
                            lv_function_24_0=ruleFunction();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLocalCodeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"function",
                                      		lv_function_24_0, 
                                      		"org.Aioc.Function");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalCode"


    // $ANTLR start "entryRuleIfThenElse"
    // InternalAioc.g:1625:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // InternalAioc.g:1626:2: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // InternalAioc.g:1627:2: iv_ruleIfThenElse= ruleIfThenElse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfThenElseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfThenElse=ruleIfThenElse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfThenElse; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfThenElse"


    // $ANTLR start "ruleIfThenElse"
    // InternalAioc.g:1634:1: ruleIfThenElse returns [EObject current=null] : ( ( ( (lv_key_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )? otherlv_2= 'if' this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND this_AT_6= RULE_AT ( (lv_thread_7_0= RULE_ID ) ) this_LCURLY_8= RULE_LCURLY ( (lv_then_9_0= ruleChoreography ) ) this_RCURLY_10= RULE_RCURLY (otherlv_11= 'else' this_LCURLY_12= RULE_LCURLY ( (lv_else_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY )? ) ;
    public final EObject ruleIfThenElse() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token this_COLON_1=null;
        Token otherlv_2=null;
        Token this_LRND_3=null;
        Token this_RRND_5=null;
        Token this_AT_6=null;
        Token lv_thread_7_0=null;
        Token this_LCURLY_8=null;
        Token this_RCURLY_10=null;
        Token otherlv_11=null;
        Token this_LCURLY_12=null;
        Token this_RCURLY_14=null;
        EObject lv_condition_4_0 = null;

        EObject lv_then_9_0 = null;

        EObject lv_else_13_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:1637:28: ( ( ( ( (lv_key_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )? otherlv_2= 'if' this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND this_AT_6= RULE_AT ( (lv_thread_7_0= RULE_ID ) ) this_LCURLY_8= RULE_LCURLY ( (lv_then_9_0= ruleChoreography ) ) this_RCURLY_10= RULE_RCURLY (otherlv_11= 'else' this_LCURLY_12= RULE_LCURLY ( (lv_else_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY )? ) )
            // InternalAioc.g:1638:1: ( ( ( (lv_key_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )? otherlv_2= 'if' this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND this_AT_6= RULE_AT ( (lv_thread_7_0= RULE_ID ) ) this_LCURLY_8= RULE_LCURLY ( (lv_then_9_0= ruleChoreography ) ) this_RCURLY_10= RULE_RCURLY (otherlv_11= 'else' this_LCURLY_12= RULE_LCURLY ( (lv_else_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY )? )
            {
            // InternalAioc.g:1638:1: ( ( ( (lv_key_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )? otherlv_2= 'if' this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND this_AT_6= RULE_AT ( (lv_thread_7_0= RULE_ID ) ) this_LCURLY_8= RULE_LCURLY ( (lv_then_9_0= ruleChoreography ) ) this_RCURLY_10= RULE_RCURLY (otherlv_11= 'else' this_LCURLY_12= RULE_LCURLY ( (lv_else_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY )? )
            // InternalAioc.g:1638:2: ( ( (lv_key_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )? otherlv_2= 'if' this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND this_AT_6= RULE_AT ( (lv_thread_7_0= RULE_ID ) ) this_LCURLY_8= RULE_LCURLY ( (lv_then_9_0= ruleChoreography ) ) this_RCURLY_10= RULE_RCURLY (otherlv_11= 'else' this_LCURLY_12= RULE_LCURLY ( (lv_else_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY )?
            {
            // InternalAioc.g:1638:2: ( ( (lv_key_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAioc.g:1638:3: ( (lv_key_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON
                    {
                    // InternalAioc.g:1638:3: ( (lv_key_0_0= RULE_ID ) )
                    // InternalAioc.g:1639:1: (lv_key_0_0= RULE_ID )
                    {
                    // InternalAioc.g:1639:1: (lv_key_0_0= RULE_ID )
                    // InternalAioc.g:1640:3: lv_key_0_0= RULE_ID
                    {
                    lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_key_0_0, grammarAccess.getIfThenElseAccess().getKeyIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIfThenElseRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"key",
                              		lv_key_0_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_1, grammarAccess.getIfThenElseAccess().getCOLONTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,51,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfThenElseAccess().getIfKeyword_1());
                  
            }
            this_LRND_3=(Token)match(input,RULE_LRND,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LRND_3, grammarAccess.getIfThenElseAccess().getLRNDTerminalRuleCall_2()); 
                  
            }
            // InternalAioc.g:1668:1: ( (lv_condition_4_0= ruleCondition ) )
            // InternalAioc.g:1669:1: (lv_condition_4_0= ruleCondition )
            {
            // InternalAioc.g:1669:1: (lv_condition_4_0= ruleCondition )
            // InternalAioc.g:1670:3: lv_condition_4_0= ruleCondition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfThenElseAccess().getConditionConditionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_14);
            lv_condition_4_0=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_4_0, 
                      		"org.Aioc.Condition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RRND_5=(Token)match(input,RULE_RRND,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RRND_5, grammarAccess.getIfThenElseAccess().getRRNDTerminalRuleCall_4()); 
                  
            }
            this_AT_6=(Token)match(input,RULE_AT,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_AT_6, grammarAccess.getIfThenElseAccess().getATTerminalRuleCall_5()); 
                  
            }
            // InternalAioc.g:1694:1: ( (lv_thread_7_0= RULE_ID ) )
            // InternalAioc.g:1695:1: (lv_thread_7_0= RULE_ID )
            {
            // InternalAioc.g:1695:1: (lv_thread_7_0= RULE_ID )
            // InternalAioc.g:1696:3: lv_thread_7_0= RULE_ID
            {
            lv_thread_7_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_thread_7_0, grammarAccess.getIfThenElseAccess().getThreadIDTerminalRuleCall_6_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIfThenElseRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"thread",
                      		lv_thread_7_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            this_LCURLY_8=(Token)match(input,RULE_LCURLY,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCURLY_8, grammarAccess.getIfThenElseAccess().getLCURLYTerminalRuleCall_7()); 
                  
            }
            // InternalAioc.g:1716:1: ( (lv_then_9_0= ruleChoreography ) )
            // InternalAioc.g:1717:1: (lv_then_9_0= ruleChoreography )
            {
            // InternalAioc.g:1717:1: (lv_then_9_0= ruleChoreography )
            // InternalAioc.g:1718:3: lv_then_9_0= ruleChoreography
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfThenElseAccess().getThenChoreographyParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_then_9_0=ruleChoreography();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_9_0, 
                      		"org.Aioc.Choreography");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RCURLY_10=(Token)match(input,RULE_RCURLY,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCURLY_10, grammarAccess.getIfThenElseAccess().getRCURLYTerminalRuleCall_9()); 
                  
            }
            // InternalAioc.g:1738:1: (otherlv_11= 'else' this_LCURLY_12= RULE_LCURLY ( (lv_else_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==52) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAioc.g:1738:3: otherlv_11= 'else' this_LCURLY_12= RULE_LCURLY ( (lv_else_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY
                    {
                    otherlv_11=(Token)match(input,52,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getIfThenElseAccess().getElseKeyword_10_0());
                          
                    }
                    this_LCURLY_12=(Token)match(input,RULE_LCURLY,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LCURLY_12, grammarAccess.getIfThenElseAccess().getLCURLYTerminalRuleCall_10_1()); 
                          
                    }
                    // InternalAioc.g:1746:1: ( (lv_else_13_0= ruleChoreography ) )
                    // InternalAioc.g:1747:1: (lv_else_13_0= ruleChoreography )
                    {
                    // InternalAioc.g:1747:1: (lv_else_13_0= ruleChoreography )
                    // InternalAioc.g:1748:3: lv_else_13_0= ruleChoreography
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfThenElseAccess().getElseChoreographyParserRuleCall_10_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_7);
                    lv_else_13_0=ruleChoreography();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_13_0, 
                              		"org.Aioc.Choreography");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RCURLY_14=(Token)match(input,RULE_RCURLY,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RCURLY_14, grammarAccess.getIfThenElseAccess().getRCURLYTerminalRuleCall_10_3()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfThenElse"


    // $ANTLR start "entryRuleWhile"
    // InternalAioc.g:1776:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalAioc.g:1777:2: (iv_ruleWhile= ruleWhile EOF )
            // InternalAioc.g:1778:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalAioc.g:1785:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' this_LRND_1= RULE_LRND ( (lv_condition_2_0= ruleCondition ) ) this_RRND_3= RULE_RRND this_AT_4= RULE_AT ( (lv_thread_5_0= RULE_ID ) ) this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY (this_LCURLY_9= RULE_LCURLY ( (lv_key_10_0= RULE_ID ) ) this_RCURLY_11= RULE_RCURLY )? ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LRND_1=null;
        Token this_RRND_3=null;
        Token this_AT_4=null;
        Token lv_thread_5_0=null;
        Token this_LCURLY_6=null;
        Token this_RCURLY_8=null;
        Token this_LCURLY_9=null;
        Token lv_key_10_0=null;
        Token this_RCURLY_11=null;
        EObject lv_condition_2_0 = null;

        EObject lv_choreography_7_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:1788:28: ( (otherlv_0= 'while' this_LRND_1= RULE_LRND ( (lv_condition_2_0= ruleCondition ) ) this_RRND_3= RULE_RRND this_AT_4= RULE_AT ( (lv_thread_5_0= RULE_ID ) ) this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY (this_LCURLY_9= RULE_LCURLY ( (lv_key_10_0= RULE_ID ) ) this_RCURLY_11= RULE_RCURLY )? ) )
            // InternalAioc.g:1789:1: (otherlv_0= 'while' this_LRND_1= RULE_LRND ( (lv_condition_2_0= ruleCondition ) ) this_RRND_3= RULE_RRND this_AT_4= RULE_AT ( (lv_thread_5_0= RULE_ID ) ) this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY (this_LCURLY_9= RULE_LCURLY ( (lv_key_10_0= RULE_ID ) ) this_RCURLY_11= RULE_RCURLY )? )
            {
            // InternalAioc.g:1789:1: (otherlv_0= 'while' this_LRND_1= RULE_LRND ( (lv_condition_2_0= ruleCondition ) ) this_RRND_3= RULE_RRND this_AT_4= RULE_AT ( (lv_thread_5_0= RULE_ID ) ) this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY (this_LCURLY_9= RULE_LCURLY ( (lv_key_10_0= RULE_ID ) ) this_RCURLY_11= RULE_RCURLY )? )
            // InternalAioc.g:1789:3: otherlv_0= 'while' this_LRND_1= RULE_LRND ( (lv_condition_2_0= ruleCondition ) ) this_RRND_3= RULE_RRND this_AT_4= RULE_AT ( (lv_thread_5_0= RULE_ID ) ) this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY (this_LCURLY_9= RULE_LCURLY ( (lv_key_10_0= RULE_ID ) ) this_RCURLY_11= RULE_RCURLY )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
                  
            }
            this_LRND_1=(Token)match(input,RULE_LRND,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LRND_1, grammarAccess.getWhileAccess().getLRNDTerminalRuleCall_1()); 
                  
            }
            // InternalAioc.g:1797:1: ( (lv_condition_2_0= ruleCondition ) )
            // InternalAioc.g:1798:1: (lv_condition_2_0= ruleCondition )
            {
            // InternalAioc.g:1798:1: (lv_condition_2_0= ruleCondition )
            // InternalAioc.g:1799:3: lv_condition_2_0= ruleCondition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getConditionConditionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_14);
            lv_condition_2_0=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_2_0, 
                      		"org.Aioc.Condition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RRND_3=(Token)match(input,RULE_RRND,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RRND_3, grammarAccess.getWhileAccess().getRRNDTerminalRuleCall_3()); 
                  
            }
            this_AT_4=(Token)match(input,RULE_AT,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_AT_4, grammarAccess.getWhileAccess().getATTerminalRuleCall_4()); 
                  
            }
            // InternalAioc.g:1823:1: ( (lv_thread_5_0= RULE_ID ) )
            // InternalAioc.g:1824:1: (lv_thread_5_0= RULE_ID )
            {
            // InternalAioc.g:1824:1: (lv_thread_5_0= RULE_ID )
            // InternalAioc.g:1825:3: lv_thread_5_0= RULE_ID
            {
            lv_thread_5_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_thread_5_0, grammarAccess.getWhileAccess().getThreadIDTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getWhileRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"thread",
                      		lv_thread_5_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            this_LCURLY_6=(Token)match(input,RULE_LCURLY,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCURLY_6, grammarAccess.getWhileAccess().getLCURLYTerminalRuleCall_6()); 
                  
            }
            // InternalAioc.g:1845:1: ( (lv_choreography_7_0= ruleChoreography ) )
            // InternalAioc.g:1846:1: (lv_choreography_7_0= ruleChoreography )
            {
            // InternalAioc.g:1846:1: (lv_choreography_7_0= ruleChoreography )
            // InternalAioc.g:1847:3: lv_choreography_7_0= ruleChoreography
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getChoreographyChoreographyParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_choreography_7_0=ruleChoreography();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileRule());
              	        }
                     		set(
                     			current, 
                     			"choreography",
                      		lv_choreography_7_0, 
                      		"org.Aioc.Choreography");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RCURLY_8=(Token)match(input,RULE_RCURLY,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCURLY_8, grammarAccess.getWhileAccess().getRCURLYTerminalRuleCall_8()); 
                  
            }
            // InternalAioc.g:1867:1: (this_LCURLY_9= RULE_LCURLY ( (lv_key_10_0= RULE_ID ) ) this_RCURLY_11= RULE_RCURLY )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_LCURLY) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAioc.g:1867:2: this_LCURLY_9= RULE_LCURLY ( (lv_key_10_0= RULE_ID ) ) this_RCURLY_11= RULE_RCURLY
                    {
                    this_LCURLY_9=(Token)match(input,RULE_LCURLY,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LCURLY_9, grammarAccess.getWhileAccess().getLCURLYTerminalRuleCall_9_0()); 
                          
                    }
                    // InternalAioc.g:1871:1: ( (lv_key_10_0= RULE_ID ) )
                    // InternalAioc.g:1872:1: (lv_key_10_0= RULE_ID )
                    {
                    // InternalAioc.g:1872:1: (lv_key_10_0= RULE_ID )
                    // InternalAioc.g:1873:3: lv_key_10_0= RULE_ID
                    {
                    lv_key_10_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_key_10_0, grammarAccess.getWhileAccess().getKeyIDTerminalRuleCall_9_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getWhileRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"key",
                              		lv_key_10_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    this_RCURLY_11=(Token)match(input,RULE_RCURLY,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RCURLY_11, grammarAccess.getWhileAccess().getRCURLYTerminalRuleCall_9_2()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleScope"
    // InternalAioc.g:1901:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalAioc.g:1902:2: (iv_ruleScope= ruleScope EOF )
            // InternalAioc.g:1903:2: iv_ruleScope= ruleScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScope=ruleScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScope; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalAioc.g:1910:1: ruleScope returns [EObject current=null] : (otherlv_0= 'scope' this_AT_1= RULE_AT ( (lv_thread_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_choreography_4_0= ruleChoreography ) ) this_RCURLY_5= RULE_RCURLY (otherlv_6= 'prop' this_LCURLY_7= RULE_LCURLY ( (lv_properties_8_0= ruleAssignmentSet ) ) this_RCURLY_9= RULE_RCURLY )? (otherlv_10= 'roles' this_LCURLY_11= RULE_LCURLY ( (lv_roles_12_0= ruleRoles ) ) this_RCURLY_13= RULE_RCURLY )? (this_LCURLY_14= RULE_LCURLY ( (lv_key_15_0= RULE_ID ) ) this_RCURLY_16= RULE_RCURLY )? ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_AT_1=null;
        Token lv_thread_2_0=null;
        Token this_LCURLY_3=null;
        Token this_RCURLY_5=null;
        Token otherlv_6=null;
        Token this_LCURLY_7=null;
        Token this_RCURLY_9=null;
        Token otherlv_10=null;
        Token this_LCURLY_11=null;
        Token this_RCURLY_13=null;
        Token this_LCURLY_14=null;
        Token lv_key_15_0=null;
        Token this_RCURLY_16=null;
        EObject lv_choreography_4_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_roles_12_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:1913:28: ( (otherlv_0= 'scope' this_AT_1= RULE_AT ( (lv_thread_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_choreography_4_0= ruleChoreography ) ) this_RCURLY_5= RULE_RCURLY (otherlv_6= 'prop' this_LCURLY_7= RULE_LCURLY ( (lv_properties_8_0= ruleAssignmentSet ) ) this_RCURLY_9= RULE_RCURLY )? (otherlv_10= 'roles' this_LCURLY_11= RULE_LCURLY ( (lv_roles_12_0= ruleRoles ) ) this_RCURLY_13= RULE_RCURLY )? (this_LCURLY_14= RULE_LCURLY ( (lv_key_15_0= RULE_ID ) ) this_RCURLY_16= RULE_RCURLY )? ) )
            // InternalAioc.g:1914:1: (otherlv_0= 'scope' this_AT_1= RULE_AT ( (lv_thread_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_choreography_4_0= ruleChoreography ) ) this_RCURLY_5= RULE_RCURLY (otherlv_6= 'prop' this_LCURLY_7= RULE_LCURLY ( (lv_properties_8_0= ruleAssignmentSet ) ) this_RCURLY_9= RULE_RCURLY )? (otherlv_10= 'roles' this_LCURLY_11= RULE_LCURLY ( (lv_roles_12_0= ruleRoles ) ) this_RCURLY_13= RULE_RCURLY )? (this_LCURLY_14= RULE_LCURLY ( (lv_key_15_0= RULE_ID ) ) this_RCURLY_16= RULE_RCURLY )? )
            {
            // InternalAioc.g:1914:1: (otherlv_0= 'scope' this_AT_1= RULE_AT ( (lv_thread_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_choreography_4_0= ruleChoreography ) ) this_RCURLY_5= RULE_RCURLY (otherlv_6= 'prop' this_LCURLY_7= RULE_LCURLY ( (lv_properties_8_0= ruleAssignmentSet ) ) this_RCURLY_9= RULE_RCURLY )? (otherlv_10= 'roles' this_LCURLY_11= RULE_LCURLY ( (lv_roles_12_0= ruleRoles ) ) this_RCURLY_13= RULE_RCURLY )? (this_LCURLY_14= RULE_LCURLY ( (lv_key_15_0= RULE_ID ) ) this_RCURLY_16= RULE_RCURLY )? )
            // InternalAioc.g:1914:3: otherlv_0= 'scope' this_AT_1= RULE_AT ( (lv_thread_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_choreography_4_0= ruleChoreography ) ) this_RCURLY_5= RULE_RCURLY (otherlv_6= 'prop' this_LCURLY_7= RULE_LCURLY ( (lv_properties_8_0= ruleAssignmentSet ) ) this_RCURLY_9= RULE_RCURLY )? (otherlv_10= 'roles' this_LCURLY_11= RULE_LCURLY ( (lv_roles_12_0= ruleRoles ) ) this_RCURLY_13= RULE_RCURLY )? (this_LCURLY_14= RULE_LCURLY ( (lv_key_15_0= RULE_ID ) ) this_RCURLY_16= RULE_RCURLY )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getScopeAccess().getScopeKeyword_0());
                  
            }
            this_AT_1=(Token)match(input,RULE_AT,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_AT_1, grammarAccess.getScopeAccess().getATTerminalRuleCall_1()); 
                  
            }
            // InternalAioc.g:1922:1: ( (lv_thread_2_0= RULE_ID ) )
            // InternalAioc.g:1923:1: (lv_thread_2_0= RULE_ID )
            {
            // InternalAioc.g:1923:1: (lv_thread_2_0= RULE_ID )
            // InternalAioc.g:1924:3: lv_thread_2_0= RULE_ID
            {
            lv_thread_2_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_thread_2_0, grammarAccess.getScopeAccess().getThreadIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getScopeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"thread",
                      		lv_thread_2_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            this_LCURLY_3=(Token)match(input,RULE_LCURLY,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCURLY_3, grammarAccess.getScopeAccess().getLCURLYTerminalRuleCall_3()); 
                  
            }
            // InternalAioc.g:1944:1: ( (lv_choreography_4_0= ruleChoreography ) )
            // InternalAioc.g:1945:1: (lv_choreography_4_0= ruleChoreography )
            {
            // InternalAioc.g:1945:1: (lv_choreography_4_0= ruleChoreography )
            // InternalAioc.g:1946:3: lv_choreography_4_0= ruleChoreography
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScopeAccess().getChoreographyChoreographyParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_choreography_4_0=ruleChoreography();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScopeRule());
              	        }
                     		set(
                     			current, 
                     			"choreography",
                      		lv_choreography_4_0, 
                      		"org.Aioc.Choreography");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RCURLY_5=(Token)match(input,RULE_RCURLY,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCURLY_5, grammarAccess.getScopeAccess().getRCURLYTerminalRuleCall_5()); 
                  
            }
            // InternalAioc.g:1966:1: (otherlv_6= 'prop' this_LCURLY_7= RULE_LCURLY ( (lv_properties_8_0= ruleAssignmentSet ) ) this_RCURLY_9= RULE_RCURLY )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==55) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAioc.g:1966:3: otherlv_6= 'prop' this_LCURLY_7= RULE_LCURLY ( (lv_properties_8_0= ruleAssignmentSet ) ) this_RCURLY_9= RULE_RCURLY
                    {
                    otherlv_6=(Token)match(input,55,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getScopeAccess().getPropKeyword_6_0());
                          
                    }
                    this_LCURLY_7=(Token)match(input,RULE_LCURLY,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LCURLY_7, grammarAccess.getScopeAccess().getLCURLYTerminalRuleCall_6_1()); 
                          
                    }
                    // InternalAioc.g:1974:1: ( (lv_properties_8_0= ruleAssignmentSet ) )
                    // InternalAioc.g:1975:1: (lv_properties_8_0= ruleAssignmentSet )
                    {
                    // InternalAioc.g:1975:1: (lv_properties_8_0= ruleAssignmentSet )
                    // InternalAioc.g:1976:3: lv_properties_8_0= ruleAssignmentSet
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScopeAccess().getPropertiesAssignmentSetParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_7);
                    lv_properties_8_0=ruleAssignmentSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScopeRule());
                      	        }
                             		set(
                             			current, 
                             			"properties",
                              		lv_properties_8_0, 
                              		"org.Aioc.AssignmentSet");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RCURLY_9=(Token)match(input,RULE_RCURLY,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RCURLY_9, grammarAccess.getScopeAccess().getRCURLYTerminalRuleCall_6_3()); 
                          
                    }

                    }
                    break;

            }

            // InternalAioc.g:1996:3: (otherlv_10= 'roles' this_LCURLY_11= RULE_LCURLY ( (lv_roles_12_0= ruleRoles ) ) this_RCURLY_13= RULE_RCURLY )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==56) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAioc.g:1996:5: otherlv_10= 'roles' this_LCURLY_11= RULE_LCURLY ( (lv_roles_12_0= ruleRoles ) ) this_RCURLY_13= RULE_RCURLY
                    {
                    otherlv_10=(Token)match(input,56,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getScopeAccess().getRolesKeyword_7_0());
                          
                    }
                    this_LCURLY_11=(Token)match(input,RULE_LCURLY,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LCURLY_11, grammarAccess.getScopeAccess().getLCURLYTerminalRuleCall_7_1()); 
                          
                    }
                    // InternalAioc.g:2004:1: ( (lv_roles_12_0= ruleRoles ) )
                    // InternalAioc.g:2005:1: (lv_roles_12_0= ruleRoles )
                    {
                    // InternalAioc.g:2005:1: (lv_roles_12_0= ruleRoles )
                    // InternalAioc.g:2006:3: lv_roles_12_0= ruleRoles
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScopeAccess().getRolesRolesParserRuleCall_7_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_7);
                    lv_roles_12_0=ruleRoles();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScopeRule());
                      	        }
                             		set(
                             			current, 
                             			"roles",
                              		lv_roles_12_0, 
                              		"org.Aioc.Roles");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RCURLY_13=(Token)match(input,RULE_RCURLY,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RCURLY_13, grammarAccess.getScopeAccess().getRCURLYTerminalRuleCall_7_3()); 
                          
                    }

                    }
                    break;

            }

            // InternalAioc.g:2026:3: (this_LCURLY_14= RULE_LCURLY ( (lv_key_15_0= RULE_ID ) ) this_RCURLY_16= RULE_RCURLY )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_LCURLY) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAioc.g:2026:4: this_LCURLY_14= RULE_LCURLY ( (lv_key_15_0= RULE_ID ) ) this_RCURLY_16= RULE_RCURLY
                    {
                    this_LCURLY_14=(Token)match(input,RULE_LCURLY,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LCURLY_14, grammarAccess.getScopeAccess().getLCURLYTerminalRuleCall_8_0()); 
                          
                    }
                    // InternalAioc.g:2030:1: ( (lv_key_15_0= RULE_ID ) )
                    // InternalAioc.g:2031:1: (lv_key_15_0= RULE_ID )
                    {
                    // InternalAioc.g:2031:1: (lv_key_15_0= RULE_ID )
                    // InternalAioc.g:2032:3: lv_key_15_0= RULE_ID
                    {
                    lv_key_15_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_key_15_0, grammarAccess.getScopeAccess().getKeyIDTerminalRuleCall_8_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScopeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"key",
                              		lv_key_15_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    this_RCURLY_16=(Token)match(input,RULE_RCURLY,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RCURLY_16, grammarAccess.getScopeAccess().getRCURLYTerminalRuleCall_8_2()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleRoles"
    // InternalAioc.g:2060:1: entryRuleRoles returns [EObject current=null] : iv_ruleRoles= ruleRoles EOF ;
    public final EObject entryRuleRoles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoles = null;


        try {
            // InternalAioc.g:2061:2: (iv_ruleRoles= ruleRoles EOF )
            // InternalAioc.g:2062:2: iv_ruleRoles= ruleRoles EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRolesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRoles=ruleRoles();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoles; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoles"


    // $ANTLR start "ruleRoles"
    // InternalAioc.g:2069:1: ruleRoles returns [EObject current=null] : ( ( (lv_roles_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_roles_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleRoles() throws RecognitionException {
        EObject current = null;

        Token lv_roles_0_0=null;
        Token this_COMMA_1=null;
        Token lv_roles_2_0=null;

         enterRule(); 
            
        try {
            // InternalAioc.g:2072:28: ( ( ( (lv_roles_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_roles_2_0= RULE_ID ) ) )* ) )
            // InternalAioc.g:2073:1: ( ( (lv_roles_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_roles_2_0= RULE_ID ) ) )* )
            {
            // InternalAioc.g:2073:1: ( ( (lv_roles_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_roles_2_0= RULE_ID ) ) )* )
            // InternalAioc.g:2073:2: ( (lv_roles_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_roles_2_0= RULE_ID ) ) )*
            {
            // InternalAioc.g:2073:2: ( (lv_roles_0_0= RULE_ID ) )
            // InternalAioc.g:2074:1: (lv_roles_0_0= RULE_ID )
            {
            // InternalAioc.g:2074:1: (lv_roles_0_0= RULE_ID )
            // InternalAioc.g:2075:3: lv_roles_0_0= RULE_ID
            {
            lv_roles_0_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_roles_0_0, grammarAccess.getRolesAccess().getRolesIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRolesRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"roles",
                      		lv_roles_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalAioc.g:2091:2: (this_COMMA_1= RULE_COMMA ( (lv_roles_2_0= RULE_ID ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_COMMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAioc.g:2091:3: this_COMMA_1= RULE_COMMA ( (lv_roles_2_0= RULE_ID ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getRolesAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // InternalAioc.g:2095:1: ( (lv_roles_2_0= RULE_ID ) )
            	    // InternalAioc.g:2096:1: (lv_roles_2_0= RULE_ID )
            	    {
            	    // InternalAioc.g:2096:1: (lv_roles_2_0= RULE_ID )
            	    // InternalAioc.g:2097:3: lv_roles_2_0= RULE_ID
            	    {
            	    lv_roles_2_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_roles_2_0, grammarAccess.getRolesAccess().getRolesIDTerminalRuleCall_1_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRolesRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"roles",
            	              		lv_roles_2_0, 
            	              		"org.eclipse.xtext.common.Terminals.ID");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoles"


    // $ANTLR start "entryRuleNestedChoreography"
    // InternalAioc.g:2121:1: entryRuleNestedChoreography returns [EObject current=null] : iv_ruleNestedChoreography= ruleNestedChoreography EOF ;
    public final EObject entryRuleNestedChoreography() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedChoreography = null;


        try {
            // InternalAioc.g:2122:2: (iv_ruleNestedChoreography= ruleNestedChoreography EOF )
            // InternalAioc.g:2123:2: iv_ruleNestedChoreography= ruleNestedChoreography EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedChoreographyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNestedChoreography=ruleNestedChoreography();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedChoreography; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNestedChoreography"


    // $ANTLR start "ruleNestedChoreography"
    // InternalAioc.g:2130:1: ruleNestedChoreography returns [EObject current=null] : (this_LCURLY_0= RULE_LCURLY ( (lv_choreography_1_0= ruleChoreography ) ) this_RCURLY_2= RULE_RCURLY ) ;
    public final EObject ruleNestedChoreography() throws RecognitionException {
        EObject current = null;

        Token this_LCURLY_0=null;
        Token this_RCURLY_2=null;
        EObject lv_choreography_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:2133:28: ( (this_LCURLY_0= RULE_LCURLY ( (lv_choreography_1_0= ruleChoreography ) ) this_RCURLY_2= RULE_RCURLY ) )
            // InternalAioc.g:2134:1: (this_LCURLY_0= RULE_LCURLY ( (lv_choreography_1_0= ruleChoreography ) ) this_RCURLY_2= RULE_RCURLY )
            {
            // InternalAioc.g:2134:1: (this_LCURLY_0= RULE_LCURLY ( (lv_choreography_1_0= ruleChoreography ) ) this_RCURLY_2= RULE_RCURLY )
            // InternalAioc.g:2134:2: this_LCURLY_0= RULE_LCURLY ( (lv_choreography_1_0= ruleChoreography ) ) this_RCURLY_2= RULE_RCURLY
            {
            this_LCURLY_0=(Token)match(input,RULE_LCURLY,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCURLY_0, grammarAccess.getNestedChoreographyAccess().getLCURLYTerminalRuleCall_0()); 
                  
            }
            // InternalAioc.g:2138:1: ( (lv_choreography_1_0= ruleChoreography ) )
            // InternalAioc.g:2139:1: (lv_choreography_1_0= ruleChoreography )
            {
            // InternalAioc.g:2139:1: (lv_choreography_1_0= ruleChoreography )
            // InternalAioc.g:2140:3: lv_choreography_1_0= ruleChoreography
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNestedChoreographyAccess().getChoreographyChoreographyParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_choreography_1_0=ruleChoreography();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNestedChoreographyRule());
              	        }
                     		set(
                     			current, 
                     			"choreography",
                      		lv_choreography_1_0, 
                      		"org.Aioc.Choreography");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RCURLY_2=(Token)match(input,RULE_RCURLY,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCURLY_2, grammarAccess.getNestedChoreographyAccess().getRCURLYTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNestedChoreography"


    // $ANTLR start "entryRuleAssignmentSet"
    // InternalAioc.g:2168:1: entryRuleAssignmentSet returns [EObject current=null] : iv_ruleAssignmentSet= ruleAssignmentSet EOF ;
    public final EObject entryRuleAssignmentSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentSet = null;


        try {
            // InternalAioc.g:2169:2: (iv_ruleAssignmentSet= ruleAssignmentSet EOF )
            // InternalAioc.g:2170:2: iv_ruleAssignmentSet= ruleAssignmentSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentSetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignmentSet=ruleAssignmentSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentSet; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignmentSet"


    // $ANTLR start "ruleAssignmentSet"
    // InternalAioc.g:2177:1: ruleAssignmentSet returns [EObject current=null] : ( ( (lv_assignment_0_0= ruleAssignment ) ) (this_COMMA_1= RULE_COMMA ( (lv_continuation_2_0= ruleAssignmentSet ) ) )? ) ;
    public final EObject ruleAssignmentSet() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        EObject lv_assignment_0_0 = null;

        EObject lv_continuation_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:2180:28: ( ( ( (lv_assignment_0_0= ruleAssignment ) ) (this_COMMA_1= RULE_COMMA ( (lv_continuation_2_0= ruleAssignmentSet ) ) )? ) )
            // InternalAioc.g:2181:1: ( ( (lv_assignment_0_0= ruleAssignment ) ) (this_COMMA_1= RULE_COMMA ( (lv_continuation_2_0= ruleAssignmentSet ) ) )? )
            {
            // InternalAioc.g:2181:1: ( ( (lv_assignment_0_0= ruleAssignment ) ) (this_COMMA_1= RULE_COMMA ( (lv_continuation_2_0= ruleAssignmentSet ) ) )? )
            // InternalAioc.g:2181:2: ( (lv_assignment_0_0= ruleAssignment ) ) (this_COMMA_1= RULE_COMMA ( (lv_continuation_2_0= ruleAssignmentSet ) ) )?
            {
            // InternalAioc.g:2181:2: ( (lv_assignment_0_0= ruleAssignment ) )
            // InternalAioc.g:2182:1: (lv_assignment_0_0= ruleAssignment )
            {
            // InternalAioc.g:2182:1: (lv_assignment_0_0= ruleAssignment )
            // InternalAioc.g:2183:3: lv_assignment_0_0= ruleAssignment
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentSetAccess().getAssignmentAssignmentParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_23);
            lv_assignment_0_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentSetRule());
              	        }
                     		set(
                     			current, 
                     			"assignment",
                      		lv_assignment_0_0, 
                      		"org.Aioc.Assignment");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAioc.g:2199:2: (this_COMMA_1= RULE_COMMA ( (lv_continuation_2_0= ruleAssignmentSet ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_COMMA) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAioc.g:2199:3: this_COMMA_1= RULE_COMMA ( (lv_continuation_2_0= ruleAssignmentSet ) )
                    {
                    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_1, grammarAccess.getAssignmentSetAccess().getCOMMATerminalRuleCall_1_0()); 
                          
                    }
                    // InternalAioc.g:2203:1: ( (lv_continuation_2_0= ruleAssignmentSet ) )
                    // InternalAioc.g:2204:1: (lv_continuation_2_0= ruleAssignmentSet )
                    {
                    // InternalAioc.g:2204:1: (lv_continuation_2_0= ruleAssignmentSet )
                    // InternalAioc.g:2205:3: lv_continuation_2_0= ruleAssignmentSet
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentSetAccess().getContinuationAssignmentSetParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_continuation_2_0=ruleAssignmentSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignmentSetRule());
                      	        }
                             		set(
                             			current, 
                             			"continuation",
                              		lv_continuation_2_0, 
                              		"org.Aioc.AssignmentSet");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignmentSet"


    // $ANTLR start "entryRuleAssignment"
    // InternalAioc.g:2229:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalAioc.g:2230:2: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalAioc.g:2231:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalAioc.g:2238:1: ruleAssignment returns [EObject current=null] : (otherlv_0= 'N.' ( (lv_variable_1_0= RULE_ID ) ) this_ASSIGN_2= RULE_ASSIGN ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;
        Token this_ASSIGN_2=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:2241:28: ( (otherlv_0= 'N.' ( (lv_variable_1_0= RULE_ID ) ) this_ASSIGN_2= RULE_ASSIGN ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalAioc.g:2242:1: (otherlv_0= 'N.' ( (lv_variable_1_0= RULE_ID ) ) this_ASSIGN_2= RULE_ASSIGN ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalAioc.g:2242:1: (otherlv_0= 'N.' ( (lv_variable_1_0= RULE_ID ) ) this_ASSIGN_2= RULE_ASSIGN ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalAioc.g:2242:3: otherlv_0= 'N.' ( (lv_variable_1_0= RULE_ID ) ) this_ASSIGN_2= RULE_ASSIGN ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getNKeyword_0());
                  
            }
            // InternalAioc.g:2246:1: ( (lv_variable_1_0= RULE_ID ) )
            // InternalAioc.g:2247:1: (lv_variable_1_0= RULE_ID )
            {
            // InternalAioc.g:2247:1: (lv_variable_1_0= RULE_ID )
            // InternalAioc.g:2248:3: lv_variable_1_0= RULE_ID
            {
            lv_variable_1_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_variable_1_0, grammarAccess.getAssignmentAccess().getVariableIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"variable",
                      		lv_variable_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            this_ASSIGN_2=(Token)match(input,RULE_ASSIGN,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ASSIGN_2, grammarAccess.getAssignmentAccess().getASSIGNTerminalRuleCall_2()); 
                  
            }
            // InternalAioc.g:2268:1: ( (lv_expression_3_0= ruleExpression ) )
            // InternalAioc.g:2269:1: (lv_expression_3_0= ruleExpression )
            {
            // InternalAioc.g:2269:1: (lv_expression_3_0= ruleExpression )
            // InternalAioc.g:2270:3: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"org.Aioc.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleExpression"
    // InternalAioc.g:2294:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAioc.g:2295:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalAioc.g:2296:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalAioc.g:2303:1: ruleExpression returns [EObject current=null] : ( (lv_sumExpression_0_0= ruleSumExpression ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_sumExpression_0_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:2306:28: ( ( (lv_sumExpression_0_0= ruleSumExpression ) ) )
            // InternalAioc.g:2307:1: ( (lv_sumExpression_0_0= ruleSumExpression ) )
            {
            // InternalAioc.g:2307:1: ( (lv_sumExpression_0_0= ruleSumExpression ) )
            // InternalAioc.g:2308:1: (lv_sumExpression_0_0= ruleSumExpression )
            {
            // InternalAioc.g:2308:1: (lv_sumExpression_0_0= ruleSumExpression )
            // InternalAioc.g:2309:3: lv_sumExpression_0_0= ruleSumExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionAccess().getSumExpressionSumExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_sumExpression_0_0=ruleSumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"sumExpression",
                      		lv_sumExpression_0_0, 
                      		"org.Aioc.SumExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSumExpression"
    // InternalAioc.g:2333:1: entryRuleSumExpression returns [EObject current=null] : iv_ruleSumExpression= ruleSumExpression EOF ;
    public final EObject entryRuleSumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumExpression = null;


        try {
            // InternalAioc.g:2334:2: (iv_ruleSumExpression= ruleSumExpression EOF )
            // InternalAioc.g:2335:2: iv_ruleSumExpression= ruleSumExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSumExpression=ruleSumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSumExpression"


    // $ANTLR start "ruleSumExpression"
    // InternalAioc.g:2342:1: ruleSumExpression returns [EObject current=null] : ( ( (lv_children_0_0= ruleExpressionBasicTerm ) ) ( (lv_children_1_0= ruleSumExpressionTerm ) )* ) ;
    public final EObject ruleSumExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_children_0_0 = null;

        EObject lv_children_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:2345:28: ( ( ( (lv_children_0_0= ruleExpressionBasicTerm ) ) ( (lv_children_1_0= ruleSumExpressionTerm ) )* ) )
            // InternalAioc.g:2346:1: ( ( (lv_children_0_0= ruleExpressionBasicTerm ) ) ( (lv_children_1_0= ruleSumExpressionTerm ) )* )
            {
            // InternalAioc.g:2346:1: ( ( (lv_children_0_0= ruleExpressionBasicTerm ) ) ( (lv_children_1_0= ruleSumExpressionTerm ) )* )
            // InternalAioc.g:2346:2: ( (lv_children_0_0= ruleExpressionBasicTerm ) ) ( (lv_children_1_0= ruleSumExpressionTerm ) )*
            {
            // InternalAioc.g:2346:2: ( (lv_children_0_0= ruleExpressionBasicTerm ) )
            // InternalAioc.g:2347:1: (lv_children_0_0= ruleExpressionBasicTerm )
            {
            // InternalAioc.g:2347:1: (lv_children_0_0= ruleExpressionBasicTerm )
            // InternalAioc.g:2348:3: lv_children_0_0= ruleExpressionBasicTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumExpressionAccess().getChildrenExpressionBasicTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_41);
            lv_children_0_0=ruleExpressionBasicTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSumExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"children",
                      		lv_children_0_0, 
                      		"org.Aioc.ExpressionBasicTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAioc.g:2364:2: ( (lv_children_1_0= ruleSumExpressionTerm ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_PLUS && LA28_0<=RULE_MINUS)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAioc.g:2365:1: (lv_children_1_0= ruleSumExpressionTerm )
            	    {
            	    // InternalAioc.g:2365:1: (lv_children_1_0= ruleSumExpressionTerm )
            	    // InternalAioc.g:2366:3: lv_children_1_0= ruleSumExpressionTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSumExpressionAccess().getChildrenSumExpressionTermParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_children_1_0=ruleSumExpressionTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSumExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"children",
            	              		lv_children_1_0, 
            	              		"org.Aioc.SumExpressionTerm");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSumExpression"


    // $ANTLR start "entryRuleSumExpressionTerm"
    // InternalAioc.g:2390:1: entryRuleSumExpressionTerm returns [EObject current=null] : iv_ruleSumExpressionTerm= ruleSumExpressionTerm EOF ;
    public final EObject entryRuleSumExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumExpressionTerm = null;


        try {
            // InternalAioc.g:2391:2: (iv_ruleSumExpressionTerm= ruleSumExpressionTerm EOF )
            // InternalAioc.g:2392:2: iv_ruleSumExpressionTerm= ruleSumExpressionTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumExpressionTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSumExpressionTerm=ruleSumExpressionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumExpressionTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSumExpressionTerm"


    // $ANTLR start "ruleSumExpressionTerm"
    // InternalAioc.g:2399:1: ruleSumExpressionTerm returns [EObject current=null] : ( ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) ) | ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) ) ) ;
    public final EObject ruleSumExpressionTerm() throws RecognitionException {
        EObject current = null;

        Token this_PLUS_1=null;
        Token this_MINUS_4=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:2402:28: ( ( ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) ) | ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) ) ) )
            // InternalAioc.g:2403:1: ( ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) ) | ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) ) )
            {
            // InternalAioc.g:2403:1: ( ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) ) | ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_PLUS) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_MINUS) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalAioc.g:2403:2: ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) )
                    {
                    // InternalAioc.g:2403:2: ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) )
                    // InternalAioc.g:2403:3: () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) )
                    {
                    // InternalAioc.g:2403:3: ()
                    // InternalAioc.g:2404:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSumExpressionTermAccess().getSumExpressionAddTermAction_0_0(),
                                  current);
                          
                    }

                    }

                    this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_1, grammarAccess.getSumExpressionTermAccess().getPLUSTerminalRuleCall_0_1()); 
                          
                    }
                    // InternalAioc.g:2413:1: ( (lv_expression_2_0= ruleExpressionBasicTerm ) )
                    // InternalAioc.g:2414:1: (lv_expression_2_0= ruleExpressionBasicTerm )
                    {
                    // InternalAioc.g:2414:1: (lv_expression_2_0= ruleExpressionBasicTerm )
                    // InternalAioc.g:2415:3: lv_expression_2_0= ruleExpressionBasicTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSumExpressionTermAccess().getExpressionExpressionBasicTermParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleExpressionBasicTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSumExpressionTermRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"org.Aioc.ExpressionBasicTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAioc.g:2432:6: ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) )
                    {
                    // InternalAioc.g:2432:6: ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) )
                    // InternalAioc.g:2432:7: () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) )
                    {
                    // InternalAioc.g:2432:7: ()
                    // InternalAioc.g:2433:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSumExpressionTermAccess().getSumExpressionSubtractTermAction_1_0(),
                                  current);
                          
                    }

                    }

                    this_MINUS_4=(Token)match(input,RULE_MINUS,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_4, grammarAccess.getSumExpressionTermAccess().getMINUSTerminalRuleCall_1_1()); 
                          
                    }
                    // InternalAioc.g:2442:1: ( (lv_expression_5_0= ruleExpressionBasicTerm ) )
                    // InternalAioc.g:2443:1: (lv_expression_5_0= ruleExpressionBasicTerm )
                    {
                    // InternalAioc.g:2443:1: (lv_expression_5_0= ruleExpressionBasicTerm )
                    // InternalAioc.g:2444:3: lv_expression_5_0= ruleExpressionBasicTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSumExpressionTermAccess().getExpressionExpressionBasicTermParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=ruleExpressionBasicTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSumExpressionTermRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_5_0, 
                              		"org.Aioc.ExpressionBasicTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSumExpressionTerm"


    // $ANTLR start "entryRuleExpressionBasicTerm"
    // InternalAioc.g:2468:1: entryRuleExpressionBasicTerm returns [EObject current=null] : iv_ruleExpressionBasicTerm= ruleExpressionBasicTerm EOF ;
    public final EObject entryRuleExpressionBasicTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBasicTerm = null;


        try {
            // InternalAioc.g:2469:2: (iv_ruleExpressionBasicTerm= ruleExpressionBasicTerm EOF )
            // InternalAioc.g:2470:2: iv_ruleExpressionBasicTerm= ruleExpressionBasicTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionBasicTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionBasicTerm=ruleExpressionBasicTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionBasicTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionBasicTerm"


    // $ANTLR start "ruleExpressionBasicTerm"
    // InternalAioc.g:2477:1: ruleExpressionBasicTerm returns [EObject current=null] : ( ( ( (lv_not_0_0= RULE_NOT ) )? ( (lv_variable_1_0= RULE_ID ) ) ) | ( (lv_constant_2_0= ruleConstant ) ) | (this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND ) ) ;
    public final EObject ruleExpressionBasicTerm() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;
        Token lv_variable_1_0=null;
        Token this_LRND_3=null;
        Token this_RRND_5=null;
        EObject lv_constant_2_0 = null;

        EObject lv_condition_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:2480:28: ( ( ( ( (lv_not_0_0= RULE_NOT ) )? ( (lv_variable_1_0= RULE_ID ) ) ) | ( (lv_constant_2_0= ruleConstant ) ) | (this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND ) ) )
            // InternalAioc.g:2481:1: ( ( ( (lv_not_0_0= RULE_NOT ) )? ( (lv_variable_1_0= RULE_ID ) ) ) | ( (lv_constant_2_0= ruleConstant ) ) | (this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND ) )
            {
            // InternalAioc.g:2481:1: ( ( ( (lv_not_0_0= RULE_NOT ) )? ( (lv_variable_1_0= RULE_ID ) ) ) | ( (lv_constant_2_0= ruleConstant ) ) | (this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_NOT:
                {
                alt31=1;
                }
                break;
            case RULE_TRUE:
            case RULE_FALSE:
            case RULE_STRING:
            case RULE_INT:
                {
                alt31=2;
                }
                break;
            case RULE_LRND:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalAioc.g:2481:2: ( ( (lv_not_0_0= RULE_NOT ) )? ( (lv_variable_1_0= RULE_ID ) ) )
                    {
                    // InternalAioc.g:2481:2: ( ( (lv_not_0_0= RULE_NOT ) )? ( (lv_variable_1_0= RULE_ID ) ) )
                    // InternalAioc.g:2481:3: ( (lv_not_0_0= RULE_NOT ) )? ( (lv_variable_1_0= RULE_ID ) )
                    {
                    // InternalAioc.g:2481:3: ( (lv_not_0_0= RULE_NOT ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_NOT) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalAioc.g:2482:1: (lv_not_0_0= RULE_NOT )
                            {
                            // InternalAioc.g:2482:1: (lv_not_0_0= RULE_NOT )
                            // InternalAioc.g:2483:3: lv_not_0_0= RULE_NOT
                            {
                            lv_not_0_0=(Token)match(input,RULE_NOT,FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_not_0_0, grammarAccess.getExpressionBasicTermAccess().getNotNOTTerminalRuleCall_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpressionBasicTermRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"not",
                                      		true, 
                                      		"org.Aioc.NOT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalAioc.g:2499:3: ( (lv_variable_1_0= RULE_ID ) )
                    // InternalAioc.g:2500:1: (lv_variable_1_0= RULE_ID )
                    {
                    // InternalAioc.g:2500:1: (lv_variable_1_0= RULE_ID )
                    // InternalAioc.g:2501:3: lv_variable_1_0= RULE_ID
                    {
                    lv_variable_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_variable_1_0, grammarAccess.getExpressionBasicTermAccess().getVariableIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionBasicTermRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"variable",
                              		lv_variable_1_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAioc.g:2518:6: ( (lv_constant_2_0= ruleConstant ) )
                    {
                    // InternalAioc.g:2518:6: ( (lv_constant_2_0= ruleConstant ) )
                    // InternalAioc.g:2519:1: (lv_constant_2_0= ruleConstant )
                    {
                    // InternalAioc.g:2519:1: (lv_constant_2_0= ruleConstant )
                    // InternalAioc.g:2520:3: lv_constant_2_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionBasicTermAccess().getConstantConstantParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_constant_2_0=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionBasicTermRule());
                      	        }
                             		set(
                             			current, 
                             			"constant",
                              		lv_constant_2_0, 
                              		"org.Aioc.Constant");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAioc.g:2537:6: (this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND )
                    {
                    // InternalAioc.g:2537:6: (this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND )
                    // InternalAioc.g:2537:7: this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND
                    {
                    this_LRND_3=(Token)match(input,RULE_LRND,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LRND_3, grammarAccess.getExpressionBasicTermAccess().getLRNDTerminalRuleCall_2_0()); 
                          
                    }
                    // InternalAioc.g:2541:1: ( (lv_condition_4_0= ruleCondition ) )
                    // InternalAioc.g:2542:1: (lv_condition_4_0= ruleCondition )
                    {
                    // InternalAioc.g:2542:1: (lv_condition_4_0= ruleCondition )
                    // InternalAioc.g:2543:3: lv_condition_4_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionBasicTermAccess().getConditionConditionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_14);
                    lv_condition_4_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionBasicTermRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_4_0, 
                              		"org.Aioc.Condition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RRND_5=(Token)match(input,RULE_RRND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RRND_5, grammarAccess.getExpressionBasicTermAccess().getRRNDTerminalRuleCall_2_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionBasicTerm"


    // $ANTLR start "entryRuleConstant"
    // InternalAioc.g:2571:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalAioc.g:2572:2: (iv_ruleConstant= ruleConstant EOF )
            // InternalAioc.g:2573:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalAioc.g:2580:1: ruleConstant returns [EObject current=null] : ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_strValue_1_0= RULE_STRING ) ) | ( (lv_true_2_0= RULE_TRUE ) ) | ( (lv_false_3_0= RULE_FALSE ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_intValue_0_0=null;
        Token lv_strValue_1_0=null;
        Token lv_true_2_0=null;
        Token lv_false_3_0=null;

         enterRule(); 
            
        try {
            // InternalAioc.g:2583:28: ( ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_strValue_1_0= RULE_STRING ) ) | ( (lv_true_2_0= RULE_TRUE ) ) | ( (lv_false_3_0= RULE_FALSE ) ) ) )
            // InternalAioc.g:2584:1: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_strValue_1_0= RULE_STRING ) ) | ( (lv_true_2_0= RULE_TRUE ) ) | ( (lv_false_3_0= RULE_FALSE ) ) )
            {
            // InternalAioc.g:2584:1: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_strValue_1_0= RULE_STRING ) ) | ( (lv_true_2_0= RULE_TRUE ) ) | ( (lv_false_3_0= RULE_FALSE ) ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt32=1;
                }
                break;
            case RULE_STRING:
                {
                alt32=2;
                }
                break;
            case RULE_TRUE:
                {
                alt32=3;
                }
                break;
            case RULE_FALSE:
                {
                alt32=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalAioc.g:2584:2: ( (lv_intValue_0_0= RULE_INT ) )
                    {
                    // InternalAioc.g:2584:2: ( (lv_intValue_0_0= RULE_INT ) )
                    // InternalAioc.g:2585:1: (lv_intValue_0_0= RULE_INT )
                    {
                    // InternalAioc.g:2585:1: (lv_intValue_0_0= RULE_INT )
                    // InternalAioc.g:2586:3: lv_intValue_0_0= RULE_INT
                    {
                    lv_intValue_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_intValue_0_0, grammarAccess.getConstantAccess().getIntValueINTTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConstantRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"intValue",
                              		lv_intValue_0_0, 
                              		"org.eclipse.xtext.common.Terminals.INT");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAioc.g:2603:6: ( (lv_strValue_1_0= RULE_STRING ) )
                    {
                    // InternalAioc.g:2603:6: ( (lv_strValue_1_0= RULE_STRING ) )
                    // InternalAioc.g:2604:1: (lv_strValue_1_0= RULE_STRING )
                    {
                    // InternalAioc.g:2604:1: (lv_strValue_1_0= RULE_STRING )
                    // InternalAioc.g:2605:3: lv_strValue_1_0= RULE_STRING
                    {
                    lv_strValue_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_strValue_1_0, grammarAccess.getConstantAccess().getStrValueSTRINGTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConstantRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"strValue",
                              		lv_strValue_1_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAioc.g:2622:6: ( (lv_true_2_0= RULE_TRUE ) )
                    {
                    // InternalAioc.g:2622:6: ( (lv_true_2_0= RULE_TRUE ) )
                    // InternalAioc.g:2623:1: (lv_true_2_0= RULE_TRUE )
                    {
                    // InternalAioc.g:2623:1: (lv_true_2_0= RULE_TRUE )
                    // InternalAioc.g:2624:3: lv_true_2_0= RULE_TRUE
                    {
                    lv_true_2_0=(Token)match(input,RULE_TRUE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_true_2_0, grammarAccess.getConstantAccess().getTrueTRUETerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConstantRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"true",
                              		lv_true_2_0, 
                              		"org.Aioc.TRUE");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAioc.g:2641:6: ( (lv_false_3_0= RULE_FALSE ) )
                    {
                    // InternalAioc.g:2641:6: ( (lv_false_3_0= RULE_FALSE ) )
                    // InternalAioc.g:2642:1: (lv_false_3_0= RULE_FALSE )
                    {
                    // InternalAioc.g:2642:1: (lv_false_3_0= RULE_FALSE )
                    // InternalAioc.g:2643:3: lv_false_3_0= RULE_FALSE
                    {
                    lv_false_3_0=(Token)match(input,RULE_FALSE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_false_3_0, grammarAccess.getConstantAccess().getFalseFALSETerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConstantRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"false",
                              		lv_false_3_0, 
                              		"org.Aioc.FALSE");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleCondition"
    // InternalAioc.g:2667:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalAioc.g:2668:2: (iv_ruleCondition= ruleCondition EOF )
            // InternalAioc.g:2669:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalAioc.g:2676:1: ruleCondition returns [EObject current=null] : ( ( (lv_left_0_0= ruleExpression ) ) ( ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleCondition ) ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_operator_1_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:2679:28: ( ( ( (lv_left_0_0= ruleExpression ) ) ( ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleCondition ) ) )? ) )
            // InternalAioc.g:2680:1: ( ( (lv_left_0_0= ruleExpression ) ) ( ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleCondition ) ) )? )
            {
            // InternalAioc.g:2680:1: ( ( (lv_left_0_0= ruleExpression ) ) ( ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleCondition ) ) )? )
            // InternalAioc.g:2680:2: ( (lv_left_0_0= ruleExpression ) ) ( ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleCondition ) ) )?
            {
            // InternalAioc.g:2680:2: ( (lv_left_0_0= ruleExpression ) )
            // InternalAioc.g:2681:1: (lv_left_0_0= ruleExpression )
            {
            // InternalAioc.g:2681:1: (lv_left_0_0= ruleExpression )
            // InternalAioc.g:2682:3: lv_left_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionAccess().getLeftExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_42);
            lv_left_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"org.Aioc.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAioc.g:2698:2: ( ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleCondition ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_AND && LA33_0<=RULE_OR)||(LA33_0>=RULE_LT && LA33_0<=RULE_NOT_EQUAL)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAioc.g:2698:3: ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleCondition ) )
                    {
                    // InternalAioc.g:2698:3: ( (lv_operator_1_0= ruleConditionOperator ) )
                    // InternalAioc.g:2699:1: (lv_operator_1_0= ruleConditionOperator )
                    {
                    // InternalAioc.g:2699:1: (lv_operator_1_0= ruleConditionOperator )
                    // InternalAioc.g:2700:3: lv_operator_1_0= ruleConditionOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionAccess().getOperatorConditionOperatorParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_16);
                    lv_operator_1_0=ruleConditionOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_1_0, 
                              		"org.Aioc.ConditionOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAioc.g:2716:2: ( (lv_right_2_0= ruleCondition ) )
                    // InternalAioc.g:2717:1: (lv_right_2_0= ruleCondition )
                    {
                    // InternalAioc.g:2717:1: (lv_right_2_0= ruleCondition )
                    // InternalAioc.g:2718:3: lv_right_2_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionAccess().getRightConditionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_2_0, 
                              		"org.Aioc.Condition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConditionOperator"
    // InternalAioc.g:2742:1: entryRuleConditionOperator returns [EObject current=null] : iv_ruleConditionOperator= ruleConditionOperator EOF ;
    public final EObject entryRuleConditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionOperator = null;


        try {
            // InternalAioc.g:2743:2: (iv_ruleConditionOperator= ruleConditionOperator EOF )
            // InternalAioc.g:2744:2: iv_ruleConditionOperator= ruleConditionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionOperator=ruleConditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionOperator"


    // $ANTLR start "ruleConditionOperator"
    // InternalAioc.g:2751:1: ruleConditionOperator returns [EObject current=null] : ( ( (lv_lt_0_0= RULE_LT ) ) | ( (lv_leq_1_0= RULE_LEQ ) ) | ( (lv_equal_2_0= RULE_EQUAL ) ) | ( (lv_gt_3_0= RULE_GT ) ) | ( (lv_geq_4_0= RULE_GEQ ) ) | ( (lv_not_equal_5_0= RULE_NOT_EQUAL ) ) | ( (lv_and_6_0= RULE_AND ) ) | ( (lv_or_7_0= RULE_OR ) ) ) ;
    public final EObject ruleConditionOperator() throws RecognitionException {
        EObject current = null;

        Token lv_lt_0_0=null;
        Token lv_leq_1_0=null;
        Token lv_equal_2_0=null;
        Token lv_gt_3_0=null;
        Token lv_geq_4_0=null;
        Token lv_not_equal_5_0=null;
        Token lv_and_6_0=null;
        Token lv_or_7_0=null;

         enterRule(); 
            
        try {
            // InternalAioc.g:2754:28: ( ( ( (lv_lt_0_0= RULE_LT ) ) | ( (lv_leq_1_0= RULE_LEQ ) ) | ( (lv_equal_2_0= RULE_EQUAL ) ) | ( (lv_gt_3_0= RULE_GT ) ) | ( (lv_geq_4_0= RULE_GEQ ) ) | ( (lv_not_equal_5_0= RULE_NOT_EQUAL ) ) | ( (lv_and_6_0= RULE_AND ) ) | ( (lv_or_7_0= RULE_OR ) ) ) )
            // InternalAioc.g:2755:1: ( ( (lv_lt_0_0= RULE_LT ) ) | ( (lv_leq_1_0= RULE_LEQ ) ) | ( (lv_equal_2_0= RULE_EQUAL ) ) | ( (lv_gt_3_0= RULE_GT ) ) | ( (lv_geq_4_0= RULE_GEQ ) ) | ( (lv_not_equal_5_0= RULE_NOT_EQUAL ) ) | ( (lv_and_6_0= RULE_AND ) ) | ( (lv_or_7_0= RULE_OR ) ) )
            {
            // InternalAioc.g:2755:1: ( ( (lv_lt_0_0= RULE_LT ) ) | ( (lv_leq_1_0= RULE_LEQ ) ) | ( (lv_equal_2_0= RULE_EQUAL ) ) | ( (lv_gt_3_0= RULE_GT ) ) | ( (lv_geq_4_0= RULE_GEQ ) ) | ( (lv_not_equal_5_0= RULE_NOT_EQUAL ) ) | ( (lv_and_6_0= RULE_AND ) ) | ( (lv_or_7_0= RULE_OR ) ) )
            int alt34=8;
            switch ( input.LA(1) ) {
            case RULE_LT:
                {
                alt34=1;
                }
                break;
            case RULE_LEQ:
                {
                alt34=2;
                }
                break;
            case RULE_EQUAL:
                {
                alt34=3;
                }
                break;
            case RULE_GT:
                {
                alt34=4;
                }
                break;
            case RULE_GEQ:
                {
                alt34=5;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt34=6;
                }
                break;
            case RULE_AND:
                {
                alt34=7;
                }
                break;
            case RULE_OR:
                {
                alt34=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalAioc.g:2755:2: ( (lv_lt_0_0= RULE_LT ) )
                    {
                    // InternalAioc.g:2755:2: ( (lv_lt_0_0= RULE_LT ) )
                    // InternalAioc.g:2756:1: (lv_lt_0_0= RULE_LT )
                    {
                    // InternalAioc.g:2756:1: (lv_lt_0_0= RULE_LT )
                    // InternalAioc.g:2757:3: lv_lt_0_0= RULE_LT
                    {
                    lv_lt_0_0=(Token)match(input,RULE_LT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_lt_0_0, grammarAccess.getConditionOperatorAccess().getLtLTTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConditionOperatorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"lt",
                              		true, 
                              		"org.Aioc.LT");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAioc.g:2774:6: ( (lv_leq_1_0= RULE_LEQ ) )
                    {
                    // InternalAioc.g:2774:6: ( (lv_leq_1_0= RULE_LEQ ) )
                    // InternalAioc.g:2775:1: (lv_leq_1_0= RULE_LEQ )
                    {
                    // InternalAioc.g:2775:1: (lv_leq_1_0= RULE_LEQ )
                    // InternalAioc.g:2776:3: lv_leq_1_0= RULE_LEQ
                    {
                    lv_leq_1_0=(Token)match(input,RULE_LEQ,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_leq_1_0, grammarAccess.getConditionOperatorAccess().getLeqLEQTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConditionOperatorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"leq",
                              		true, 
                              		"org.Aioc.LEQ");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAioc.g:2793:6: ( (lv_equal_2_0= RULE_EQUAL ) )
                    {
                    // InternalAioc.g:2793:6: ( (lv_equal_2_0= RULE_EQUAL ) )
                    // InternalAioc.g:2794:1: (lv_equal_2_0= RULE_EQUAL )
                    {
                    // InternalAioc.g:2794:1: (lv_equal_2_0= RULE_EQUAL )
                    // InternalAioc.g:2795:3: lv_equal_2_0= RULE_EQUAL
                    {
                    lv_equal_2_0=(Token)match(input,RULE_EQUAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_equal_2_0, grammarAccess.getConditionOperatorAccess().getEqualEQUALTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConditionOperatorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"equal",
                              		true, 
                              		"org.Aioc.EQUAL");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAioc.g:2812:6: ( (lv_gt_3_0= RULE_GT ) )
                    {
                    // InternalAioc.g:2812:6: ( (lv_gt_3_0= RULE_GT ) )
                    // InternalAioc.g:2813:1: (lv_gt_3_0= RULE_GT )
                    {
                    // InternalAioc.g:2813:1: (lv_gt_3_0= RULE_GT )
                    // InternalAioc.g:2814:3: lv_gt_3_0= RULE_GT
                    {
                    lv_gt_3_0=(Token)match(input,RULE_GT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_gt_3_0, grammarAccess.getConditionOperatorAccess().getGtGTTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConditionOperatorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"gt",
                              		true, 
                              		"org.Aioc.GT");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAioc.g:2831:6: ( (lv_geq_4_0= RULE_GEQ ) )
                    {
                    // InternalAioc.g:2831:6: ( (lv_geq_4_0= RULE_GEQ ) )
                    // InternalAioc.g:2832:1: (lv_geq_4_0= RULE_GEQ )
                    {
                    // InternalAioc.g:2832:1: (lv_geq_4_0= RULE_GEQ )
                    // InternalAioc.g:2833:3: lv_geq_4_0= RULE_GEQ
                    {
                    lv_geq_4_0=(Token)match(input,RULE_GEQ,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_geq_4_0, grammarAccess.getConditionOperatorAccess().getGeqGEQTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConditionOperatorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"geq",
                              		true, 
                              		"org.Aioc.GEQ");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAioc.g:2850:6: ( (lv_not_equal_5_0= RULE_NOT_EQUAL ) )
                    {
                    // InternalAioc.g:2850:6: ( (lv_not_equal_5_0= RULE_NOT_EQUAL ) )
                    // InternalAioc.g:2851:1: (lv_not_equal_5_0= RULE_NOT_EQUAL )
                    {
                    // InternalAioc.g:2851:1: (lv_not_equal_5_0= RULE_NOT_EQUAL )
                    // InternalAioc.g:2852:3: lv_not_equal_5_0= RULE_NOT_EQUAL
                    {
                    lv_not_equal_5_0=(Token)match(input,RULE_NOT_EQUAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_not_equal_5_0, grammarAccess.getConditionOperatorAccess().getNot_equalNOT_EQUALTerminalRuleCall_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConditionOperatorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"not_equal",
                              		true, 
                              		"org.Aioc.NOT_EQUAL");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalAioc.g:2869:6: ( (lv_and_6_0= RULE_AND ) )
                    {
                    // InternalAioc.g:2869:6: ( (lv_and_6_0= RULE_AND ) )
                    // InternalAioc.g:2870:1: (lv_and_6_0= RULE_AND )
                    {
                    // InternalAioc.g:2870:1: (lv_and_6_0= RULE_AND )
                    // InternalAioc.g:2871:3: lv_and_6_0= RULE_AND
                    {
                    lv_and_6_0=(Token)match(input,RULE_AND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_and_6_0, grammarAccess.getConditionOperatorAccess().getAndANDTerminalRuleCall_6_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConditionOperatorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"and",
                              		true, 
                              		"org.Aioc.AND");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalAioc.g:2888:6: ( (lv_or_7_0= RULE_OR ) )
                    {
                    // InternalAioc.g:2888:6: ( (lv_or_7_0= RULE_OR ) )
                    // InternalAioc.g:2889:1: (lv_or_7_0= RULE_OR )
                    {
                    // InternalAioc.g:2889:1: (lv_or_7_0= RULE_OR )
                    // InternalAioc.g:2890:3: lv_or_7_0= RULE_OR
                    {
                    lv_or_7_0=(Token)match(input,RULE_OR,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_or_7_0, grammarAccess.getConditionOperatorAccess().getOrORTerminalRuleCall_7_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConditionOperatorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"or",
                              		true, 
                              		"org.Aioc.OR");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionOperator"


    // $ANTLR start "entryRuleFunction"
    // InternalAioc.g:2914:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalAioc.g:2915:2: (iv_ruleFunction= ruleFunction EOF )
            // InternalAioc.g:2916:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalAioc.g:2923:1: ruleFunction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_LRND_1= RULE_LRND ( ( (lv_params_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleExpression ) ) )* )? this_RRND_5= RULE_RRND ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_LRND_1=null;
        Token this_COMMA_3=null;
        Token this_RRND_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:2926:28: ( ( ( (lv_name_0_0= RULE_ID ) ) this_LRND_1= RULE_LRND ( ( (lv_params_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleExpression ) ) )* )? this_RRND_5= RULE_RRND ) )
            // InternalAioc.g:2927:1: ( ( (lv_name_0_0= RULE_ID ) ) this_LRND_1= RULE_LRND ( ( (lv_params_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleExpression ) ) )* )? this_RRND_5= RULE_RRND )
            {
            // InternalAioc.g:2927:1: ( ( (lv_name_0_0= RULE_ID ) ) this_LRND_1= RULE_LRND ( ( (lv_params_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleExpression ) ) )* )? this_RRND_5= RULE_RRND )
            // InternalAioc.g:2927:2: ( (lv_name_0_0= RULE_ID ) ) this_LRND_1= RULE_LRND ( ( (lv_params_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleExpression ) ) )* )? this_RRND_5= RULE_RRND
            {
            // InternalAioc.g:2927:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalAioc.g:2928:1: (lv_name_0_0= RULE_ID )
            {
            // InternalAioc.g:2928:1: (lv_name_0_0= RULE_ID )
            // InternalAioc.g:2929:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            this_LRND_1=(Token)match(input,RULE_LRND,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LRND_1, grammarAccess.getFunctionAccess().getLRNDTerminalRuleCall_1()); 
                  
            }
            // InternalAioc.g:2949:1: ( ( (lv_params_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleExpression ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_LRND||(LA36_0>=RULE_ID && LA36_0<=RULE_STRING)||(LA36_0>=RULE_NOT && LA36_0<=RULE_INT)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAioc.g:2949:2: ( (lv_params_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleExpression ) ) )*
                    {
                    // InternalAioc.g:2949:2: ( (lv_params_2_0= ruleExpression ) )
                    // InternalAioc.g:2950:1: (lv_params_2_0= ruleExpression )
                    {
                    // InternalAioc.g:2950:1: (lv_params_2_0= ruleExpression )
                    // InternalAioc.g:2951:3: lv_params_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionAccess().getParamsExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_43);
                    lv_params_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_2_0, 
                              		"org.Aioc.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAioc.g:2967:2: (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleExpression ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_COMMA) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalAioc.g:2967:3: this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleExpression ) )
                    	    {
                    	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_COMMA_3, grammarAccess.getFunctionAccess().getCOMMATerminalRuleCall_2_1_0()); 
                    	          
                    	    }
                    	    // InternalAioc.g:2971:1: ( (lv_params_4_0= ruleExpression ) )
                    	    // InternalAioc.g:2972:1: (lv_params_4_0= ruleExpression )
                    	    {
                    	    // InternalAioc.g:2972:1: (lv_params_4_0= ruleExpression )
                    	    // InternalAioc.g:2973:3: lv_params_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionAccess().getParamsExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_43);
                    	    lv_params_4_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_4_0, 
                    	              		"org.Aioc.Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            this_RRND_5=(Token)match(input,RULE_RRND,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RRND_5, grammarAccess.getFunctionAccess().getRRNDTerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"

    // $ANTLR start synpred1_InternalAioc
    public final void synpred1_InternalAioc_fragment() throws RecognitionException {   
        // InternalAioc.g:367:8: ( ( RULE_LRND ) )
        // InternalAioc.g:368:1: ( RULE_LRND )
        {
        // InternalAioc.g:368:1: ( RULE_LRND )
        // InternalAioc.g:369:1: RULE_LRND
        {
        match(input,RULE_LRND,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalAioc

    // Delegated rules

    public final boolean synpred1_InternalAioc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalAioc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\17\5\uffff\1\12\1\uffff";
    static final String dfa_3s = "\1\66\1\uffff\1\20\5\uffff\1\63\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\3\1\uffff\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\5\uffff\1\2\45\uffff\1\1\2\uffff\1\3\1\uffff\1\4\1\5",
            "",
            "\1\7\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\11\50\uffff\1\3",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1045:1: (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000101000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0069000000000410L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000109000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000060000001C40L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000060000001C00L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000007E000300L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001803C40L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000001803CC0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0180000000000012L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0100000000000012L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000000007E000302L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000004080L});

}