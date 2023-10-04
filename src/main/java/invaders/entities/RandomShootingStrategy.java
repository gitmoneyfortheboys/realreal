package invaders.entities;

import java.util.Random;
import invaders.engine.GameEngine;

public class RandomShootingStrategy implements ProjectileStrategy {
    private Random random = new Random();
    private static final int SHOOT_PROBABILITY = 5;  // 1 in 5 chance to shoot
    private GameEngine gameEngine;

    public RandomShootingStrategy(GameEngine gameEngine) {
        this.gameEngine = gameEngine;
    }

    @Override
    public void shoot(Enemy enemy) {
        if (gameEngine.getEnemyProjectilesCount() < 3 && random.nextInt(100) < SHOOT_PROBABILITY) {
            Projectile projectile = new Projectile(enemy.getPosition(), Projectile.ProjectileType.ENEMY);
            gameEngine.addProjectile(projectile);
        }
    }
}
