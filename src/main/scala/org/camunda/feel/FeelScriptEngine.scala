package org.camunda.feel

import javax.script.ScriptEngine
import javax.script.Bindings
import java.io.Reader
import javax.script.ScriptContext
import javax.script.ScriptEngineFactory
import javax.script.AbstractScriptEngine


class FeelScriptEngine extends AbstractScriptEngine with ScriptEngine {
  
  def createBindings(): Bindings = {
    ???
  }

  def eval(x$1: Reader, x$2: ScriptContext): Object = {
    ???
  }

  def eval(x$1: String, x$2: ScriptContext): Object = {
    ???
  }

  def getFactory(): ScriptEngineFactory = {
    ???
  }
  
}