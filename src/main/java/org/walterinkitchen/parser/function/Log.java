package org.walterinkitchen.parser.function;

import org.walterinkitchen.parser.exception.FunctionCallArgsException;
import org.walterinkitchen.parser.expression.ArithmeticExpression;
import org.walterinkitchen.parser.expression.Expression;

import java.util.List;

public class Log implements Function {
    public static final String FUNC_NAME = "log";

    @Override
    public Expression call(List<Expression> args) {
        if (args.size() != 2) {
            throw new FunctionCallArgsException(FUNC_NAME, "参数数量错误");
        }
        return ArithmeticExpression.build(args.get(0), ArithmeticExpression.Operator.LOG, args.get(1));
    }
}
