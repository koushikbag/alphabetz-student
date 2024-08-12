package com.alphabetz.students.model

data class Student(
    var studentId: String,
    var fullName:String? = null,
    var firstName:String? = null,
    var lastName:String? = null,
    var classStudyIn:String? = null,
    var mobileNumber:String? = null,
    var address:String? = null,
    var monthlyPay:String? = null,
    var board:String? = null,
    var lastPaymentDate:String? = null,
    var fathersName:String? = null,
    var specialAttentionNeeded:String? = null,
    var dateOfJoining:String? = null,
    var advancePayment:String? = null,
)
