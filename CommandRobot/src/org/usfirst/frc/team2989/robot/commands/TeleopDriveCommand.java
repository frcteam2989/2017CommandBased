package org.usfirst.frc.team2989.robot.commands;

import org.usfirst.frc.team2989.robot.Robot;
import org.usfirst.frc.team2989.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TeleopDriveCommand extends Command {
	
	public TeleopDriveCommand() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.driveTrain);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.driveTrain.driveRobot(Robot.oi.getXboxController().getRawAxis(RobotMap.JOYSTICK_LEFT_X), Robot.oi.getXboxController().getRawAxis(RobotMap.JOYSTICK_LEFT_Y), Robot.oi.getXboxController().getRawAxis(RobotMap.JOYSTICK_RIGHT_X), Robot.gyro.getAngle());
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
