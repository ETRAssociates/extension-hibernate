package org.lucee.extension.orm.hibernate.event;

import org.hibernate.event.PostDeleteEvent;
import org.hibernate.event.PostDeleteEventListener;
import org.lucee.extension.orm.hibernate.CommonUtil;

import lucee.runtime.Component;

public class PostDeleteEventListenerImpl extends EventListener implements PostDeleteEventListener {

	private static final long serialVersionUID = -4882488527866603549L;

	public PostDeleteEventListenerImpl(Component component) {
	    super(component, CommonUtil.POST_DELETE, false);
	}

	@Override
	public void onPostDelete(PostDeleteEvent event) {
    	invoke(CommonUtil.POST_DELETE, event.getEntity());
    }

}