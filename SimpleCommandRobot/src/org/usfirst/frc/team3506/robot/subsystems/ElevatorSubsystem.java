package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ElevatorSubsystem extends Subsystem {

    WPI_TalonSRX leftTalon, rightTalon;
    
    public ElevatorSubsystem() {
        leftTalon = new WPI_TalonSRX(RobotMap.LEFT_ELEVATOR_TALON_PORT);
        rightTalon = new WPI_TalonSRX(RobotMap.RIGHT_ELEVATOR_TALON_PORT);
        
        leftTalon.setInverted(true);
        rightTalon.setInverted(true);
    }
    
    public void liftElevator() {
        leftTalon.set(RobotMap.ELEVATOR_LIFT_POWER);
        rightTalon.set(RobotMap.ELEVATOR_LIFT_POWER);
    }
    
    public void stopElevator() {
        leftTalon.set(RobotMap.ELEVATOR_STOP_POWER);
        rightTalon.set(RobotMap.ELEVATOR_STOP_POWER);
    }
    
    public void lowerElevator() {
        leftTalon.set(RobotMap.ELEVATOR_LOWER_POWER);
        rightTalon.set(RobotMap.ELEVATOR_LOWER_POWER);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

