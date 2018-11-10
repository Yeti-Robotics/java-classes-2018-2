package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.RobotMap;
import org.usfirst.frc.team3506.robot.commands.UserDriveCommand;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class DrivetrainSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Spark left1, left2, left3;
    Spark right1, right2, right3;
    DifferentialDrive drive;
    
    public DrivetrainSubsystem() {
        left1 = new Spark(RobotMap.LEFT_1_PORT);
        left2 = new Spark(RobotMap.LEFT_2_PORT);
        left3 = new Spark(RobotMap.LEFT_3_PORT);
        right1 = new Spark(RobotMap.RIGHT_1_PORT);
        right2 = new Spark(RobotMap.RIGHT_2_PORT);
        right3 = new Spark(RobotMap.RIGHT_3_PORT);
        
        SpeedControllerGroup leftMotors = new SpeedControllerGroup(left1, left2, left3);
        SpeedControllerGroup rightMotors = new SpeedControllerGroup(right1, right2, right3);
        
        drive = new DifferentialDrive(leftMotors, rightMotors);
        
        left2.setInverted(true);
        left3.setInverted(true);
        right1.setInverted(true);
    }
    
    public void drive(double leftSpeed, double rightSpeed) {
        leftSpeed = -leftSpeed;
        rightSpeed = -rightSpeed;
        
        left1.set(leftSpeed);
        left2.set(leftSpeed);
        left3.set(leftSpeed);
        
        right1.set(rightSpeed);
        right2.set(rightSpeed);
        right3.set(rightSpeed);
    }
    
    public void arcadeDrive(double forwardSpeed, double turnSpeed) {
        drive.arcadeDrive(forwardSpeed, turnSpeed);
    }
    
    public void cheezyDrive(double forwardSpeed, double turnSpeed) {
        drive.curvatureDrive(forwardSpeed, turnSpeed, true);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new UserDriveCommand());
    }
}

