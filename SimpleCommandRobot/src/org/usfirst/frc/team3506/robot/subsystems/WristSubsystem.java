package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.RobotMap;
import org.usfirst.frc.team3506.robot.commands.UserWristCommand;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class WristSubsystem extends Subsystem {

    WPI_TalonSRX wristTalon;
    
    public WristSubsystem() {
        wristTalon = new WPI_TalonSRX(RobotMap.WRIST_TALON_PORT);
    }
    
    public void moveWrist(double power) {
        wristTalon.set(-power);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new UserWristCommand());
    }
}

