package teamroots.goetia.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ModelFiend extends ModelBase {
    ModelRenderer head1;
    ModelRenderer horn1;
    ModelRenderer horn2;
    ModelRenderer horn3;
    ModelRenderer horn4;
    ModelRenderer body1;
    ModelRenderer armR1;
    ModelRenderer armL1;
    ModelRenderer armR2;
    ModelRenderer armL2;
    ModelRenderer legR1;
    ModelRenderer legL1;
    ModelRenderer legR2;
    ModelRenderer legL2;
    ModelRenderer wingL1;
    ModelRenderer wingL2;
    ModelRenderer wingL3;
    ModelRenderer wingL4;
    ModelRenderer wingR3;
    ModelRenderer wingR2;
    ModelRenderer wingR1;
    ModelRenderer wingR4;
    
    public ModelFiend()
    {
        textureWidth = 128;
        textureHeight = 64;
        
          head1 = new ModelRenderer(this, 0, 0);
          head1.addBox(-4F, -4F, -4F, 8, 8, 8);
          head1.setRotationPoint(0F, -4F, 0F);
          head1.setTextureSize(128, 64);
          head1.mirror = true;
          setRotation(head1, 0F, 0F, 0F);
          horn1 = new ModelRenderer(this, 48, 0);
          horn1.addBox(-1F, -6F, -1F, 2, 6, 2);
          horn1.setRotationPoint(-3F, -7F, -1.5F);
          horn1.setTextureSize(128, 64);
          horn1.mirror = true;
          setRotation(horn1, 1.047198F, 2.094395F, 0F);
          horn2 = new ModelRenderer(this, 48, 0);
          horn2.addBox(-1F, -6F, -1F, 2, 6, 2);
          horn2.setRotationPoint(3F, -7F, -1.5F);
          horn2.setTextureSize(128, 64);
          horn2.mirror = true;
          setRotation(horn2, 1.047198F, -2.094395F, 0F);
          horn3 = new ModelRenderer(this, 32, 0);
          horn3.addBox(-1F, -6F, -1F, 2, 5, 2);
          horn3.setRotationPoint(-2.5F, -6.5F, 0.5F);
          horn3.setTextureSize(128, 64);
          horn3.mirror = true;
          setRotation(horn3, 1.047198F, 2.617994F, 0F);
          horn4 = new ModelRenderer(this, 32, 0);
          horn4.addBox(-1F, -6F, -1F, 2, 5, 2);
          horn4.setRotationPoint(2.5F, -6.5F, 0.5F);
          horn4.setTextureSize(128, 64);
          horn4.mirror = true;
          setRotation(horn4, 1.047198F, -2.617994F, 0F);
          body1 = new ModelRenderer(this, 0, 16);
          body1.addBox(-4F, 0F, -2F, 7, 11, 4);
          body1.setRotationPoint(0.5F, -1F, 0F);
          body1.setTextureSize(128, 64);
          body1.mirror = true;
          setRotation(body1, 0.1308997F, 0F, 0F);
          armR1 = new ModelRenderer(this, 16, 32);
          armR1.addBox(-3F, -3F, -3F, 6, 6, 6);
          armR1.setRotationPoint(-6F, 0F, 0F);
          armR1.setTextureSize(128, 64);
          armR1.mirror = true;
          setRotation(armR1, 0F, 0F, -0.2617994F);
          armR2 = new ModelRenderer(this, 0, 32);
          armR2.addBox(-2F, 0F, -2F, 4, 7, 4);
          armR2.setRotationPoint(-0.5F, 2F, 0.5F);
          armR2.setTextureSize(128, 64);
          armR2.mirror = true;
          setRotation(armR2, -0.2617994F, 0F, 2f*0.2617994F);
          armL1 = new ModelRenderer(this, 16, 32);
          armL1.addBox(-3F, -3F, -3F, 6, 6, 6);
          armL1.setRotationPoint(6F, 0F, 0F);
          armL1.setTextureSize(128, 64);
          armL1.mirror = true;
          setRotation(armL1, 0F, 0F, 0.2617994F);
          armL2 = new ModelRenderer(this, 0, 32);
          armL2.addBox(-2F, 0F, -2F, 4, 7, 4);
          armL2.setRotationPoint(0.5F, 2F, 0.5F);
          armL2.setTextureSize(128, 64);
          armL2.mirror = true;
          setRotation(armL2, -0.2617994F, 0F, -2f*0.2617994F);
          legR1 = new ModelRenderer(this, 16, 32);
          legR1.addBox(-3F, 0F, -3F, 6, 6, 6);
          legR1.setRotationPoint(-2.5F, 9F, 1F);
          legR1.setTextureSize(128, 64);
          legR1.mirror = true;
          setRotation(legR1, -0.2617994F, 0F, 0.2617994F);
          legR2 = new ModelRenderer(this, 0, 32);
          legR2.addBox(-2F, 0F, -2F, 4, 7, 4);
          legR2.setRotationPoint(0F, 5F, 0.5F);
          legR2.setTextureSize(128, 64);
          legR2.mirror = true;
          setRotation(legR2, 2F*0.2617994F, 0F, -0.1308997F);
          legL1 = new ModelRenderer(this, 16, 32);
          legL1.addBox(-3F, 0F, -3F, 6, 6, 6);
          legL1.setRotationPoint(2.5F, 9F, 1F);
          legL1.setTextureSize(128, 64);
          legL1.mirror = true;
          setRotation(legL1, -0.2617994F, 0F, -0.2617994F);
          legL2 = new ModelRenderer(this, 0, 32);
          legL2.addBox(-2F, 0F, -2F, 4, 7, 4);
          legL2.setRotationPoint(0F, 5F, 0.5F);
          legL2.setTextureSize(128, 64);
          legL2.mirror = true;
          setRotation(legL2, 2F*0.2617994F, 0F, 0.1308997F);
          wingL1 = new ModelRenderer(this, 48, 32);
          wingL1.addBox(-1.5F, 0F, -1.5F, 3, 12, 3);
          wingL1.setRotationPoint(2F, 1F, 1.5F);
          wingL1.setTextureSize(128, 64);
          wingL1.mirror = true;
          setRotation(wingL1, 2.356194F, 0.5235988F, 0F);
          wingL2 = new ModelRenderer(this, 32, 16);
          wingL2.addBox(-2.5F, 8.5F, -2.5F, 5, 5, 5);
          wingL2.setRotationPoint(2F, 1F, 1.5F);
          wingL2.setTextureSize(128, 64);
          wingL2.mirror = true;
          setRotation(wingL2, 2.356194F, 0.5235988F, 0F);
          wingL3 = new ModelRenderer(this, 64, 0);
          wingL3.addBox(-1.5F, 9.5F, -10.5F, 3, 3, 12);
          wingL3.setRotationPoint(2F, 1F, 1.5F);
          wingL3.setTextureSize(128, 64);
          wingL3.mirror = true;
          setRotation(wingL3, 2.356194F, 0.5235988F, 0F);
          wingL4 = new ModelRenderer(this, 96, 16);
          wingL4.addBox(-1.5F, 0.5F, -9.5F, 1, 9, 9);
          wingL4.setRotationPoint(3F, 1F, 1.5F);
          wingL4.setTextureSize(128, 64);
          wingL4.mirror = true;
          setRotation(wingL4, 2.356194F, 0.5235988F, 0F);
          wingR1 = new ModelRenderer(this, 48, 32);
          wingR1.addBox(-1.5F, 0F, -1.5F, 3, 12, 3);
          wingR1.setRotationPoint(-2F, 1F, 1.5F);
          wingR1.setTextureSize(128, 64);
          wingR1.mirror = true;
          setRotation(wingR1, 2.356194F, -0.5235988F, 0F);
          wingR2 = new ModelRenderer(this, 32, 16);
          wingR2.addBox(-2.5F, 8.5F, -2.5F, 5, 5, 5);
          wingR2.setRotationPoint(-2F, 1F, 1.5F);
          wingR2.setTextureSize(128, 64);
          wingR2.mirror = true;
          setRotation(wingR2, 2.356194F, -0.5235988F, 0F);
          wingR3 = new ModelRenderer(this, 64, 0);
          wingR3.addBox(-1.5F, 9.5F, -10.5F, 3, 3, 12);
          wingR3.setRotationPoint(-2F, 1F, 1.5F);
          wingR3.setTextureSize(128, 64);
          wingR3.mirror = true;
          setRotation(wingR3, 2.356194F, -0.5235988F, 0F);
          wingR4 = new ModelRenderer(this, 96, 16);
          wingR4.addBox(0.5F, 0.5F, -9.5F, 1, 9, 9);
          wingR4.setRotationPoint(-3F, 1F, 1.5F);
          wingR4.setTextureSize(128, 64);
          wingR4.mirror = true;
          setRotation(wingR4, 2.356194F, -0.5235988F, 0F);
        
        legL1.addChild(legL2);
        legR1.addChild(legR2);
        armL1.addChild(armL2);
        armR1.addChild(armR2);
    }
    
    public void render(Entity entity, float f, float f1, float age, float f3, float f4, float f5)
    {
      float speed = (float) ((new Vec3d(entity.motionX,0,entity.motionZ)).lengthVector() * 3.0f);
      GlStateManager.translate(0, 0.15, 0);
      super.render(entity, f, f1, age, f3, f4, f5);
      setRotationAngles(f, f1, age, f3, f4, f5);
      head1.render(f5);
      body1.render(f5);
      horn1.render(f5);
      horn2.render(f5);
      GlStateManager.rotate(speed*60f*(float) Math.sin(Math.toRadians(age % 360)*24F), 1, 0, 0);
      armR1.render(f5);
      GlStateManager.rotate(-120f*speed*(float) Math.sin(Math.toRadians(age % 360)*24F), 1, 0, 0);
      armL1.render(f5);
      GlStateManager.rotate(speed*60f*(float) Math.sin(Math.toRadians(age % 360)*24F), 1, 0, 0);
      GlStateManager.rotate(speed*60f*(float) Math.sin(Math.toRadians(age % 360)*24F), 1, 0, 0);
      legL1.render(f5);
      GlStateManager.rotate(-120f*speed*(float) Math.sin(Math.toRadians(age % 360)*24F), 1, 0, 0);
      legR1.render(f5);
      GlStateManager.rotate(speed*60f*(float) Math.sin(Math.toRadians(age % 360)*24F), 1, 0, 0);
      GlStateManager.rotate(30F*(float)Math.abs(Math.sin(Math.toRadians(age % 360)*15F)), 0, 1, 0);
      wingL1.render(f5);
      wingL2.render(f5);
      wingL3.render(f5);
      wingL4.render(f5);
      GlStateManager.rotate(-60F*(float)Math.abs(Math.sin(Math.toRadians(age % 360)*15F)), 0, 1, 0);
      wingR1.render(f5);
      wingR2.render(f5);
      wingR3.render(f5);
      wingR4.render(f5);
      GlStateManager.rotate(30F*(float)Math.abs(Math.sin(Math.toRadians(age % 360)*15F)), 0, 1, 0);
      GlStateManager.translate(0, -0.15, 0);
    }
    
    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
      super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
    }
}
