package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ClampSubsystem extends Subsystem {

    DoubleSolenoid clamp;
    
    public ClampSubsystem() {
        clamp = new DoubleSolenoid(RobotMap.CLAMP_CUBE_SOLENOID_PORTS[0], RobotMap.CLAMP_CUBE_SOLENOID_PORTS[1]);
    }
    
    public void clamp() {
        clamp.set(Value.kReverse);
    }
    
    public void unclamp() {
        clamp.set(Value.kForward);
    }
    
    public boolean isClamped() {
        return clamp.get() == Value.kReverse;
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

