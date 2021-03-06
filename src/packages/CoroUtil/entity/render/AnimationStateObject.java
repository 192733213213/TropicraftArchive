package CoroUtil.entity.render;

public class AnimationStateObject {

	public String name;
	
	public float rotateAngleX;
    public float rotateAngleY;
    public float rotateAngleZ;
    
    //interpolate
    public float rotateAngleXPrev;
    public float rotateAngleYPrev;
    public float rotateAngleZPrev;
	
    //smooth animation help
    public float rotateAngleXDesired;
    public float rotateAngleYDesired;
    public float rotateAngleZDesired;
    public float rotateAngleMaxRatePerTick = 5;
    
    public AnimationStateObject(String parName) {
    	name = parName;
    }
}
