package edu.hitsz.remoting.command.body.request;

import edu.hitsz.remoting.command.body.AbstractRemotingCommandBody;

/**
 * Created by Neuclil on 17-4-20.
 */
public class StartRequestBody extends AbstractRemotingCommandBody{
    private int id;

    public StartRequestBody(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void checkFields() throws Exception {

    }
}
