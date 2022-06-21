package com.example.finimopaymentlib.models.builderobjects.mainobj

import com.example.finimopaymentlib.enums.LaunchTypes


class LaunchType(var operationType: LaunchTypes) {

    data class Builder(var operationType: LaunchTypes) {

        fun operationType(operationType: LaunchTypes) =
            apply { this.operationType = operationType }

        fun build() = LaunchType(operationType)
    }

}