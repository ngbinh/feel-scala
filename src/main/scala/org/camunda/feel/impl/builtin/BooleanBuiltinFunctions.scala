package org.camunda.feel.impl.builtin

import org.camunda.feel.impl.builtin.BuiltinFunction.builtinFunction
import org.camunda.feel.syntaxtree.{Val, ValBoolean, ValNull}

object BooleanBuiltinFunctions {

  def functions = Map(
    "not" -> List(notFunction)
  )

  private def notFunction =
    builtinFunction(params = List("negand"), invoke = {
      case List(ValBoolean(negand)) => ValBoolean(!negand)
      case List(_: Val)             => ValNull
      case _                        => ValNull
    })
}
