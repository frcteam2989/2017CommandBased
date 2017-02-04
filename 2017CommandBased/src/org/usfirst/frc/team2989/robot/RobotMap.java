package org.usfirst.frc.team2989.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	public static int JOYSTICK_PORT = 0;
	public static int MOTOR_LEFT_FRONT = 5;
	public static int MOTOR_RIGHT_FRONT = 2;
	public static int MOTOR_LEFT_REAR = 3;
	public static int MOTOR_RIGHT_REAR = 4;
	public static int JOYSTICK_LEFT_X = 0;
	public static int JOYSTICK_RIGHT_X = 2;
	public static int JOYSTICK_LEFT_Y = 1;
	public static int JOYSTICK_RIGHT_Y = 3;
	public static int ANALOG_PORT = 1;
	public static int CAMERA_PORT = 3;
}
