package Module6.Part8.common;

import java.io.Serializable;

public class Payload implements Serializable {
    // read https://www.baeldung.com/java-serial-version-uid
    private static final long serialVersionUID = 3L;// change this if the class changes

    /**
     * Determines how to process the data on the receiver's side
     */
    private PayloadType payloadType;

    public PayloadType getPayloadType() {
        return payloadType;
    }

    public void setPayloadType(PayloadType payloadType) {
        this.payloadType = payloadType;
    }

    /**
     * Who the payload is from
     */
    private String clientName;//who the payload is from, mmd23 31431631 04/05/2023

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    private long clientId;

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    /**
     * Generic text based message
     */
    private String message;//string containing the message,  mmd23 31631431 04/05/2023


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Generic number for example sake
     */
    private int number;//example of other possibel data types 

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {//To string prints class name and hash but gets overridden
        return String.format("ClientId[%s], ClientName[%s], Type[%s], Number[%s], Message[%s]", getClientId(),
                getClientName(), getPayloadType().toString(), getNumber(),
                getMessage());
    }
}