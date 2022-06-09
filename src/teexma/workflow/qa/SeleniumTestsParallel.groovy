package teexma.workflow.qa
import org.codehaus.groovy.runtime.StackTraceUtils

class SeleniumTestsParallel {
	protected _script;
	SeleniumTestsParallel(script) {
		this._script = script;
	}
	def run() {
      		_script.echo " Hello from Selenium";
		_script.bat "copy \"C:\\ProgramData\\Jenkins\\jenkins.pid\" \"C:\\ProgramData\\Jenkins\\BDD\\pape.pid\"" 
  }
  
}
