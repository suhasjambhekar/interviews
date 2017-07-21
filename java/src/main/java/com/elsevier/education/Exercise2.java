package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		@Autowired	
		//The engine can be initialized with either of the gas engine or electric engine	
		//via dependency injection of Exercise2.GasEngine, or Exercise2.ElectricEngine beans	
		private Engine engine;// = new GasEngine();
		
		public Car() {
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
        public static abstract class Engine {
		public abstract void spinWheels();
	}
	public static class GasEngine extends Engine {
	        @Override			
		public void spinWheels() {
			//  GasEngine specific	
		}
	}
	public static class ElectricEngine extends Engine{
		@Override	
		public void spinWheels(){
			 // ElectricEngine specific logic
		}
	}
					
}
