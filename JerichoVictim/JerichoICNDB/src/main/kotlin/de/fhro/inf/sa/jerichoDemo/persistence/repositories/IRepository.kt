package de.fhro.inf.sa.jerichoDemo.persistence.repositories

import io.github.jklingsporn.vertx.jooq.async.future.AsyncJooqSQLClient
import java.util.concurrent.CompletableFuture

/**
 * @author Peter Kurfer
 * Created on 10/30/17.
 */
interface IRepository<T, in TId> {

	fun insertAsync(entity: T): CompletableFuture<Int>

	fun updateAsync(entity: T): CompletableFuture<Int>

	fun dropAsync(entity: T): CompletableFuture<Int>

	fun findAsync(id: TId): CompletableFuture<T>

	fun findAllAsync(pageIndex: Int, pageSize: Int): CompletableFuture<List<T>>

	fun countAsync(): CompletableFuture<Long>

	fun existsAsync(id: TId): CompletableFuture<Boolean>

	fun setClient(asyncJooqSQLClient: AsyncJooqSQLClient)
}