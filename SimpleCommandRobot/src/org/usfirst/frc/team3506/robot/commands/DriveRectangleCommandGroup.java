package org.usfirst.frc.team3506.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DriveRectangleCommandGroup extends CommandGroup {

    public DriveRectangleCommandGroup() {
        addSequential(new DriveForwardCommand(0.5, 0.5, 1.5));
        addSequential(new DriveForwardCommand(0.4, -0.4, 0.5));
        

        addSequential(new DriveForwardCommand(0.5, 0.5, 1.5));
        addSequential(new DriveForwardCommand(0.4, -0.4, 0.5));
        

        addSequential(new DriveForwardCommand(0.5, 0.5, 1.5));
        addSequential(new DriveForwardCommand(0.4, -0.4, 0.5));
        

        addSequential(new DriveForwardCommand(0.5, 0.5, 1.5));
        addSequential(new DriveForwardCommand(0.4, -0.4, 0.5));
    }
}
