package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class FlywheelSubsystem extends Subsystem {

    WPI_TalonSRX leftFlywheel, rightFlywheel;
    
    public FlywheelSubsystem() {
        leftFlywheel = new WPI_TalonSRX(RobotMap.LEFT_FLYWHEEL_PORT);
        rightFlywheel = new WPI_TalonSRX(RobotMap.RIGHT_FLYWHEEL_PORT);
        
        leftFlywheel.setInverted(true);
    }
    
    public void intake() {
        leftFlywheel.set(1);
        rightFlywheel.set(1);
    }
    
    public void stop() {
        leftFlywheel.set(0);
        rightFlywheel.set(0);
    }
    
    public void outtake() {
        leftFlywheel.set(-0.75);
        rightFlywheel.set(-0.75);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

