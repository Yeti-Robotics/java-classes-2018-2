package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GearShiftSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    DoubleSolenoid shifter;
    
    public GearShiftSubsystem() {
        shifter = new DoubleSolenoid(RobotMap.GEAR_SHIFT_SOLENOID[0], RobotMap.GEAR_SHIFT_SOLENOID[1]);
    }
    
    public void shiftUp() {
        shifter.set(Value.kForward);
    }
    
    public void shiftDown() {
        shifter.set(Value.kReverse);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

