/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3506.robot;

import org.usfirst.frc.team3506.robot.commands.DriveForwardCommand;
import org.usfirst.frc.team3506.robot.commands.IntakeFlywheelsCommand;
import org.usfirst.frc.team3506.robot.commands.LiftElevatorCommand;
import org.usfirst.frc.team3506.robot.commands.LowerElevatorCommand;
import org.usfirst.frc.team3506.robot.commands.OuttakeFlywheelsCommand;
import org.usfirst.frc.team3506.robot.commands.ShiftDownCommand;
import org.usfirst.frc.team3506.robot.commands.ShiftUpCommand;
import org.usfirst.frc.team3506.robot.commands.ToggleClampCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private Joystick leftJoystick, rightJoystick, secondaryJoystick;
	
	public OI() {
	    leftJoystick = new Joystick(RobotMap.LEFT_JOYSTICK_PORT);
	    rightJoystick = new Joystick(RobotMap.RIGHT_JOYSTICK_PORT);
	    secondaryJoystick = new Joystick(RobotMap.SECONDARY_JOYSTICK_PORT);
	    
	    JoystickButton left1 = new JoystickButton(leftJoystick, 1);
	    JoystickButton left2 = new JoystickButton(leftJoystick, 2);
	    
	    JoystickButton right1 = new JoystickButton(rightJoystick, 1);
	    
	    JoystickButton secondary1 = new JoystickButton(secondaryJoystick, 1);
	    JoystickButton secondary2 = new JoystickButton(secondaryJoystick, 2);
	    JoystickButton secondary4 = new JoystickButton(secondaryJoystick, 4);
	    JoystickButton secondary3 = new JoystickButton(secondaryJoystick, 3);
	    JoystickButton secondary5 = new JoystickButton(secondaryJoystick, 5);
	    
	    left1.whenPressed(new ShiftDownCommand());
	    left2.whenPressed(new DriveForwardCommand(0.5, 0.5, 1.5));
	    
	    right1.whenPressed(new ShiftUpCommand());
	    
	    secondary1.whileHeld(new IntakeFlywheelsCommand());
	    secondary2.whileHeld(new OuttakeFlywheelsCommand());
	    secondary3.whileHeld(new LowerElevatorCommand());
	    secondary4.whenPressed(new ToggleClampCommand());
	    secondary5.whileHeld(new LiftElevatorCommand());
	}
	
	public double getLeftY() {
	    return -leftJoystick.getY();
	}
	
	public double getLeftX() {
	    return leftJoystick.getX();
	}
	
	public double getRightY() {
	    return -rightJoystick.getY();
	}
	
	public double getRightX() {
	    return rightJoystick.getX();
	}
	
	public double getSecondaryY() {
	    return -secondaryJoystick.getY();
	}
}
