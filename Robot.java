package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.commands.LiftCommand;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.*;


public class Robot extends TimedRobot {



  public static LiftSubsystem liftExSubsystem;
  public static LiftCommand liftExCommand;

  @Override
  public void robotInit() {
    RobotMap.init();
    OI.init();
   LiftSubsystem ls = new LiftSubsystem();

    LiftCommand lc = new LiftCommand();

  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }
}

