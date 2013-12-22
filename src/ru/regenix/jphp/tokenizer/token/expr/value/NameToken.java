package ru.regenix.jphp.tokenizer.token.expr.value;

import ru.regenix.jphp.tokenizer.TokenType;
import ru.regenix.jphp.tokenizer.TokenMeta;
import ru.regenix.jphp.tokenizer.token.expr.ValueExprToken;

public class NameToken extends ValueExprToken {

    private String name;

    public NameToken(TokenMeta meta) {
        super(meta, TokenType.T_STRING);
        this.name = meta.getWord();
    }

    public String getName() {
        return name;
    }

    public static NameToken valueOf(String name){
        NameToken token = new NameToken(TokenMeta.empty());
        token.name = name;
        return token;
    }
}
