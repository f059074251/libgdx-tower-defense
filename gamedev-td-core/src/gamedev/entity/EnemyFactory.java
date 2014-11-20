package gamedev.entity;

import java.awt.Point;
import java.util.Arrays;

public class EnemyFactory {
	
	public static Enemy makeEnemy(int enemyType, Point [] waypoints){
		Enemy enemy = null;		
		int health, moneyReward;
		float speed;
		
		if(enemyType == 1){
			health = 50;
			moneyReward = 10;
			speed = 1.5f;
			enemy = new Enemy("spider", health, moneyReward, speed);
			enemy.addWaypoint(Arrays.asList(waypoints));
			enemy.setX(waypoints[0].x);
			enemy.setY(waypoints[0].y);
		}
		else if (enemyType == 2){
			//TODO skeleton stats
			
		}
			
		
		return enemy;
		
	}

}