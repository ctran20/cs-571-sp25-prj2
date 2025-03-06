package src;

public class ExprEvaluator implements ExprVisitor<Float> {

    @Override
    public Float visitPlusExpr(PlusExpr expr) {
        float left = expr.getE1().accept(this);
        float right = expr.getE2().accept(this);
        return left + right;
    }

    @Override
    public Float visitMinusExpr(MinusExpr expr) {
        float left = expr.getE1().accept(this);
        float right = expr.getE2().accept(this);
        return left - right;
    }

    @Override
    public Float visitTimesExpr(TimesExpr expr) {
        float left = expr.getE1().accept(this);
        float right = expr.getE2().accept(this);
        return left * right;
    }

    @Override
    public Float visitDivExpr(DivExpr expr) {
        float left = expr.getE1().accept(this);
        float right = expr.getE2().accept(this);
        return left / right;
    }

    @Override
    public Float visitFloatExpr(FloatExpr expr) {
        return expr.literal;
    }
}
