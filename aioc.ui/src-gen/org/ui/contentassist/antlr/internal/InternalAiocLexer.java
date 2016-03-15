package org.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAiocLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_GT=28;
    public static final int RULE_LEQ=26;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int RULE_LCURLY=4;
    public static final int RULE_ARROW=13;
    public static final int RULE_NOT_EQUAL=30;
    public static final int T__51=51;
    public static final int RULE_OR=18;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=19;
    public static final int RULE_EQUAL=27;
    public static final int RULE_COMMA=7;
    public static final int RULE_COLON=9;
    public static final int RULE_ASSIGN=14;
    public static final int RULE_LT=25;
    public static final int RULE_PIPE=10;
    public static final int RULE_INT=24;
    public static final int RULE_ML_COMMENT=32;
    public static final int RULE_LRND=12;
    public static final int RULE_SEMICOLON=11;
    public static final int RULE_FALSE=21;
    public static final int RULE_STRING=22;
    public static final int RULE_GEQ=29;
    public static final int RULE_NOT=23;
    public static final int RULE_AT=8;
    public static final int RULE_AND=17;
    public static final int RULE_SL_COMMENT=33;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_TRUE=20;
    public static final int RULE_PLUS=15;
    public static final int T__36=36;
    public static final int RULE_DOT=31;
    public static final int EOF=-1;
    public static final int RULE_RCURLY=5;
    public static final int RULE_WS=34;
    public static final int RULE_ANY_OTHER=35;
    public static final int RULE_MINUS=16;
    public static final int RULE_RRND=6;
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

    public InternalAiocLexer() {;} 
    public InternalAiocLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAiocLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAioc.g"; }

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:11:7: ( 'preamble' )
            // InternalAioc.g:11:9: 'preamble'
            {
            match("preamble"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:12:7: ( 'aioc' )
            // InternalAioc.g:12:9: 'aioc'
            {
            match("aioc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:13:7: ( 'rule' )
            // InternalAioc.g:13:9: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:14:7: ( 'on' )
            // InternalAioc.g:14:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:15:7: ( 'do' )
            // InternalAioc.g:15:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:16:7: ( 'N.' )
            // InternalAioc.g:16:9: 'N.'
            {
            match("N."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:17:7: ( 'E.' )
            // InternalAioc.g:17:9: 'E.'
            {
            match("E."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:18:7: ( 'starter:' )
            // InternalAioc.g:18:9: 'starter:'
            {
            match("starter:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:19:7: ( 'include' )
            // InternalAioc.g:19:9: 'include'
            {
            match("include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:20:7: ( 'from' )
            // InternalAioc.g:20:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:21:7: ( 'with' )
            // InternalAioc.g:21:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:22:7: ( 'location' )
            // InternalAioc.g:22:9: 'location'
            {
            match("location"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:23:7: ( 'getInput' )
            // InternalAioc.g:23:9: 'getInput'
            {
            match("getInput"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:24:7: ( 'show' )
            // InternalAioc.g:24:9: 'show'
            {
            match("show"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:25:7: ( 'if' )
            // InternalAioc.g:25:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:26:7: ( 'else' )
            // InternalAioc.g:26:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:27:7: ( 'while' )
            // InternalAioc.g:27:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:28:7: ( 'scope' )
            // InternalAioc.g:28:9: 'scope'
            {
            match("scope"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:29:7: ( 'prop' )
            // InternalAioc.g:29:9: 'prop'
            {
            match("prop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:30:7: ( 'roles' )
            // InternalAioc.g:30:9: 'roles'
            {
            match("roles"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:31:7: ( 'skip' )
            // InternalAioc.g:31:9: 'skip'
            {
            match("skip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "RULE_LCURLY"
    public final void mRULE_LCURLY() throws RecognitionException {
        try {
            int _type = RULE_LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8567:13: ( '{' )
            // InternalAioc.g:8567:15: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LCURLY"

    // $ANTLR start "RULE_RCURLY"
    public final void mRULE_RCURLY() throws RecognitionException {
        try {
            int _type = RULE_RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8569:13: ( '}' )
            // InternalAioc.g:8569:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RCURLY"

    // $ANTLR start "RULE_ARROW"
    public final void mRULE_ARROW() throws RecognitionException {
        try {
            int _type = RULE_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8571:12: ( '->' )
            // InternalAioc.g:8571:14: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARROW"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8573:16: ( ';' )
            // InternalAioc.g:8573:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMICOLON"

    // $ANTLR start "RULE_PIPE"
    public final void mRULE_PIPE() throws RecognitionException {
        try {
            int _type = RULE_PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8575:11: ( '|' )
            // InternalAioc.g:8575:13: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PIPE"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8577:12: ( ':' )
            // InternalAioc.g:8577:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8579:11: ( '+' )
            // InternalAioc.g:8579:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8581:12: ( '-' )
            // InternalAioc.g:8581:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_AT"
    public final void mRULE_AT() throws RecognitionException {
        try {
            int _type = RULE_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8583:9: ( '@' )
            // InternalAioc.g:8583:11: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AT"

    // $ANTLR start "RULE_ASSIGN"
    public final void mRULE_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8585:13: ( '=' )
            // InternalAioc.g:8585:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASSIGN"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8587:10: ( '.' )
            // InternalAioc.g:8587:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8589:10: ( '!' )
            // InternalAioc.g:8589:12: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT"

    // $ANTLR start "RULE_LRND"
    public final void mRULE_LRND() throws RecognitionException {
        try {
            int _type = RULE_LRND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8591:11: ( '(' )
            // InternalAioc.g:8591:13: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LRND"

    // $ANTLR start "RULE_RRND"
    public final void mRULE_RRND() throws RecognitionException {
        try {
            int _type = RULE_RRND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8593:11: ( ')' )
            // InternalAioc.g:8593:13: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RRND"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8595:12: ( ',' )
            // InternalAioc.g:8595:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_EQUAL"
    public final void mRULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8597:12: ( '==' )
            // InternalAioc.g:8597:14: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUAL"

    // $ANTLR start "RULE_NOT_EQUAL"
    public final void mRULE_NOT_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8599:16: ( '!=' )
            // InternalAioc.g:8599:18: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT_EQUAL"

    // $ANTLR start "RULE_LEQ"
    public final void mRULE_LEQ() throws RecognitionException {
        try {
            int _type = RULE_LEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8601:10: ( '<=' )
            // InternalAioc.g:8601:12: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEQ"

    // $ANTLR start "RULE_GEQ"
    public final void mRULE_GEQ() throws RecognitionException {
        try {
            int _type = RULE_GEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8603:10: ( '>=' )
            // InternalAioc.g:8603:12: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GEQ"

    // $ANTLR start "RULE_LT"
    public final void mRULE_LT() throws RecognitionException {
        try {
            int _type = RULE_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8605:9: ( '<' )
            // InternalAioc.g:8605:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LT"

    // $ANTLR start "RULE_GT"
    public final void mRULE_GT() throws RecognitionException {
        try {
            int _type = RULE_GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8607:9: ( '>' )
            // InternalAioc.g:8607:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GT"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            int _type = RULE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8609:10: ( 'and' )
            // InternalAioc.g:8609:12: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND"

    // $ANTLR start "RULE_OR"
    public final void mRULE_OR() throws RecognitionException {
        try {
            int _type = RULE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8611:9: ( 'or' )
            // InternalAioc.g:8611:11: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR"

    // $ANTLR start "RULE_TRUE"
    public final void mRULE_TRUE() throws RecognitionException {
        try {
            int _type = RULE_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8613:11: ( 'true' )
            // InternalAioc.g:8613:13: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRUE"

    // $ANTLR start "RULE_FALSE"
    public final void mRULE_FALSE() throws RecognitionException {
        try {
            int _type = RULE_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8615:12: ( 'false' )
            // InternalAioc.g:8615:14: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FALSE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8617:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAioc.g:8617:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAioc.g:8617:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAioc.g:8617:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAioc.g:8617:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAioc.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8619:10: ( ( '0' .. '9' )+ )
            // InternalAioc.g:8619:12: ( '0' .. '9' )+
            {
            // InternalAioc.g:8619:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAioc.g:8619:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8621:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAioc.g:8621:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAioc.g:8621:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAioc.g:8621:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAioc.g:8621:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalAioc.g:8621:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAioc.g:8621:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalAioc.g:8621:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAioc.g:8621:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalAioc.g:8621:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAioc.g:8621:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8623:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAioc.g:8623:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAioc.g:8623:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAioc.g:8623:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8625:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAioc.g:8625:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAioc.g:8625:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAioc.g:8625:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalAioc.g:8625:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAioc.g:8625:41: ( '\\r' )? '\\n'
                    {
                    // InternalAioc.g:8625:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalAioc.g:8625:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8627:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAioc.g:8627:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAioc.g:8627:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAioc.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:8629:16: ( . )
            // InternalAioc.g:8629:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalAioc.g:1:8: ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_LCURLY | RULE_RCURLY | RULE_ARROW | RULE_SEMICOLON | RULE_PIPE | RULE_COLON | RULE_PLUS | RULE_MINUS | RULE_AT | RULE_ASSIGN | RULE_DOT | RULE_NOT | RULE_LRND | RULE_RRND | RULE_COMMA | RULE_EQUAL | RULE_NOT_EQUAL | RULE_LEQ | RULE_GEQ | RULE_LT | RULE_GT | RULE_AND | RULE_OR | RULE_TRUE | RULE_FALSE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=53;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalAioc.g:1:10: T__36
                {
                mT__36(); 

                }
                break;
            case 2 :
                // InternalAioc.g:1:16: T__37
                {
                mT__37(); 

                }
                break;
            case 3 :
                // InternalAioc.g:1:22: T__38
                {
                mT__38(); 

                }
                break;
            case 4 :
                // InternalAioc.g:1:28: T__39
                {
                mT__39(); 

                }
                break;
            case 5 :
                // InternalAioc.g:1:34: T__40
                {
                mT__40(); 

                }
                break;
            case 6 :
                // InternalAioc.g:1:40: T__41
                {
                mT__41(); 

                }
                break;
            case 7 :
                // InternalAioc.g:1:46: T__42
                {
                mT__42(); 

                }
                break;
            case 8 :
                // InternalAioc.g:1:52: T__43
                {
                mT__43(); 

                }
                break;
            case 9 :
                // InternalAioc.g:1:58: T__44
                {
                mT__44(); 

                }
                break;
            case 10 :
                // InternalAioc.g:1:64: T__45
                {
                mT__45(); 

                }
                break;
            case 11 :
                // InternalAioc.g:1:70: T__46
                {
                mT__46(); 

                }
                break;
            case 12 :
                // InternalAioc.g:1:76: T__47
                {
                mT__47(); 

                }
                break;
            case 13 :
                // InternalAioc.g:1:82: T__48
                {
                mT__48(); 

                }
                break;
            case 14 :
                // InternalAioc.g:1:88: T__49
                {
                mT__49(); 

                }
                break;
            case 15 :
                // InternalAioc.g:1:94: T__50
                {
                mT__50(); 

                }
                break;
            case 16 :
                // InternalAioc.g:1:100: T__51
                {
                mT__51(); 

                }
                break;
            case 17 :
                // InternalAioc.g:1:106: T__52
                {
                mT__52(); 

                }
                break;
            case 18 :
                // InternalAioc.g:1:112: T__53
                {
                mT__53(); 

                }
                break;
            case 19 :
                // InternalAioc.g:1:118: T__54
                {
                mT__54(); 

                }
                break;
            case 20 :
                // InternalAioc.g:1:124: T__55
                {
                mT__55(); 

                }
                break;
            case 21 :
                // InternalAioc.g:1:130: T__56
                {
                mT__56(); 

                }
                break;
            case 22 :
                // InternalAioc.g:1:136: RULE_LCURLY
                {
                mRULE_LCURLY(); 

                }
                break;
            case 23 :
                // InternalAioc.g:1:148: RULE_RCURLY
                {
                mRULE_RCURLY(); 

                }
                break;
            case 24 :
                // InternalAioc.g:1:160: RULE_ARROW
                {
                mRULE_ARROW(); 

                }
                break;
            case 25 :
                // InternalAioc.g:1:171: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 26 :
                // InternalAioc.g:1:186: RULE_PIPE
                {
                mRULE_PIPE(); 

                }
                break;
            case 27 :
                // InternalAioc.g:1:196: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 28 :
                // InternalAioc.g:1:207: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 29 :
                // InternalAioc.g:1:217: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 30 :
                // InternalAioc.g:1:228: RULE_AT
                {
                mRULE_AT(); 

                }
                break;
            case 31 :
                // InternalAioc.g:1:236: RULE_ASSIGN
                {
                mRULE_ASSIGN(); 

                }
                break;
            case 32 :
                // InternalAioc.g:1:248: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 33 :
                // InternalAioc.g:1:257: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 34 :
                // InternalAioc.g:1:266: RULE_LRND
                {
                mRULE_LRND(); 

                }
                break;
            case 35 :
                // InternalAioc.g:1:276: RULE_RRND
                {
                mRULE_RRND(); 

                }
                break;
            case 36 :
                // InternalAioc.g:1:286: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 37 :
                // InternalAioc.g:1:297: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 38 :
                // InternalAioc.g:1:308: RULE_NOT_EQUAL
                {
                mRULE_NOT_EQUAL(); 

                }
                break;
            case 39 :
                // InternalAioc.g:1:323: RULE_LEQ
                {
                mRULE_LEQ(); 

                }
                break;
            case 40 :
                // InternalAioc.g:1:332: RULE_GEQ
                {
                mRULE_GEQ(); 

                }
                break;
            case 41 :
                // InternalAioc.g:1:341: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 42 :
                // InternalAioc.g:1:349: RULE_GT
                {
                mRULE_GT(); 

                }
                break;
            case 43 :
                // InternalAioc.g:1:357: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 44 :
                // InternalAioc.g:1:366: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 45 :
                // InternalAioc.g:1:374: RULE_TRUE
                {
                mRULE_TRUE(); 

                }
                break;
            case 46 :
                // InternalAioc.g:1:384: RULE_FALSE
                {
                mRULE_FALSE(); 

                }
                break;
            case 47 :
                // InternalAioc.g:1:395: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 48 :
                // InternalAioc.g:1:403: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 49 :
                // InternalAioc.g:1:412: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 50 :
                // InternalAioc.g:1:424: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 51 :
                // InternalAioc.g:1:440: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 52 :
                // InternalAioc.g:1:456: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 53 :
                // InternalAioc.g:1:464: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\16\51\2\uffff\1\103\5\uffff\1\112\1\uffff\1\115\3\uffff\1\122\1\124\1\51\1\47\2\uffff\3\47\2\uffff\1\51\1\uffff\4\51\1\141\1\142\1\143\2\uffff\5\51\1\151\7\51\25\uffff\1\51\5\uffff\3\51\1\165\2\51\3\uffff\5\51\1\uffff\11\51\1\u0086\1\u0087\1\uffff\1\u0088\2\51\1\u008b\1\51\1\u008d\1\51\1\u008f\1\51\1\u0091\3\51\1\u0095\1\u0096\1\51\3\uffff\1\u0098\1\51\1\uffff\1\u009a\1\uffff\1\51\1\uffff\1\u009c\1\uffff\1\u009d\2\51\2\uffff\1\51\1\uffff\1\51\1\uffff\1\51\2\uffff\4\51\1\u00a7\2\51\1\u00aa\2\uffff\1\u00ab\1\u00ac\3\uffff";
    static final String DFA12_eofS =
        "\u00ad\uffff";
    static final String DFA12_minS =
        "\1\0\1\162\1\151\1\157\1\156\1\157\2\56\1\143\1\146\1\141\1\150\1\157\1\145\1\154\2\uffff\1\76\5\uffff\1\75\1\uffff\1\75\3\uffff\2\75\1\162\1\101\2\uffff\2\0\1\52\2\uffff\1\145\1\uffff\1\157\1\144\2\154\3\60\2\uffff\1\141\2\157\1\151\1\143\1\60\1\157\1\154\1\164\1\151\1\143\1\164\1\163\25\uffff\1\165\5\uffff\1\141\1\160\1\143\1\60\2\145\3\uffff\1\162\1\167\2\160\1\154\1\uffff\1\155\1\163\1\150\1\154\1\141\1\111\2\145\1\155\2\60\1\uffff\1\60\1\163\1\164\1\60\1\145\1\60\1\165\1\60\1\145\1\60\1\145\1\164\1\156\2\60\1\142\3\uffff\1\60\1\145\1\uffff\1\60\1\uffff\1\144\1\uffff\1\60\1\uffff\1\60\1\151\1\160\2\uffff\1\154\1\uffff\1\162\1\uffff\1\145\2\uffff\1\157\1\165\1\145\1\72\1\60\1\156\1\164\1\60\2\uffff\2\60\3\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\162\1\156\1\165\1\162\1\157\2\56\1\164\1\156\1\162\1\151\1\157\1\145\1\154\2\uffff\1\76\5\uffff\1\75\1\uffff\1\75\3\uffff\2\75\1\162\1\172\2\uffff\2\uffff\1\57\2\uffff\1\157\1\uffff\1\157\1\144\2\154\3\172\2\uffff\1\141\2\157\1\151\1\143\1\172\1\157\1\154\1\164\1\151\1\143\1\164\1\163\25\uffff\1\165\5\uffff\1\141\1\160\1\143\1\172\2\145\3\uffff\1\162\1\167\2\160\1\154\1\uffff\1\155\1\163\1\150\1\154\1\141\1\111\2\145\1\155\2\172\1\uffff\1\172\1\163\1\164\1\172\1\145\1\172\1\165\1\172\1\145\1\172\1\145\1\164\1\156\2\172\1\142\3\uffff\1\172\1\145\1\uffff\1\172\1\uffff\1\144\1\uffff\1\172\1\uffff\1\172\1\151\1\160\2\uffff\1\154\1\uffff\1\162\1\uffff\1\145\2\uffff\1\157\1\165\1\145\1\72\1\172\1\156\1\164\1\172\2\uffff\2\172\3\uffff";
    static final String DFA12_acceptS =
        "\17\uffff\1\26\1\27\1\uffff\1\31\1\32\1\33\1\34\1\36\1\uffff\1\40\1\uffff\1\42\1\43\1\44\4\uffff\1\57\1\60\3\uffff\1\64\1\65\1\uffff\1\57\7\uffff\1\6\1\7\15\uffff\1\26\1\27\1\30\1\35\1\31\1\32\1\33\1\34\1\36\1\45\1\37\1\40\1\46\1\41\1\42\1\43\1\44\1\47\1\51\1\50\1\52\1\uffff\1\60\1\61\1\62\1\63\1\64\6\uffff\1\4\1\54\1\5\5\uffff\1\17\13\uffff\1\53\20\uffff\1\23\1\2\1\3\2\uffff\1\16\1\uffff\1\25\1\uffff\1\12\1\uffff\1\13\3\uffff\1\20\1\55\1\uffff\1\24\1\uffff\1\22\1\uffff\1\56\1\21\10\uffff\1\10\1\11\2\uffff\1\1\1\14\1\15";
    static final String DFA12_specialS =
        "\1\0\42\uffff\1\2\1\1\u0088\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\31\1\43\4\47\1\44\1\32\1\33\1\47\1\25\1\34\1\21\1\30\1\45\12\42\1\24\1\22\1\35\1\27\1\36\1\47\1\26\4\41\1\7\10\41\1\6\14\41\3\47\1\40\1\41\1\47\1\2\2\41\1\5\1\16\1\12\1\15\1\41\1\11\2\41\1\14\2\41\1\4\1\1\1\41\1\3\1\10\1\37\2\41\1\13\3\41\1\17\1\23\1\20\uff82\47",
            "\1\50",
            "\1\52\4\uffff\1\53",
            "\1\55\5\uffff\1\54",
            "\1\56\3\uffff\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\65\4\uffff\1\64\2\uffff\1\66\10\uffff\1\63",
            "\1\70\7\uffff\1\67",
            "\1\72\20\uffff\1\71",
            "\1\74\1\73",
            "\1\75",
            "\1\76",
            "\1\77",
            "",
            "",
            "\1\102",
            "",
            "",
            "",
            "",
            "",
            "\1\111",
            "",
            "\1\114",
            "",
            "",
            "",
            "\1\121",
            "\1\123",
            "\1\125",
            "\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\0\127",
            "\0\127",
            "\1\130\4\uffff\1\131",
            "",
            "",
            "\1\133\11\uffff\1\134",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\161",
            "",
            "",
            "",
            "",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\166",
            "\1\167",
            "",
            "",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0089",
            "\1\u008a",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u008c",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u008e",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0090",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0097",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0099",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u009b",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u009e",
            "\1\u009f",
            "",
            "",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a8",
            "\1\u00a9",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_LCURLY | RULE_RCURLY | RULE_ARROW | RULE_SEMICOLON | RULE_PIPE | RULE_COLON | RULE_PLUS | RULE_MINUS | RULE_AT | RULE_ASSIGN | RULE_DOT | RULE_NOT | RULE_LRND | RULE_RRND | RULE_COMMA | RULE_EQUAL | RULE_NOT_EQUAL | RULE_LEQ | RULE_GEQ | RULE_LT | RULE_GT | RULE_AND | RULE_OR | RULE_TRUE | RULE_FALSE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='p') ) {s = 1;}

                        else if ( (LA12_0=='a') ) {s = 2;}

                        else if ( (LA12_0=='r') ) {s = 3;}

                        else if ( (LA12_0=='o') ) {s = 4;}

                        else if ( (LA12_0=='d') ) {s = 5;}

                        else if ( (LA12_0=='N') ) {s = 6;}

                        else if ( (LA12_0=='E') ) {s = 7;}

                        else if ( (LA12_0=='s') ) {s = 8;}

                        else if ( (LA12_0=='i') ) {s = 9;}

                        else if ( (LA12_0=='f') ) {s = 10;}

                        else if ( (LA12_0=='w') ) {s = 11;}

                        else if ( (LA12_0=='l') ) {s = 12;}

                        else if ( (LA12_0=='g') ) {s = 13;}

                        else if ( (LA12_0=='e') ) {s = 14;}

                        else if ( (LA12_0=='{') ) {s = 15;}

                        else if ( (LA12_0=='}') ) {s = 16;}

                        else if ( (LA12_0=='-') ) {s = 17;}

                        else if ( (LA12_0==';') ) {s = 18;}

                        else if ( (LA12_0=='|') ) {s = 19;}

                        else if ( (LA12_0==':') ) {s = 20;}

                        else if ( (LA12_0=='+') ) {s = 21;}

                        else if ( (LA12_0=='@') ) {s = 22;}

                        else if ( (LA12_0=='=') ) {s = 23;}

                        else if ( (LA12_0=='.') ) {s = 24;}

                        else if ( (LA12_0=='!') ) {s = 25;}

                        else if ( (LA12_0=='(') ) {s = 26;}

                        else if ( (LA12_0==')') ) {s = 27;}

                        else if ( (LA12_0==',') ) {s = 28;}

                        else if ( (LA12_0=='<') ) {s = 29;}

                        else if ( (LA12_0=='>') ) {s = 30;}

                        else if ( (LA12_0=='t') ) {s = 31;}

                        else if ( (LA12_0=='^') ) {s = 32;}

                        else if ( ((LA12_0>='A' && LA12_0<='D')||(LA12_0>='F' && LA12_0<='M')||(LA12_0>='O' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='b' && LA12_0<='c')||LA12_0=='h'||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='m' && LA12_0<='n')||LA12_0=='q'||(LA12_0>='u' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')) ) {s = 33;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 34;}

                        else if ( (LA12_0=='\"') ) {s = 35;}

                        else if ( (LA12_0=='\'') ) {s = 36;}

                        else if ( (LA12_0=='/') ) {s = 37;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 38;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='&')||LA12_0=='*'||LA12_0=='?'||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_36 = input.LA(1);

                        s = -1;
                        if ( ((LA12_36>='\u0000' && LA12_36<='\uFFFF')) ) {s = 87;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_35 = input.LA(1);

                        s = -1;
                        if ( ((LA12_35>='\u0000' && LA12_35<='\uFFFF')) ) {s = 87;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}