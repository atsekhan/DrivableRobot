// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class ShuffleboardSubsystem extends SubsystemBase {
  /** Creates a new ShuffleboardSubsystem. */

  private NetworkTableEntry maxSpeed;
  private ShuffleboardLayout encoders;
  private DriveSubsystem shuffleboardds;

  public ShuffleboardSubsystem() {
    setDriveSubsystemControls();
  }

  public void setDriveSubsystemControls() {
    // Add a 'max speed' widget to a tab named 'Configuration', using a number
    // slider
    // The widget will be placed in the second column and row and will be TWO
    // columns wide
    maxSpeed = Shuffleboard.getTab("Configuration").add("Max Speed", 1).withWidget("Number Slider").withPosition(1, 1)
        .withSize(2, 1).getEntry();
  }

  public void setDriveSubsystemTelemetry(DriveSubsystem ds) {
    // Add the tank drive and encoders to a 'Drivebase' tab
    ShuffleboardTab driveBaseTab = Shuffleboard.getTab("Drivebase");

    // Rememver the reference to the driveSubsystem
    shuffleboardds = ds;

    driveBaseTab.add("Tank Drive", shuffleboardds);
    // Put both encoders in a list layout
    encoders = driveBaseTab.getLayout("List Layout", "Encoders").withPosition(0, 0).withSize(2, 2);
    encoders.add("Left Encoder", ds.leftDriveTalonFX[0]);
    encoders.add("Right Encoder", ds.rightDriveTalonFX[0]);
  }

  // public void updateDriveSubsystemTelemetry() {
  // encoders.
  // add("Left Encoder", shuffleboardds.getLeftEncoder());
  // encoders.add("Right Encoder", shuffleboardds.getRightEncoder());
  // }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
