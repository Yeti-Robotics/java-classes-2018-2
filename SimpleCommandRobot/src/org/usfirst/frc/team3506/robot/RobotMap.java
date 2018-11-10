/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3506.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static final int LEFT_1_PORT = 0;
	public static final int LEFT_2_PORT = 1;
    public static final int LEFT_3_PORT = 2;
    public static final int RIGHT_1_PORT = 3;
    public static final int RIGHT_2_PORT = 4;
    public static final int RIGHT_3_PORT = 5;

    public static final int LEFT_JOYSTICK_PORT = 0;
    public static final int RIGHT_JOYSTICK_PORT = 1;
    public static final int SECONDARY_JOYSTICK_PORT = 2;
    
    public static final int[] GEAR_SHIFT_SOLENOID = { 6, 7 };
    
    public static final int WRIST_TALON_PORT = 2;
    
    public static final int LEFT_ELEVATOR_TALON_PORT = 5;
    public static final int RIGHT_ELEVATOR_TALON_PORT = 6;
    public static final double ELEVATOR_LIFT_POWER = 1;
    public static final double ELEVATOR_LOWER_POWER = -0.75;
    public static final double ELEVATOR_STOP_POWER = 0;
    
    public static final int LEFT_FLYWHEEL_PORT = 3;
    public static final int RIGHT_FLYWHEEL_PORT = 4;
    
    public static final int[] CLAMP_CUBE_SOLENOID_PORTS = { 0, 1 };
}
