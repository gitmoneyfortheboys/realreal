package invaders.entities;

import invaders.physics.Vector2D;

public abstract class ProjectileFactory {
    public abstract Projectile createProjectile(Vector2D position, Projectile.ProjectileType type);
}
