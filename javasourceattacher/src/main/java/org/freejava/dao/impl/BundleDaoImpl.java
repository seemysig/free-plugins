package org.freejava.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import org.freejava.dao.BundleDao;
import org.freejava.model.Bundle;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class BundleDaoImpl extends GenericDaoImpl<Bundle, Long> implements BundleDao {


}
