package teexma.workflow.qa
import org.codehaus.groovy.runtime.StackTraceUtils

class SeleniumTestsParallel {
	protected _script;
	SeleniumTestsParallel(script) {
		this._script = script;
	}
	def run() {
      		_script.echo " Hello from Selenium";
  }
  
}
