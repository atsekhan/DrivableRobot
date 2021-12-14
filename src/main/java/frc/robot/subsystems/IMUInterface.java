package frc.robot.subsystems;

import edu.wpi.first.wpilibj.geometry.Rotation2d;

public interface IMUInterface {
    double getPitch();

    double getRoll();

    double getYaw();

    double zeroYaw();

    Rotation2d getHeading();
}
