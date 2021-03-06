// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.Constants.DriveConstants;
import frc.robot.Constants.RobotProperties;
import edu.wpi.first.wpilibj.GenericHID;

public class DriveManuallyCommand extends CommandBase {
  /** Creates a new DriveManuallyCommand. */
  public DriveManuallyCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.driveSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    double move = 0, turn = 0;
    switch (RobotProperties.driveInterface) {
      case SPLITSTICK: // add 2 sticks
        move = RobotContainer.driveStick.getY(GenericHID.Hand.kLeft) * (-1);
        turn = RobotContainer.turnStick.getX(GenericHID.Hand.kRight);
      case ONESTICK:
        move = RobotContainer.driveStick.getY(GenericHID.Hand.kLeft) * (-1);
        turn = RobotContainer.driveStick.getX(GenericHID.Hand.kRight);
        break;
      case XBOXANDSTICK: // 1 stick and XBOX controller are created
      case XBOX: // just the XBOX controller
        move = RobotContainer.xboxController.getY(GenericHID.Hand.kRight);
        turn = RobotContainer.xboxController.getX(GenericHID.Hand.kRight);
        break;
    }

    RobotContainer.driveSubsystem.manualDrive(move, turn * DriveConstants.turnAdjust);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
