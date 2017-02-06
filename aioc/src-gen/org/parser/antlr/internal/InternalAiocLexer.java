package org.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAiocLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_GT=29;
    public static final int RULE_LEQ=27;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_LCURLY=4;
    public static final int T__58=58;
    public static final int RULE_ARROW=17;
    public static final int RULE_NOT_EQUAL=31;
    public static final int T__51=51;
    public static final int RULE_OR=12;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_ID=7;
    public static final int RULE_EQUAL=28;
    public static final int RULE_COMMA=8;
    public static final int RULE_TIMES=21;
    public static final int RULE_COLON=6;
    public static final int RULE_ASSIGN=18;
    public static final int RULE_SLASH=22;
    public static final int RULE_LT=26;
    public static final int RULE_PIPE=15;
    public static final int RULE_INT=32;
    public static final int RULE_ML_COMMENT=35;
    public static final int RULE_LRND=9;
    public static final int RULE_SEMICOLON=16;
    public static final int RULE_FALSE=25;
    public static final int RULE_STRING=13;
    public static final int RULE_GEQ=30;
    public static final int RULE_NOT=23;
    public static final int RULE_AT=14;
    public static final int RULE_AND=11;
    public static final int RULE_SL_COMMENT=36;
    public static final int RULE_DOUBLE=33;
    public static final int T__39=39;
    public static final int RULE_TRUE=24;
    public static final int RULE_PLUS=19;
    public static final int RULE_DOT=34;
    public static final int EOF=-1;
    public static final int RULE_RCURLY=5;
    public static final int RULE_WS=37;
    public static final int RULE_ANY_OTHER=38;
    public static final int RULE_MINUS=20;
    public static final int RULE_RRND=10;
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

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:14:7: ( 'newRoles' )
            // InternalAioc.g:14:9: 'newRoles'
            {
            match("newRoles"); 


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
            // InternalAioc.g:15:7: ( 'on' )
            // InternalAioc.g:15:9: 'on'
            {
            match("on"); 


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
            // InternalAioc.g:16:7: ( 'do' )
            // InternalAioc.g:16:9: 'do'
            {
            match("do"); 


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
            // InternalAioc.g:17:7: ( 'N.' )
            // InternalAioc.g:17:9: 'N.'
            {
            match("N."); 


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
            // InternalAioc.g:18:7: ( 'E.' )
            // InternalAioc.g:18:9: 'E.'
            {
            match("E."); 


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
            // InternalAioc.g:19:7: ( 'starter:' )
            // InternalAioc.g:19:9: 'starter:'
            {
            match("starter:"); 


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
            // InternalAioc.g:20:7: ( 'include' )
            // InternalAioc.g:20:9: 'include'
            {
            match("include"); 


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
            // InternalAioc.g:21:7: ( 'from' )
            // InternalAioc.g:21:9: 'from'
            {
            match("from"); 


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
            // InternalAioc.g:22:7: ( 'with' )
            // InternalAioc.g:22:9: 'with'
            {
            match("with"); 


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
            // InternalAioc.g:23:7: ( 'location' )
            // InternalAioc.g:23:9: 'location'
            {
            match("location"); 


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
            // InternalAioc.g:24:7: ( 'skip' )
            // InternalAioc.g:24:9: 'skip'
            {
            match("skip"); 


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
            // InternalAioc.g:25:7: ( 'getInput' )
            // InternalAioc.g:25:9: 'getInput'
            {
            match("getInput"); 


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
            // InternalAioc.g:26:7: ( 'show' )
            // InternalAioc.g:26:9: 'show'
            {
            match("show"); 


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
            // InternalAioc.g:27:7: ( 'if' )
            // InternalAioc.g:27:9: 'if'
            {
            match("if"); 


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
            // InternalAioc.g:28:7: ( 'else' )
            // InternalAioc.g:28:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:29:7: ( 'while' )
            // InternalAioc.g:29:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:30:7: ( 'scope' )
            // InternalAioc.g:30:9: 'scope'
            {
            match("scope"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:31:7: ( 'prop' )
            // InternalAioc.g:31:9: 'prop'
            {
            match("prop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:32:7: ( 'roles' )
            // InternalAioc.g:32:9: 'roles'
            {
            match("roles"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:3241:13: ( ( RULE_INT )? RULE_DOT RULE_INT )
            // InternalAioc.g:3241:15: ( RULE_INT )? RULE_DOT RULE_INT
            {
            // InternalAioc.g:3241:15: ( RULE_INT )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAioc.g:3241:15: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            mRULE_DOT(); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_LCURLY"
    public final void mRULE_LCURLY() throws RecognitionException {
        try {
            int _type = RULE_LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:3243:13: ( '{' )
            // InternalAioc.g:3243:15: '{'
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
            // InternalAioc.g:3245:13: ( '}' )
            // InternalAioc.g:3245:15: '}'
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
            // InternalAioc.g:3247:12: ( '->' )
            // InternalAioc.g:3247:14: '->'
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
            // InternalAioc.g:3249:16: ( ';' )
            // InternalAioc.g:3249:18: ';'
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
            // InternalAioc.g:3251:11: ( '|' )
            // InternalAioc.g:3251:13: '|'
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
            // InternalAioc.g:3253:12: ( ':' )
            // InternalAioc.g:3253:14: ':'
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
            // InternalAioc.g:3255:11: ( '+' )
            // InternalAioc.g:3255:13: '+'
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
            // InternalAioc.g:3257:12: ( '-' )
            // InternalAioc.g:3257:14: '-'
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

    // $ANTLR start "RULE_TIMES"
    public final void mRULE_TIMES() throws RecognitionException {
        try {
            int _type = RULE_TIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:3259:12: ( '*' )
            // InternalAioc.g:3259:14: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TIMES"

    // $ANTLR start "RULE_SLASH"
    public final void mRULE_SLASH() throws RecognitionException {
        try {
            int _type = RULE_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:3261:12: ( '/' )
            // InternalAioc.g:3261:14: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASH"

    // $ANTLR start "RULE_AT"
    public final void mRULE_AT() throws RecognitionException {
        try {
            int _type = RULE_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAioc.g:3263:9: ( '@' )
            // InternalAioc.g:3263:11: '@'
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
            // InternalAioc.g:3265:13: ( '=' )
            // InternalAioc.g:3265:15: '='
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
            // InternalAioc.g:3267:19: ( '.' )
            // InternalAioc.g:3267:21: '.'
            {
            match('.'); 

            }

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
            // InternalAioc.g:3269:10: ( '!' )
            // InternalAioc.g:3269:12: '!'
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
            // InternalAioc.g:3271:11: ( '(' )
            // InternalAioc.g:3271:13: '('
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
            // InternalAioc.g:3273:11: ( ')' )
            // InternalAioc.g:3273:13: ')'
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
            // InternalAioc.g:3275:12: ( ',' )
            // InternalAioc.g:3275:14: ','
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
            // InternalAioc.g:3277:12: ( '==' )
            // InternalAioc.g:3277:14: '=='
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
            // InternalAioc.g:3279:16: ( '!=' )
            // InternalAioc.g:3279:18: '!='
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
            // InternalAioc.g:3281:10: ( '<=' )
            // InternalAioc.g:3281:12: '<='
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
            // InternalAioc.g:3283:10: ( '>=' )
            // InternalAioc.g:3283:12: '>='
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
            // InternalAioc.g:3285:9: ( '<' )
            // InternalAioc.g:3285:11: '<'
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
            // InternalAioc.g:3287:9: ( '>' )
            // InternalAioc.g:3287:11: '>'
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
            // InternalAioc.g:3289:10: ( 'and' )
            // InternalAioc.g:3289:12: 'and'
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
            // InternalAioc.g:3291:9: ( 'or' )
            // InternalAioc.g:3291:11: 'or'
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
            // InternalAioc.g:3293:11: ( 'true' )
            // InternalAioc.g:3293:13: 'true'
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
            // InternalAioc.g:3295:12: ( 'false' )
            // InternalAioc.g:3295:14: 'false'
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
            // InternalAioc.g:3297:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAioc.g:3297:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAioc.g:3297:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAioc.g:3297:11: '^'
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

            // InternalAioc.g:3297:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    break loop3;
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
            // InternalAioc.g:3299:10: ( ( '0' .. '9' )+ )
            // InternalAioc.g:3299:12: ( '0' .. '9' )+
            {
            // InternalAioc.g:3299:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAioc.g:3299:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // InternalAioc.g:3301:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAioc.g:3301:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAioc.g:3301:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAioc.g:3301:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAioc.g:3301:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalAioc.g:3301:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAioc.g:3301:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalAioc.g:3301:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAioc.g:3301:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalAioc.g:3301:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAioc.g:3301:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // InternalAioc.g:3303:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAioc.g:3303:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAioc.g:3303:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAioc.g:3303:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalAioc.g:3305:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAioc.g:3305:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAioc.g:3305:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAioc.g:3305:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalAioc.g:3305:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAioc.g:3305:41: ( '\\r' )? '\\n'
                    {
                    // InternalAioc.g:3305:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalAioc.g:3305:41: '\\r'
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
            // InternalAioc.g:3307:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAioc.g:3307:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAioc.g:3307:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalAioc.g:3309:16: ( . )
            // InternalAioc.g:3309:18: .
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
        // InternalAioc.g:1:8: ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | RULE_DOUBLE | RULE_LCURLY | RULE_RCURLY | RULE_ARROW | RULE_SEMICOLON | RULE_PIPE | RULE_COLON | RULE_PLUS | RULE_MINUS | RULE_TIMES | RULE_SLASH | RULE_AT | RULE_ASSIGN | RULE_NOT | RULE_LRND | RULE_RRND | RULE_COMMA | RULE_EQUAL | RULE_NOT_EQUAL | RULE_LEQ | RULE_GEQ | RULE_LT | RULE_GT | RULE_AND | RULE_OR | RULE_TRUE | RULE_FALSE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=56;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalAioc.g:1:10: T__39
                {
                mT__39(); 

                }
                break;
            case 2 :
                // InternalAioc.g:1:16: T__40
                {
                mT__40(); 

                }
                break;
            case 3 :
                // InternalAioc.g:1:22: T__41
                {
                mT__41(); 

                }
                break;
            case 4 :
                // InternalAioc.g:1:28: T__42
                {
                mT__42(); 

                }
                break;
            case 5 :
                // InternalAioc.g:1:34: T__43
                {
                mT__43(); 

                }
                break;
            case 6 :
                // InternalAioc.g:1:40: T__44
                {
                mT__44(); 

                }
                break;
            case 7 :
                // InternalAioc.g:1:46: T__45
                {
                mT__45(); 

                }
                break;
            case 8 :
                // InternalAioc.g:1:52: T__46
                {
                mT__46(); 

                }
                break;
            case 9 :
                // InternalAioc.g:1:58: T__47
                {
                mT__47(); 

                }
                break;
            case 10 :
                // InternalAioc.g:1:64: T__48
                {
                mT__48(); 

                }
                break;
            case 11 :
                // InternalAioc.g:1:70: T__49
                {
                mT__49(); 

                }
                break;
            case 12 :
                // InternalAioc.g:1:76: T__50
                {
                mT__50(); 

                }
                break;
            case 13 :
                // InternalAioc.g:1:82: T__51
                {
                mT__51(); 

                }
                break;
            case 14 :
                // InternalAioc.g:1:88: T__52
                {
                mT__52(); 

                }
                break;
            case 15 :
                // InternalAioc.g:1:94: T__53
                {
                mT__53(); 

                }
                break;
            case 16 :
                // InternalAioc.g:1:100: T__54
                {
                mT__54(); 

                }
                break;
            case 17 :
                // InternalAioc.g:1:106: T__55
                {
                mT__55(); 

                }
                break;
            case 18 :
                // InternalAioc.g:1:112: T__56
                {
                mT__56(); 

                }
                break;
            case 19 :
                // InternalAioc.g:1:118: T__57
                {
                mT__57(); 

                }
                break;
            case 20 :
                // InternalAioc.g:1:124: T__58
                {
                mT__58(); 

                }
                break;
            case 21 :
                // InternalAioc.g:1:130: T__59
                {
                mT__59(); 

                }
                break;
            case 22 :
                // InternalAioc.g:1:136: T__60
                {
                mT__60(); 

                }
                break;
            case 23 :
                // InternalAioc.g:1:142: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 24 :
                // InternalAioc.g:1:154: RULE_LCURLY
                {
                mRULE_LCURLY(); 

                }
                break;
            case 25 :
                // InternalAioc.g:1:166: RULE_RCURLY
                {
                mRULE_RCURLY(); 

                }
                break;
            case 26 :
                // InternalAioc.g:1:178: RULE_ARROW
                {
                mRULE_ARROW(); 

                }
                break;
            case 27 :
                // InternalAioc.g:1:189: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 28 :
                // InternalAioc.g:1:204: RULE_PIPE
                {
                mRULE_PIPE(); 

                }
                break;
            case 29 :
                // InternalAioc.g:1:214: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 30 :
                // InternalAioc.g:1:225: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 31 :
                // InternalAioc.g:1:235: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 32 :
                // InternalAioc.g:1:246: RULE_TIMES
                {
                mRULE_TIMES(); 

                }
                break;
            case 33 :
                // InternalAioc.g:1:257: RULE_SLASH
                {
                mRULE_SLASH(); 

                }
                break;
            case 34 :
                // InternalAioc.g:1:268: RULE_AT
                {
                mRULE_AT(); 

                }
                break;
            case 35 :
                // InternalAioc.g:1:276: RULE_ASSIGN
                {
                mRULE_ASSIGN(); 

                }
                break;
            case 36 :
                // InternalAioc.g:1:288: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 37 :
                // InternalAioc.g:1:297: RULE_LRND
                {
                mRULE_LRND(); 

                }
                break;
            case 38 :
                // InternalAioc.g:1:307: RULE_RRND
                {
                mRULE_RRND(); 

                }
                break;
            case 39 :
                // InternalAioc.g:1:317: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 40 :
                // InternalAioc.g:1:328: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 41 :
                // InternalAioc.g:1:339: RULE_NOT_EQUAL
                {
                mRULE_NOT_EQUAL(); 

                }
                break;
            case 42 :
                // InternalAioc.g:1:354: RULE_LEQ
                {
                mRULE_LEQ(); 

                }
                break;
            case 43 :
                // InternalAioc.g:1:363: RULE_GEQ
                {
                mRULE_GEQ(); 

                }
                break;
            case 44 :
                // InternalAioc.g:1:372: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 45 :
                // InternalAioc.g:1:380: RULE_GT
                {
                mRULE_GT(); 

                }
                break;
            case 46 :
                // InternalAioc.g:1:388: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 47 :
                // InternalAioc.g:1:397: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 48 :
                // InternalAioc.g:1:405: RULE_TRUE
                {
                mRULE_TRUE(); 

                }
                break;
            case 49 :
                // InternalAioc.g:1:415: RULE_FALSE
                {
                mRULE_FALSE(); 

                }
                break;
            case 50 :
                // InternalAioc.g:1:426: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 51 :
                // InternalAioc.g:1:434: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 52 :
                // InternalAioc.g:1:443: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 53 :
                // InternalAioc.g:1:455: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 54 :
                // InternalAioc.g:1:471: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 55 :
                // InternalAioc.g:1:487: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 56 :
                // InternalAioc.g:1:495: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\17\53\1\103\1\51\2\uffff\1\111\5\uffff\1\121\1\uffff\1\124\1\126\3\uffff\1\133\1\135\1\53\1\51\1\uffff\2\51\2\uffff\1\53\1\uffff\5\53\1\150\1\151\1\152\2\uffff\5\53\1\160\7\53\1\uffff\1\103\31\uffff\1\53\2\uffff\3\53\1\174\3\53\3\uffff\5\53\1\uffff\11\53\1\u008e\1\u008f\1\uffff\1\u0090\3\53\1\u0094\1\u0095\2\53\1\u0098\1\53\1\u009a\3\53\1\u009e\1\u009f\1\53\3\uffff\1\u00a1\2\53\2\uffff\1\u00a4\1\53\1\uffff\1\u00a6\1\uffff\1\u00a7\2\53\2\uffff\1\53\1\uffff\2\53\1\uffff\1\53\2\uffff\5\53\1\u00b3\2\53\1\u00b6\1\u00b7\2\uffff\1\u00b8\1\u00b9\4\uffff";
    static final String DFA13_eofS =
        "\u00ba\uffff";
    static final String DFA13_minS =
        "\1\0\1\162\1\151\1\157\1\145\1\156\1\157\2\56\1\143\1\146\1\141\1\150\1\157\1\145\1\154\1\56\1\60\2\uffff\1\76\5\uffff\1\52\1\uffff\2\75\3\uffff\2\75\1\162\1\101\1\uffff\2\0\2\uffff\1\145\1\uffff\1\157\1\144\2\154\1\167\3\60\2\uffff\1\141\1\151\2\157\1\143\1\60\1\157\1\154\1\164\1\151\1\143\1\164\1\163\1\uffff\1\56\31\uffff\1\165\2\uffff\1\141\1\160\1\143\1\60\2\145\1\122\3\uffff\1\162\1\160\1\167\1\160\1\154\1\uffff\1\155\1\163\1\150\1\154\1\141\1\111\2\145\1\155\2\60\1\uffff\1\60\1\163\1\157\1\164\2\60\1\145\1\165\1\60\1\145\1\60\1\145\1\164\1\156\2\60\1\142\3\uffff\1\60\1\154\1\145\2\uffff\1\60\1\144\1\uffff\1\60\1\uffff\1\60\1\151\1\160\2\uffff\1\154\1\uffff\1\145\1\162\1\uffff\1\145\2\uffff\1\157\1\165\1\145\1\163\1\72\1\60\1\156\1\164\2\60\2\uffff\2\60\4\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\162\1\156\1\165\1\145\1\162\1\157\2\56\1\164\1\156\1\162\1\151\1\157\1\145\1\154\2\71\2\uffff\1\76\5\uffff\1\57\1\uffff\2\75\3\uffff\2\75\1\162\1\172\1\uffff\2\uffff\2\uffff\1\157\1\uffff\1\157\1\144\2\154\1\167\3\172\2\uffff\1\141\1\151\2\157\1\143\1\172\1\157\1\154\1\164\1\151\1\143\1\164\1\163\1\uffff\1\71\31\uffff\1\165\2\uffff\1\141\1\160\1\143\1\172\2\145\1\122\3\uffff\1\162\1\160\1\167\1\160\1\154\1\uffff\1\155\1\163\1\150\1\154\1\141\1\111\2\145\1\155\2\172\1\uffff\1\172\1\163\1\157\1\164\2\172\1\145\1\165\1\172\1\145\1\172\1\145\1\164\1\156\2\172\1\142\3\uffff\1\172\1\154\1\145\2\uffff\1\172\1\144\1\uffff\1\172\1\uffff\1\172\1\151\1\160\2\uffff\1\154\1\uffff\1\145\1\162\1\uffff\1\145\2\uffff\1\157\1\165\1\145\1\163\1\72\1\172\1\156\1\164\2\172\2\uffff\2\172\4\uffff";
    static final String DFA13_acceptS =
        "\22\uffff\1\30\1\31\1\uffff\1\33\1\34\1\35\1\36\1\40\1\uffff\1\42\2\uffff\1\45\1\46\1\47\4\uffff\1\62\2\uffff\1\67\1\70\1\uffff\1\62\10\uffff\1\7\1\10\15\uffff\1\63\1\uffff\1\27\1\30\1\31\1\32\1\37\1\33\1\34\1\35\1\36\1\40\1\65\1\66\1\41\1\42\1\50\1\43\1\51\1\44\1\45\1\46\1\47\1\52\1\54\1\53\1\55\1\uffff\1\64\1\67\7\uffff\1\5\1\57\1\6\5\uffff\1\21\13\uffff\1\56\21\uffff\1\25\1\2\1\3\3\uffff\1\16\1\20\2\uffff\1\13\1\uffff\1\14\3\uffff\1\22\1\60\1\uffff\1\26\2\uffff\1\24\1\uffff\1\61\1\23\12\uffff\1\11\1\12\2\uffff\1\1\1\4\1\15\1\17";
    static final String DFA13_specialS =
        "\1\1\45\uffff\1\2\1\0\u0092\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\35\1\46\4\51\1\47\1\36\1\37\1\31\1\30\1\40\1\24\1\21\1\32\12\20\1\27\1\25\1\41\1\34\1\42\1\51\1\33\4\45\1\10\10\45\1\7\14\45\3\51\1\44\1\45\1\51\1\2\2\45\1\6\1\17\1\13\1\16\1\45\1\12\2\45\1\15\1\45\1\4\1\5\1\1\1\45\1\3\1\11\1\43\2\45\1\14\3\45\1\22\1\26\1\23\uff82\51",
            "\1\52",
            "\1\54\4\uffff\1\55",
            "\1\57\5\uffff\1\56",
            "\1\60",
            "\1\61\3\uffff\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\71\4\uffff\1\70\2\uffff\1\67\10\uffff\1\66",
            "\1\73\7\uffff\1\72",
            "\1\75\20\uffff\1\74",
            "\1\77\1\76",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\105\1\uffff\12\104",
            "\12\105",
            "",
            "",
            "\1\110",
            "",
            "",
            "",
            "",
            "",
            "\1\117\4\uffff\1\120",
            "",
            "\1\123",
            "\1\125",
            "",
            "",
            "",
            "\1\132",
            "\1\134",
            "\1\136",
            "\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\0\137",
            "\0\137",
            "",
            "",
            "\1\141\11\uffff\1\142",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "\1\105\1\uffff\12\104",
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
            "",
            "",
            "",
            "",
            "\1\170",
            "",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0096",
            "\1\u0097",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0099",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00a0",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00a5",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "\1\u00ad",
            "",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00b4",
            "\1\u00b5",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | RULE_DOUBLE | RULE_LCURLY | RULE_RCURLY | RULE_ARROW | RULE_SEMICOLON | RULE_PIPE | RULE_COLON | RULE_PLUS | RULE_MINUS | RULE_TIMES | RULE_SLASH | RULE_AT | RULE_ASSIGN | RULE_NOT | RULE_LRND | RULE_RRND | RULE_COMMA | RULE_EQUAL | RULE_NOT_EQUAL | RULE_LEQ | RULE_GEQ | RULE_LT | RULE_GT | RULE_AND | RULE_OR | RULE_TRUE | RULE_FALSE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_39 = input.LA(1);

                        s = -1;
                        if ( ((LA13_39>='\u0000' && LA13_39<='\uFFFF')) ) {s = 95;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='p') ) {s = 1;}

                        else if ( (LA13_0=='a') ) {s = 2;}

                        else if ( (LA13_0=='r') ) {s = 3;}

                        else if ( (LA13_0=='n') ) {s = 4;}

                        else if ( (LA13_0=='o') ) {s = 5;}

                        else if ( (LA13_0=='d') ) {s = 6;}

                        else if ( (LA13_0=='N') ) {s = 7;}

                        else if ( (LA13_0=='E') ) {s = 8;}

                        else if ( (LA13_0=='s') ) {s = 9;}

                        else if ( (LA13_0=='i') ) {s = 10;}

                        else if ( (LA13_0=='f') ) {s = 11;}

                        else if ( (LA13_0=='w') ) {s = 12;}

                        else if ( (LA13_0=='l') ) {s = 13;}

                        else if ( (LA13_0=='g') ) {s = 14;}

                        else if ( (LA13_0=='e') ) {s = 15;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 16;}

                        else if ( (LA13_0=='.') ) {s = 17;}

                        else if ( (LA13_0=='{') ) {s = 18;}

                        else if ( (LA13_0=='}') ) {s = 19;}

                        else if ( (LA13_0=='-') ) {s = 20;}

                        else if ( (LA13_0==';') ) {s = 21;}

                        else if ( (LA13_0=='|') ) {s = 22;}

                        else if ( (LA13_0==':') ) {s = 23;}

                        else if ( (LA13_0=='+') ) {s = 24;}

                        else if ( (LA13_0=='*') ) {s = 25;}

                        else if ( (LA13_0=='/') ) {s = 26;}

                        else if ( (LA13_0=='@') ) {s = 27;}

                        else if ( (LA13_0=='=') ) {s = 28;}

                        else if ( (LA13_0=='!') ) {s = 29;}

                        else if ( (LA13_0=='(') ) {s = 30;}

                        else if ( (LA13_0==')') ) {s = 31;}

                        else if ( (LA13_0==',') ) {s = 32;}

                        else if ( (LA13_0=='<') ) {s = 33;}

                        else if ( (LA13_0=='>') ) {s = 34;}

                        else if ( (LA13_0=='t') ) {s = 35;}

                        else if ( (LA13_0=='^') ) {s = 36;}

                        else if ( ((LA13_0>='A' && LA13_0<='D')||(LA13_0>='F' && LA13_0<='M')||(LA13_0>='O' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='b' && LA13_0<='c')||LA13_0=='h'||(LA13_0>='j' && LA13_0<='k')||LA13_0=='m'||LA13_0=='q'||(LA13_0>='u' && LA13_0<='v')||(LA13_0>='x' && LA13_0<='z')) ) {s = 37;}

                        else if ( (LA13_0=='\"') ) {s = 38;}

                        else if ( (LA13_0=='\'') ) {s = 39;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 40;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='&')||LA13_0=='?'||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_38 = input.LA(1);

                        s = -1;
                        if ( ((LA13_38>='\u0000' && LA13_38<='\uFFFF')) ) {s = 95;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}