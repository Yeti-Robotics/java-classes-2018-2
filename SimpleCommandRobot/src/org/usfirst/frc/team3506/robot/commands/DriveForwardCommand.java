package org.usfirst.frc.team3506.robot.commands;

import org.usfirst.frc.team3506.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveForwardCommand extends Command {

    double leftSpeed, rightSpeed, time;
    
    public DriveForwardCommand(double leftSpeed, double rightSpeed, double time) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        this.leftSpeed = leftSpeed;
        this.rightSpeed = rightSpeed;
        this.time = time;
        requires(Robot.drivetrainSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        setTimeout(time);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.drivetrainSubsystem.drive(leftSpeed, rightSpeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.drivetrainSubsystem.drive(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
