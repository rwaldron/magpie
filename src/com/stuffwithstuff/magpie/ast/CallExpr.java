package com.stuffwithstuff.magpie.ast;

public class CallExpr extends Expr {
  public CallExpr(Expr target, Expr arg) {
    mTarget = target;
    mArg = arg;
  }
  
  public Expr getTarget() { return mTarget; }
  public Expr getArg()    { return mArg; }
  
  @Override
  public <R, C> R accept(ExprVisitor<R, C> visitor, C context) {
    return visitor.visit(this, context);
  }

  @Override public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(mTarget)
           .append("(");
    
    if (!(mArg instanceof NothingExpr)) builder.append(mArg);
    
    builder.append(")");
    return builder.toString();
  }
  
  private final Expr mTarget;
  private final Expr mArg;
}