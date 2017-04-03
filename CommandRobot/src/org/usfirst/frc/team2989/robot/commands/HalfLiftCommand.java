package org.usfirst.frc.team2989.robot.commands;

import org.usfirst.frc.team2989.robot.OI;
import org.usfirst.frc.team2989.robot.Robot;
import org.usfirst.frc.team2989.robot.subsystems.LiftMechanism;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class HalfLiftCommand extends Command {
	double howLong;
    public HalfLiftCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.liftMechanism);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	SmartDashboard.putString("Active Command", "Lift Mechanism");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.liftMechanism.runLift(.5);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        	return false;
        }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.liftMechanism.runLift(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.liftMechanism.stopLift();
    }
}
