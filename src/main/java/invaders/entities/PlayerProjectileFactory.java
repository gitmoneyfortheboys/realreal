package invaders.entities;

import invaders.physics.Vector2D;

public class PlayerProjectileFactory extends ProjectileFactory {
    @Override
    public Projectile createProjectile(Vector2D position, Projectile.ProjectileType type) {
        return new Projectile(position, Projectile.ProjectileType.PLAYER);
    }
}
