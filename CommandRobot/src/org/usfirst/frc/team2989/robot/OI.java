package org.usfirst.frc.team2989.robot;

import org.usfirst.frc.team2989.robot.commands.HalfLiftCommand;
import org.usfirst.frc.team2989.robot.commands.LiftCommand;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);
	// Joystick joystick1;
	// Joystick joystick2;
	Joystick joystick1;
	Joystick joystick2;
	CameraServer lifecam;
	Button aButton;
	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	
	
	public Joystick getXboxController() {
		return joystick1;
	}
	
	public Joystick getJoystick2() {
		return joystick2;
	}



	public OI() {
		super();
		joystick1  = new Joystick(RobotMap.JOYSTICK_PORT);
		joystick2 = new Joystick(1);
		lifecam = CameraServer.getInstance();
		lifecam.startAutomaticCapture("cam0", "/dev/video0");
		Button aButton = new JoystickButton(joystick1, 1);
		Button bButton = new JoystickButton(joystick1, 2);
		aButton.whileHeld(new LiftCommand());
		bButton.whileHeld(new HalfLiftCommand());
	}

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.

	// button.whenReleased(new ExampleCommand());
	
	
}
