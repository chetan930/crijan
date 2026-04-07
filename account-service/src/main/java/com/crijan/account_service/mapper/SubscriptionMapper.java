package com.crijan.account_service.mapper;

import com.crijan.account_service.dto.subscription.SubscriptionResponse;
import com.crijan.account_service.entity.Plan;
import com.crijan.account_service.entity.Subscription;
import com.crijan.common_library.dto.PlanDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubscriptionMapper {

    SubscriptionResponse toSubscriptionResponse(Subscription subscription);

    PlanDto toPlanResponse(Plan plan);
}
