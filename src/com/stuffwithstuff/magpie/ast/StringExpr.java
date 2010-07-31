package com.stuffwithstuff.magpie.ast;

public class StringExpr extends Expr {
  public StringExpr(String value) {
    mValue = value;
  }
  
  public String getValue() { return mValue; }
  
  @Override
  public <R, C> R accept(ExprVisitor<R, C> visitor, C context) {
    return visitor.visit(this, context);
  }

  @Override public String toString() { return mValue; }

  private final String mValue;
}