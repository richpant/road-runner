package com.acmerobotics.roadrunner.trajectory.constraints

import com.acmerobotics.roadrunner.geometry.Pose2d

class MinVelocityConstraint(
    private val constraints: List<TrajectoryVelocityConstraint>
) : TrajectoryVelocityConstraint {
    override fun get(s: Double, pose: Pose2d, deriv: Pose2d, secondDeriv: Pose2d, baseVel: Pose2d) =
        constraints.map { it[s, pose, deriv, secondDeriv, baseVel] }.minOrNull()!!
}