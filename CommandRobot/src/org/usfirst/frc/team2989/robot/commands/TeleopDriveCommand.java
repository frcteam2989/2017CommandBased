package org.usfirst.frc.team2989.robot.commands;

import org.usfirst.frc.team2989.robot.Robot;
import org.usfirst.frc.team2989.robot.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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
		SmartDashboard.putNumber("Joystick X", Robot.oi.getXboxController().getRawAxis(RobotMap.JOYSTICK_LEFT_X));
		SmartDashboard.putNumber("Joystick Y", Robot.oi.getXboxController().getRawAxis(RobotMap.JOYSTICK_RIGHT_X));
		SmartDashboard.putNumber("Joystick Rotation", Robot.oi.getXboxController().getRawAxis(RobotMap.JOYSTICK_LEFT_Y));
		SmartDashboard.putNumber("Gyro Value", Robot.gyro.getAngle());
		Robot.driveTrain.driveRobot(Robot.oi.getXboxController().getRawAxis(RobotMap.JOYSTICK_LEFT_X), Robot.oi.getXboxController().getRawAxis(RobotMap.JOYSTICK_RIGHT_X), Robot.oi.getXboxController().getRawAxis(RobotMap.JOYSTICK_LEFT_Y), Robot.gyro.getAngle());
		Timer.delay(.02);
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
