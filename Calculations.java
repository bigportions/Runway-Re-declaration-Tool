
public class CalculationMethods {

	static Integer RESA = 240;
	/*
	 * 
	 * 
	 * LANDING TOWARDS AND AWAY OBSTACLE
	 * 
	 * 
	 */
	public Integer landOverObstacle
		(Integer LDA, Integer obstacleHeight, Integer distFrmThresh)
	{
		//work out the Approach Landing Surface
		Integer result = LDA;
		Integer ALS = obstacleHeight * 50;
		
		// Return the Larger value of RESA or ALS
		if(RESA > ALS){ result = result - RESA;}
		else{ result = result - ALS;}
		
		result = LDA - distFrmThresh;
		result = result - 60; // remove the Strip end value
		
		return result;
		
	}
	//When a plane is landing on a runway with an obstacle at the other end
	public Integer landTowardObstacle(Integer LDA){
		Integer result;
		//Take away the RESA value and the strip end from the LDA
		result = LDA - RESA - 60;
		
		return result;
	}
	/*
	 * 
	 *   TAKE OFF TOWARD OBSTACLE
	 * 
	 */
	public Integer takeOffTowardObstacleTORA(Integer obstacleHeight,
			Integer TORA)
	{
		// no stopway avaliable because Obstacle blocks the stopway or clearway
		Integer result;
		result = TORA - 60 - Math.max((obstacleHeight * 50), RESA);
		return result;
	}
	
	
	
}
