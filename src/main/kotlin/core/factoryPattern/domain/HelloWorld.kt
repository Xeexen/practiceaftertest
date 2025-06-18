package core.factoryPattern.domain

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.UUID

@Entity
data class HelloWorld(
    @Id
    val id: String = UUID.randomUUID().toString(),
    val message: String
){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as HelloWorld

        if (id != other.id) return false
        if (message != other.message) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + message.hashCode()
        return result
    }

    override fun toString(): String {
        return "HelloWorld(id='$id', message='$message')"
    }


}
