package com.example.finimopaymentlib.listners

import com.example.finimopaymentlib.models.responsemodels.TransactionSearchResponse

interface TransactionListener {

    fun transactionStarted()
    fun transactionCompleted(objectResponse: TransactionSearchResponse)
//    fun sessionInitialized(sessionResponseObject: SessionResponseObject)
//    fun searchTransactionCompleted(searchTransactionResultObject: SearchTransactionResultObject?)
//    fun lastTransactionCompleted(lastTransactionResultObjec: SearchTransactionResultObject?)
//    fun internetNotConnected()
//    fun errorOccured(errorString : String)
//    fun rkiInitialized()
//}
}